package ejercicio_3;

public class Profesor extends Persona {

	protected int despacho;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param direccion
	 */
	public Profesor(String nombre, String apellidos, String dni, Direccion direccion) {
		super(nombre, apellidos, dni, direccion);
		this.despacho = 0;
	}

	/**
	 * Constructor con parametros
	 * @param nombre String
	 * @param apellidos String
	 * @param dni String
	 * @param direccion Direccion
	 * @param despacho entero
	 */
	public Profesor(String nombre, String apellidos, String dni, Direccion direccion, int despacho) {
		super(nombre, apellidos, dni, direccion);
		this.despacho = despacho;
	}
	
	/**
	 * @return the despacho
	 */
	public int getDespacho() {
		return despacho;
	}

	/**
	 * @param despacho the despacho to set
	 */
	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}

	@Override
	public void identificate() {
		System.out.println("Tipo: Profesor");
	}

	@Override
	public String toString() {
		return "Profesor [despacho=" + despacho + "\n\tnombre=" + nombre 
				+ ", apellidos=" + apellidos + ", dni=" + dni
				+ ", direccion=" + direccion + "]";
	}
	
	
	
}
