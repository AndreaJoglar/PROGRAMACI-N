package ejercicio1;

public class Electrodomestico {

	protected final String ID_REFERENCIA = "E";
	
	protected static int CONTADOR_ID = 0;
	
	protected String nombre;
	protected String referencia;
	protected double precio;
	/**
	 * @param nombre
	 * @param precio
	 */
	public Electrodomestico(String nombre, double precio) {
		CONTADOR_ID++;
		this.nombre = nombre;
		this.referencia = asignarReferencia();
		this.precio = precio;
		
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the referencia
	 */
	public String getReferencia() {
		return referencia;
	}


	/**
	 * @param referencia the referencia to set
	 */
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	private String asignarReferencia() {
		String ref = "";
		ref = ID_REFERENCIA + CONTADOR_ID;
		
		return ref;
	}

	public double precioConDescuento (int porcentaje) {
		double precioFinal = this.precio - (this.precio * porcentaje/100);
		return precioFinal;
	}
	
	public double precioConIva (int porcentaje) {
		double precioFinal = this.precio + (this.precio * porcentaje/100);
		return precioFinal;
	}
	
	@Override
	public String toString() {
		return "Electrodomestico \n\tNombre: " + nombre + "\n\tReferencia: " + referencia 
				+ "\n\tPrecio: " + precio + "\n";
	}
	
	
	
	
	
	
}
