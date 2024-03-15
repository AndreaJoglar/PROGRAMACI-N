/**
 * 
 */
package ejercicio_03;

/**
 * 
 */
public class Profesor extends Persona {
	
	private String despacho;

	/**
	 * Constructor con parametros
	 * @param dni String
	 * @param nombre String
	 * @param apellidos String
	 * @param dir Direccion
	 * @param despacho String
	 */
	public Profesor(String dni, String nombre, String apellidos, Direccion dir, String despacho) {
		super(dni, nombre, apellidos, dir);
		this.despacho = despacho;
	}

	@Override
	public void identificate() {
		System.out.println("Profesor: " + despacho);
		System.out.println(this.toString());
		contVeces++;
	}

}
