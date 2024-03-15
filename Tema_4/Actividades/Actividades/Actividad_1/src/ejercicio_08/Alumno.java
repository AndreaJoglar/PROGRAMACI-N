package ejercicio_08;

public class Alumno {
	
	/*
	 * Atributos
	 * DNI, número de expediente, nombre, 
	 * apellidos, domicilio, teléfono y email
	 */
	private String dni;
	private String numExpediente;
	private String nombre;
	private String apellidos;
	private String domicilio;
	private String telefono;
	private String email;
	
	private Alumno companiero;
	
	/**
	 * @param dni
	 * @param numExpediente
	 * @param nombre
	 * @param apellidos
	 * @param domicilio
	 * @param telefono
	 * @param email
	 */
	public Alumno(String dni, String numExpediente, String nombre, String apellidos, String domicilio, String telefono,
			String email) {
		this.dni = dni;
		this.numExpediente = numExpediente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.email = email;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNumExpediente() {
		return numExpediente;
	}
	
	public void setNumExpediente(String numExpediente) {
		this.numExpediente = numExpediente;
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
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String texto =  "Alumno [dni=" + dni + ", numExpediente=" + numExpediente + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", domicilio=" + domicilio + ", telefono=" + telefono + ", email=" + email + "]\n";
		if (companiero!=null) {
			texto+=companiero.getNombre()+"\n";
		}
		else {
			System.out.println("Sin compañero.");
		}
		return texto;
	}
	
	/**
	 * 
	 * @param a
	 */
	public void addCompaniero (Alumno a) {
		this.companiero = a;
	}
	

}
