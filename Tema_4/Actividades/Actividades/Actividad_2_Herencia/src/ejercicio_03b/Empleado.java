package ejercicio_03b;

public class Empleado {

	private String nombre;
	
	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		this.nombre = "XXX";
	}

	/**
	 * Constructor con parametros
	 * @param nombre String
	 */
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del atributo nombre
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del atributo nombre
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String datos() {
		return "Empleado " + nombre;
	}
	
	
	
}

