package proyecto.model;

public class Urbana extends Bicicleta {
  public Urbana(String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);
  }

  @Override
  public String getTipo() {
    return "urbana";
  }
}
