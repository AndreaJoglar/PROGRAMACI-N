package ejercicio_05;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {
	static Scanner teclado = new Scanner(System.in);

	private Estudiante [] v;
	private int numEstudiantes;

	/**
	 * Constructor de la clase curso. No recibe parametros
	 */
	public Curso() {
		this.v = new Estudiante [10];
		this.numEstudiantes = 0;
	}
	
	/**
	 * Determina si un curso esta lleno y no admite
	 * mas alumnos
	 * @return boolean
	 */
	public boolean cursoLleno () {
		if (this.numEstudiantes == v.length) return true;
		return false;
	}
	
	
	/**
	 * Determina si un curso no tiene estudiantes
	 * @return boolean
	 */
	public boolean cursoVacio() {
		if (this.numEstudiantes == 0) return true;
		return false;
	}
	
	/**
	 * Determina si un codigo de alumno esta disponible
	 * @param codigo entero
	 * @return boolean
	 */
	public boolean codigoDisponible (int codigo) {
		for (int i = 0; i < this.numEstudiantes; i++) {
			if (v[i].getCodigo() == codigo) {
				return false;
			}
		}
		return true;	
	}
	
	
	/**
	 * Permite agregar alumnos al curso
	 * @param e Estudiante
	 */
	public void addAlumno(Estudiante e) {
		if (cursoLleno() == true) {
			System.out.println("No se pueden añadir alumnos. El curso está lleno");
		}
		else {
			if (codigoDisponible(e.getCodigo()) == false) {
				System.out.println("Código repetido. No puede añadirse el alumno.");
			}
			else {
				//añadimos alumnos en la primera posición vacía
				v[numEstudiantes]=e;
				numEstudiantes++;
			}
		}
	}

	/**
	 * Busca un estudiante en el curso a partir de su codigo
	 * y muestra sus datos por pantalla
	 * @param codigo entero
	 */
	public void buscarEstudiante(int codigo) {
		boolean encontrado = false;
		for (int i = 0; i < this.numEstudiantes && encontrado==false; i++) {
			if (v[i].getCodigo() == codigo) {
				Estudiante e = v[i];
				System.out.println(e.toString());
				encontrado = true;
			}
		}
		if (encontrado == false) {
			System.out.println("El alumno no figura en el curso.");
		}
	}
	
	/**
	 * Encuentra la posicion en la que se encuentra un estudiante
	 * dentro de un curso
	 * @param codigo entero
	 * @return entero
	 */
	public boolean encontrarEstudiante (int codigo) {
		for (int i = 0; i < this.numEstudiantes; i++) {
			Estudiante e = v[i];
			if (e.getCodigo()==codigo) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Devuelve la posicion en la que se encuentra un estudiante
	 * @param codigo entero
	 * @return entero
	 */
	public int posicionEstudiante (int codigo) {
		for (int i = 0; i < this.numEstudiantes; i++) {
			Estudiante e = v[i];
			if (e.getCodigo()==codigo) {
				return i;
			}
		}
		return -1;
	}
	
	
	/**
	 * Elimina un estudiante de un curso
	 * @param codigo entero
	 */
	public void eliminarEstudiante (int codigo) {
		if (encontrarEstudiante(codigo) == true) {
			buscarEstudiante(codigo);
			System.out.println("¿Desea eliminar al estudiante del curso? (s/n)");
			char confirmacion = teclado.next().charAt(0);
			if (confirmacion == 's' || confirmacion == 'S') {
				int pos = posicionEstudiante(codigo);
				for (int i = pos; i < this.numEstudiantes-1; i++) {
					v[i]=v[i+1];
				}
				this.numEstudiantes--;
			}
		}
		else {
			System.out.println("El estudiante no figura en el curso.");
		}
	}
	
	/**
	 * Calcula la nota media de los alumnos del curso
	 * @param c Curso
	 */
	public void calcularPromedioNotas (Curso c) {
		double media = 0;
		for (int i = 0; i<this.numEstudiantes; i++) {
			Estudiante e = v[i];
			media+=e.getNotaFinal();
		}
		media = media/this.numEstudiantes;
		System.out.println("Promedio de notas = "+media);
	}
	
	/**
	 * Muestra los estudiantes aprobados y el porcentaje total de aprobados.
	 * @param c Curso
	 */
	public void aprobadosCurso (Curso c) {
		int contAprobado = 0;
		for (int i = 0; i < this.numEstudiantes; i++) {
			Estudiante e = v[i];
			if (e.getNotaFinal() >=5.0) {
				System.out.println(e.toString());
				contAprobado++;
			}
		}
		double porcentaje = ((double) contAprobado *100)/(double) this.numEstudiantes;
		System.out.println("Porcentaje de aprobados = "+(Math.rint(porcentaje*100)/100)+" %");
	}
	
	/**
	 * Imprime el contenido del curso
	 */
	public void imprimir() {
		String texto ="Curso [numEstudiantes=" + numEstudiantes + "]";
		for (int i = 0; i < this.numEstudiantes; i++) {
			Estudiante e = v[i];
			texto +="\n"+e.toString()+"\n";
		}
		System.out.println(texto);
	}
	
	
	
}


