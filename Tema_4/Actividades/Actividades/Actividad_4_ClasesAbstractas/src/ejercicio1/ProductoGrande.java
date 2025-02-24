package ejercicio1;

public class ProductoGrande extends Producto {
	
	private double plusMontaje;

	/**
	 * @param referencia
	 * @param nombre
	 * @param precio
	 * @param plusMontaje
	 */
	public ProductoGrande(String referencia, String nombre, double precio, double plusMontaje) {
		super(referencia, nombre, precio);
		this.plusMontaje = plusMontaje;
	}

	@Override
	public String toString() {
		return "ProductoGrande [plusMontaje=" + plusMontaje + ", referencia=" 
				+ referencia + ", nombre=" + nombre
				+ ", precio=" + precio + "\n";
	}
	
	@Override
	public double precioConIva(int porcentaje) {
		double precioTotal = precio + plusMontaje;
		return (precioTotal + (precioTotal * porcentaje/100));
	}
	/*
	 * El metodo es final en el padre. no se puede sobrecargar
	public final double precioConDescuento (int porcentaje) {
		return 0.0
	}
	*/
	
}
