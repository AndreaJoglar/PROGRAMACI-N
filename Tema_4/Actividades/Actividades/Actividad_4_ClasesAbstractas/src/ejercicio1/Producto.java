package ejercicio1;

public class Producto {

	protected String referencia;
	protected String nombre;
	protected double precio;
	
	/**
	 * @param referencia
	 * @param nombre
	 * @param precio
	 */
	public Producto(String referencia, String nombre, double precio) {
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Producto [referencia=" + referencia + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	/**
	 * Calcula el descuento del precio del producto
	 * @param porcentaje entero
	 * @return real
	 */
	public double precioConIva(int porcentaje) {
		return (precio + (precio * porcentaje/100));
	}
	
	/**
	 * La palabra final hace que no se pueda sobrecargar el metodo para calcular el
	 * precio con descuento
	 * @param porcentaje entero
	 * @return real
	 */
	public final double precioConDescuento (int porcentaje) {
		return (precio - (precio * porcentaje/100));
	}
}
