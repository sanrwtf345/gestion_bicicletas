package proyecto.model;

public abstract class Bicicleta implements Vendible {

  private String nroSerie;
  private String modelo;
  private int anio;
  private float precio;

  protected Bicicleta() {
  }

  protected Bicicleta(String nroSerie, String modelo, int anio, float precio) {
    this.nroSerie = nroSerie;
    this.modelo = modelo;
    this.anio = anio;
    this.precio = precio;
  }

  //seters
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setNroSerie(String nroSerie) {
    this.nroSerie = nroSerie;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  //getters
  public String getNroSerie() {
    return nroSerie;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAnio() {
    return anio;
  }

  public float getPrecio() {
    return precio;
  }

  public String getTipo() {
    return "";
  }
}
