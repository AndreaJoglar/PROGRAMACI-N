package ejercicio_08;

public class Profesor {

	//Atributos
	private String nombre;
	private String apellidos;
	private String domicilio;
	private String email;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param domicilio
	 * @param email
	 */
	public Profesor(String nombre, String apellidos, String domicilio, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" + domicilio + ", email="
				+ email + "]";
	}
	
	
}
