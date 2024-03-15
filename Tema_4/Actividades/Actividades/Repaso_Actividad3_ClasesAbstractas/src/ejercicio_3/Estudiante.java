package ejercicio_3;

public class Estudiante extends Persona {

	protected int idEstudiante;
	
	/**
	 * Constructor de la clase Persona
	 * @param nombre String
	 * @param apellidos String
	 * @param dni String
	 * @param direccion Direccion
	 * @param idEstudiante entero
	 */
	public Estudiante(String nombre, String apellidos, String dni, Direccion direccion,
																	 int idEstudiante) {
		super(nombre, apellidos, dni, direccion);
		this.idEstudiante = idEstudiante;
	}


	@Override
	public void identificate() {
		System.out.println("Tipo: Alumno");
	}


	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + "\n\tnombre=" + nombre 
				+ ", apellidos=" + apellidos + ", dni="
				+ dni + ", direccion=" + direccion + "]";
	}
	
	

}
