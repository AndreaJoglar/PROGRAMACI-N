package ejercicio;

public class Comprador {

	private String nombre;
	private String apellidos;
	private String dni;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 */
	public Comprador(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Comprador: \n\tNombre: " + nombre + "\n\tApellidos: " 
							+ apellidos + "\n\tDni: " + dni + "\n";
	}
	
	
	
	
}
