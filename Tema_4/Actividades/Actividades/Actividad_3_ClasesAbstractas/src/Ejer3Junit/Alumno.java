/**
 * 
 */
package Ejer3Junit;

/**
 * 
 */
public class Alumno extends Persona {
    private static int contEstudiante=0;
    
	private int id;
	
	public Alumno() {
		
	}
	
	
	/**
	 * @param nif
	 * @param nombre
	 * @param apellidos
	 * @param dir
	 */
	public Alumno(String nif, String nombre,
                   String apellidos, Direccion dir) {
		super(nif, nombre, apellidos, dir);
		contEstudiante++;
		this.id = contEstudiante;
	}



	@Override
	public void identificate() {
		System.out.println("Estudiante : "+ id);
		System.out.println(this.toString());
		contVeces++;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	

}
