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


  }

  public void mostrarBicicletasDisponibles() {
    if (bicicletas.isEmpty()) {
      log.info("No hay bicicletas disponibles");
    } else {
      for (Bicicleta b : bicicletas) {
        log.info(b.getTipo() + b.getModelo() + b.getAnio() + b.getPrecio());//cambiar por precio final cuando se implemente
      }
    }
  }


}
