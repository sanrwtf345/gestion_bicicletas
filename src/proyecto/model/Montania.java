package proyecto.model;

public class Montania extends Bicicleta {

  public Montania(String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);
  }

  @Override
  public String getTipo() {
    return "montaña";
  }
}
