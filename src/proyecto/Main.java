package proyecto;

import proyecto.exceptions.BicicletaNoDisponible;
import proyecto.model.Bicicleteria;
import proyecto.model.Montania;
import proyecto.model.Ruta;
import proyecto.model.Urbana;

import java.util.logging.Logger;

public class Main {

  public static final Logger log = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    //creamos la bicicleteria
    Bicicleteria tienda = new Bicicleteria(0, 0, null);

    //creamos y agregamos las bicis al inventario
    tienda.agregarBicicleta(new Urbana("AA00258741", "Belmondo Urban Rodado 700c (Urbana)", 2022, 661800));
    tienda.agregarBicicleta(new Ruta("AB00285242", "Mountain bike Olmo Wish 290 Tourney TZ31 (Montaña)", 2024, 810877));
    tienda.agregarBicicleta(new Montania("AC00774422", "Mtb Overtech Q6 R29 Aluminio (Montaña)", 2021, 788999));

    //mostrar bicicletas disponibles
    log.info("Biciletas en stock:");
    tienda.mostrarBicicletasDisponibles();

    //vender bici exitosamente
    try {
      tienda.venderBicicleta("AB00285242");
    } catch (BicicletaNoDisponible e) {
      log.info("Error: " + e.getMessage());
    }

    //vender bici no existente
    try {
      tienda.venderBicicleta("666");
    } catch (BicicletaNoDisponible e) {
      log.warning(e.getMessage());
    }

    //stock actualizado
    log.info("Biciletas en stock:");
    tienda.mostrarBicicletasDisponibles();

    //resultados finales
    log.info("Cantidad de ventas: " + tienda.getCantidadDeVentas());
    log.info("Ganancia total: " + tienda.getGanancias());

  }
}