package ejercicio_02;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;

	/**
	 * Constructor con todos los parametros
	 * @param nombre String
	 * @param apellidos String
	 * @param dni String
	 */
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	/**
	 * Metodo get del atributo nombre
	 * @return nombre String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del atributo nombre
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del atributo apellidos
	 * @return the apellidos String
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo set del atributo apellidos 
	 * @param apellidos String
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo get del atributo dni
	 * @return dni String
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Metodo set del atributo dni
	 * @param dni String
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
	}

	


}
