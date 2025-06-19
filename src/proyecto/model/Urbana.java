package proyecto.model;

public class Urbana extends Bicicleta {
  public Urbana(String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);
  }

  @Override
  public String getTipo() {
    return "urbana";
  }

  @Override
  public float calcularPrecioFinal() {
    // 15% de descuento si es anterior a 2023
    return (getAnio() < 2023) ? getPrecio() * 0.85f : getPrecio();
  }
}
