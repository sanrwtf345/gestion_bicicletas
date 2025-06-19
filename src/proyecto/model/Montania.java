package proyecto.model;

public class Montania extends Bicicleta {

  public Montania(String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);
  }

  //metodos
  @Override
  public String getTipo() {
    return "montaña";
  }

  @Override
  public float calcularPrecioFinal() {
    // 5% de descuento si es anterior a 2023
    return (getAnio() < 2023) ? getPrecio() * 0.95f : getPrecio();
  }
}
