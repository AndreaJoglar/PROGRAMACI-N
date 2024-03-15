package envios;

/**
 * @author Andrea Fernandez Joglar
 * @version 1.2
 */

public class Persona {
	
	private String dni;
	private String nombre;

	/**
	 * Constructor con parametros de la clase Persona
	 * @param d String
	 * @param n String
	 */
	public Persona(String d, String n) {
		this.dni = d;
		this.nombre = n;
	}

	/**
	 * Metodo get del atributo dni
	 * @return String
	 */
	public String getDni() {
		return this.dni;
	}

	/**
	 * Metodo get del atributo nombre
	 * @return String
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo set del atributo dni
	 * @param d String
	 */
	public void setDni(String d) {
		this.dni = d;
	}

	/**
	 * Metodo set del atributo nombre
	 * @param n String
	 */
	public void setNombre(String n) {
		this.nombre = n;
	}

	@Override
	public String toString() {
		return "DNI: " + this.dni + "\nNOMBRE: " + this.nombre + "\n";
	}

}
