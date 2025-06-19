package proyecto.model;

import proyecto.exceptions.BicicletaNoDisponible;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Bicicleteria {
  public static final Logger log = Logger.getLogger(Bicicleteria.class.getName());
  private ArrayList<Bicicleta> bicicletas;
  private float ganancias;
  private int cantidadDeVentas;

  public Bicicleteria() {
  }

  public Bicicleteria(float ganancias, int cantidadDeVentas, ArrayList<Bicicleta> bicicletas) {
    this.ganancias = ganancias;
    this.cantidadDeVentas = cantidadDeVentas;
    this.bicicletas = bicicletas;
  }

  //metodos
  public void agregarBicicleta(Bicicleta b) {
    if (bicicletas.size() < 1000) {
      bicicletas.add(b);
      log.info("Bicicleta agrgada al inventario" + b.getNroSerie());
    } else {
      log.info("Ya no se pueden agregar mas bicicletas");
    }
  }

  public void venderBicicleta(String nroSerie) throws BicicletaNoDisponible {
    Bicicleta encontrada = null;
    for (Bicicleta b : bicicletas) {
      if (b.getNroSerie().equalsIgnoreCase(nroSerie)) {
        encontrada = b;
        break;
      }
    }

    if (encontrada != null) {
      float precioFinal = encontrada.calcularPrecioFinal();
      ganancias += precioFinal;
      cantidadDeVentas++;
      bicicletas.remove(encontrada);
      log.info("Venta realizada. Precio final: $" + precioFinal);
    } else {
      throw new BicicletaNoDisponible("La bicicleta con nro de serie " + nroSerie + " no está en stock.");
    }
  }

  public void mostrarBicicletasDisponibles() {
    if (bicicletas.isEmpty()) {
      log.info("No hay bicicletas disponibles");
    } else {
      for (Bicicleta b : bicicletas) {
        log.info(b.getTipo() + " - " + b.getModelo() + " - " + b.getAnio() + " - $" + b.calcularPrecioFinal());
      }
    }
  }


}
