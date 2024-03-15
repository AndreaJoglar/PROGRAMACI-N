package ejercicio1;

public class ElectrodomesticoConInstalacion extends Electrodomestico {

	private double plusMontaje;

	/**
	 * @param nombre
	 * @param precio
	 * @param plusMontaje
	 */
	public ElectrodomesticoConInstalacion(String nombre, double precio, double plusMontaje) {
		super(nombre, precio);
		this.plusMontaje = plusMontaje;
	}

	/**
	 * @return the plusMontaje
	 */
	public double getPlusMontaje() {
		return plusMontaje;
	}

	/**
	 * @param plusMontaje the plusMontaje to set
	 */
	public void setPlusMontaje(double plusMontaje) {
		this.plusMontaje = plusMontaje;
	}


	@Override
	public double precioConIva(int porcentaje) {
		double precioFinal = super.precioConIva(porcentaje);
		precioFinal = precioFinal + this.plusMontaje;
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Electrodomestico con Instalacion \n\tPlusMontaje: " + plusMontaje 
				+ "\n\tNombre: " + nombre + "\n\tReferencia: " + referencia 
				+ "\n\tPrecio: " + precio + "\n";
	}

	
	

	
	
	
	
}
