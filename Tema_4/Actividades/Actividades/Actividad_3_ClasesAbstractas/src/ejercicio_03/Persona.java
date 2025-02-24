/**
 * 
 */
package ejercicio_03;

//la hacemos abstracta, porque el método se usa en sus subclases Estudiante y Profesor
//Como es abstracta, ponemos los atributos en protected. Si vamos a tener getter y setter, privados.
public abstract class Persona implements I_Humano {
	
	protected static int contVeces = 0;
	
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected Direccion dir;
	
	/**
	 * Constructor que no recibe parametros
	 */
	public Persona() {
	}

	/**
	 * Constructor con todos los parametros
	 * @param dni String
	 * @param nombre String
	 * @param apellidos String
	 * @param dir Direccion
	 */
	public Persona(String dni, String nombre, String apellidos, Direccion dir) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dir = dir;
	}
	
	public int getContVeces() {
		return contVeces;
	}
	
	/**
	 * Metodo get del atributo dni
	 * @return the dni String
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
	 * @return the dir
	 */
	public Direccion getDir() {
		return dir;
	}
	/**
	 * @param dir the dir to set
	 */
	public void setDir(Direccion dir) {
		this.dir = dir;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre 
				+ ", apellidos=" + apellidos + "\n\t" + dir.toString();
	}
	
	
	
	
}
