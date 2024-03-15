package ejercicio_05;

import java.util.Scanner;

public class pruebaCurso {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso = new Curso();

		Estudiante e1 = new Estudiante("Jose", "Roder Pla", 1, 1, 6.2);
		Estudiante e2 = new Estudiante("Marta", "Roder Pla", 2, 1, 9.5);
		Estudiante e3 = new Estudiante("Carmen", "Pérez Illa", 3, 2, 8.0);
		Estudiante e4 = new Estudiante("Miren", "Amiano", 4, 2, 7.2);
		Estudiante e5 = new Estudiante("Roque", "Fort Blanco", 5, 1, 4);
		Estudiante e6 = new Estudiante("Don", "Pim Pom", 6, 2, 2.1);

		curso.addAlumno(e1);
		curso.addAlumno(e2);
		curso.addAlumno(e3);
		curso.addAlumno(e4);
		curso.addAlumno(e5);
		curso.addAlumno(e6);
		curso.imprimir();

		// Comprobamos si funciona la exclusión en caso de código de alumno repetido.
		Estudiante e7 = new Estudiante("Arturo", "González Presi", 2, 2, 5);
		curso.addAlumno(e7);

		// Calculamos promedio de notas
		curso.calcularPromedioNotas(curso);

		// Número de alumnos aprobados y porcentaje de aprobados
		System.out.println("******************");
		System.out.println("Alumnos aprobados del curso: ");
		curso.aprobadosCurso(curso);

		// Buscamos un alumno a partir de su código
		System.out.println("Introduce el código del alumno que quiera buscar: ");
		int codigo = teclado.nextInt();
		curso.buscarEstudiante(codigo);

		// Eliminamos un estudiante a partir de su código
		System.out.println("******************");
		System.out.println("Introduce código del alumno que quiera borrar: ");
		codigo = teclado.nextInt();
		curso.eliminarEstudiante(codigo);
		System.out.println("*****************");
		curso.imprimir();

	}

}
