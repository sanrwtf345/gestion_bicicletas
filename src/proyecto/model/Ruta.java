package proyecto.model;

public class Ruta extends Bicicleta {
  public Ruta(String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);
  }

  //metodos
  @Override
  public String getTipo() {
    return "ruta";
  }

  @Override
  public float calcularPrecioFinal() {
    // 10% de descuento si es anterior a 2023
    return (getAnio() < 2023) ? getPrecio() * 0.90f : getPrecio();
  }

}
