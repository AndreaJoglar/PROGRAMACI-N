package ejercicio_05Clase;

public class Curso {

	//Atributos
	Estudiante v[];
	private int contEstudiante;
	
	/**
	 * Constructor de la clase Curso sin parametros
	 */
	public Curso () {
		v=new Estudiante [10];
		this.contEstudiante = 0;
	}
	
	/**
	 * Agrega estudiantes al vector
	 * @param e
	 */
	public void addEstudiante (Estudiante e) {
		if (contEstudiante < v.length) {// tenemos sitio para estudiantes
			v[contEstudiante]=e;
			contEstudiante++;
		}
		else {
			System.out.println("No hay hueco.");
		}
	}
	
	/**
	 * Muestra por pantalla informacion de los alumnos del curso
	 */
	public void listarAlumnos () {
		for (int i = 0; i < this.contEstudiante; i++) {
			Estudiante e = v[i];
			System.out.println(e.toString());
		}
	}
	
	/**
	 * Busca un estudiante de acuerdo con su codigo
	 * @param codigo entero
	 */
	public void buscarAlumno (int codigo) {
		boolean encontrado = false;
		for (int i = 0; i < this.contEstudiante && encontrado==false; i++) {
			Estudiante e = v[i];
			if (e.getCodigo()==codigo) {
				//encontrado
				System.out.println(e.toString());
				encontrado = true;
			}
		}
		if (encontrado == false) {
			System.out.println("ERROR. Estudiante no encontrado.");
		}
	}
}
