package ejercicio1;

public class DetalleFactura {

	private Electrodomestico e;
	private int cantidad;
	/**
	 * @param e
	 * @param cantidad
	 */
	public DetalleFactura(Electrodomestico e, int cantidad) {
		this.e = e;
		this.cantidad = cantidad;
	}
	/**
	 * @return the e
	 */
	public Electrodomestico getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(Electrodomestico e) {
		this.e = e;
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
		double precioTotal = e.getPrecio() * cantidad;
		return precioTotal;
	}
	
	public double precioTotalConIva(int porcentaje) {
		double precioConIva = e.precioConIva(porcentaje) * this.cantidad;
		return precioConIva;
	}
	
	
	
	@Override
	public String toString() {
		return "DetalleFactura: \n\t" + e.toString() 
				+ "\tCantidad: " + cantidad + "\n";
	}
	
	
}
