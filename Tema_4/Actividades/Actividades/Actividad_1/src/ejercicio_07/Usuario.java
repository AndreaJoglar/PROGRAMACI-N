package ejercicio_07;

public class Usuario {

	//Atributos
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;
	private String dni;
	//añoMesDia aaaammdd
	private String fecha;
	
	/**
	 * Constructor con todos los parametros
	 * @param nombre String
	 * @param apellidos String
	 * @param email String
	 * @param telefono String
	 * @param dni String
	 * @param fecha String
	 */
	public Usuario(String nombre, String apellidos, String email, String telefono, String dni, String fecha) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.dni = dni;
		this.fecha = fecha;
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
	 * Metodo get del atributo email
	 * @return String
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Metodo set del atributo email
	 * @param email String
	 */
	public void setEmail(String email) {
		this.email = email;
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
	
	/**
	 * Metodo get del atributo dni
	 * @return String
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Metodo get del atributo fecha
	 * @return String
	 */
	public String getFecha() {
		return fecha;
	}
	
	/**
	 * Metodo set del atributo fecha
	 * @param fecha String
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", telefono=" + telefono
				+ ", dni=" + dni + ", fecha=" + fecha + "]";
	}
	
	
	
}
