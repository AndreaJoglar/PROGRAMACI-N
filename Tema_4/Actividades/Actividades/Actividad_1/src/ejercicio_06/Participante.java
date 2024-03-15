package ejercicio_06;

public class Participante {
	
	//Atributos
	private String nombre;
	private String apellidos; 
	private int edad;
	private String direccion;
	private String telefono;
	
	
	/**
	 * Constructor con todos los parametros
	 * @param nombre String
	 * @param apellidos String
	 * @param edad entero
	 * @param direccion String
	 * @param telefono String
	 */
	public Participante(String nombre, String apellidos, int edad, String direccion, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	/**
	 * Metodo get del atributo nombre
	 * @return String
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
	 * @return String
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
	 * Atributo get del atributo edad
	 * @return entero
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Metodo set del atributo edad
	 * @param edad entero
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Metodo get del atributo direccion
	 * @return String
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Metodo set del atributo direccion
	 * @param direccion String
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo get del atributo telefono
	 * @return String
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Metodo set del atributo telefono
	 * @param telefono String
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", direccion="
				+ direccion + ", telefono=" + telefono + "]\n";
	}

}
