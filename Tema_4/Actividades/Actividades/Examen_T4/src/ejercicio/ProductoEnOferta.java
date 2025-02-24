package ejercicio;

public class ProductoEnOferta extends Producto {

	private int cantidadMinima;
	private int porcentaje;
	
	/**
	 * @param cod
	 * @param descripcion
	 * @param existencias
	 * @param precio
	 * @param cantidadMinima
	 * @param porcentaje
	 */
	public ProductoEnOferta(int cod, String descripcion, int existencias, double precio, int cantidadMinima,
			int porcentaje) {
		super(cod, descripcion, existencias, precio);
		this.cantidadMinima = cantidadMinima;
		this.porcentaje = porcentaje;
	}

	/**
	 * @return the cantidadMinima
	 */
	public int getCantidadMinima() {
		return cantidadMinima;
	}

	/**
	 * @param cantidadMinima the cantidadMinima to set
	 */
	public void setCantidadMinima(int cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}

	/**
	 * @return the porcentaje
	 */
	public int getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	
	@Override
	public double calcularPrecioFinal(int cantidad) {
		double precioTotal=super.calcularPrecioFinal(porcentaje);
		if (cantidad > cantidadMinima) {
			precioTotal= precioTotal - (precioTotal * porcentaje/100);
		}
		return precioTotal;
	}

	@Override
	public String toString() {
		return "ProductoEnOferta [cantidadMinima=" + cantidadMinima + ", porcentaje=" + porcentaje + ", cod=" + super.getCod()
				+ ", descripcion=" + getDescripcion() + ", existencias=" + super.getExistencias() + ", precio=" + super.getPrecio() + "]";
	}
	
	
	
	
}
