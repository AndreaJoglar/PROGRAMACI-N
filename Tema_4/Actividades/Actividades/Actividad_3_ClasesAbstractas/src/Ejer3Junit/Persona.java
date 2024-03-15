
package Ejer3Junit;


public abstract class Persona implements I_Humano {
	protected String nif;
	protected String nombre;
	protected String apellidos;
	protected Direccion dir;
	
	protected static int contVeces=0;
	
	public Persona() {
		
	}
	
	
	public int getContVeces() {
		return contVeces;
	}
	
	
	/**
	 * @param nif
	 * @param nombre
	 * @param apellidos
	 * @param dir
	 */
	public Persona(String nif, String nombre, String apellidos, Direccion dir) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dir = dir;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
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
	public Direccion getDir() {
		return dir;
	}
	public void setDir(Direccion dir) {
		this.dir = dir;
	}
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + 
						", apellidos=" + apellidos + ", dir:\n\t" + 
						                           dir.toString();
	}
	
	
	
}
