/**
 * 
 */
package ejercicio_03;

/**
 * 
 */
public class Alumno extends Persona {
	//variable estática. Se almacena en el heap. Es equivalente al autoincremento
	//la variable estática se inicializa en la declaración
	private static int contEstudiante = 0; 
	
	//los atributos se inicializan en el constructor, nunca en la declaración
	private int id;
	
	/**
	 * Constructor con todos los parametros
	 * @param dni String 
	 * @param nombre String
	 * @param apellidos String
	 * @param dir Direccion
	 */
	public Alumno(String dni, String nombre, String apellidos, Direccion dir) {
		super(dni, nombre, apellidos, dir);
		contEstudiante++;
		this.id = contEstudiante;
	}

	@Override
	public void identificate() {
		System.out.println("Estudiante: " + id);
		System.out.println(this.toString());
		contVeces++;

	}

}
