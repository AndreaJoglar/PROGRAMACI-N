package ejercicio;

public class DetalleVenta {

	private Producto producto;
	private int cantidad;
	/**
	 * @param producto
	 * @param cantidad
	 */
	public DetalleVenta(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double precioTotal() {
		return producto.calcularPrecioFinal(cantidad);
	}
	
	@Override
	public String toString() {
		return "DetalleVenta [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
	