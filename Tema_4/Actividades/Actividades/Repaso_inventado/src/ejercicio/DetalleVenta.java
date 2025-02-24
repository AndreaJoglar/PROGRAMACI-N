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
	
	/**
	 * Muestra el precio total de una venta en funcion de la cantidad de producto comprado
	 * @param cantidad entero
	 * @return real
	 */
	public double precioTotal () {
		double precioTotal = producto.getPrecio() * cantidad;
		return precioTotal;
	}
	
	@Override
	public String toString() {
		return "Detalle de la Venta: \n" + producto.toString() + "\tCantidad: " + cantidad + "\n";
	}
	
	
	
}
