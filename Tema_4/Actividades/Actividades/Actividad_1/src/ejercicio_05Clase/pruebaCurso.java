package ejercicio_05Clase;

public class pruebaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso c = new Curso (); //Creamos el curso en el main
		
		//Creamos los estudiantes en el main
		Estudiante e1 = new Estudiante ("Pepe", "Alonso", 1, 1, 8.5);
		Estudiante e2 = new Estudiante ("Jose", "López", 2, 1, 6.5);
		Estudiante e3 = new Estudiante ("Juan", "Juárez", 3, 2, 7.5);
		Estudiante e4 = new Estudiante ("María", "Díaz", 4, 2, 8.0);
		Estudiante e5 = new Estudiante ("Marta", "Díaz", 5, 1, 4);
		Estudiante e6 = new Estudiante ("Marilia", "Díaz", 6, 2, 10);
		
		//Agregamos al curso los alumnos. Agregación: el objeto estudiante (item) existe independientemente de la clase curso
		c.addEstudiante(e1);
		c.addEstudiante(e2);
		c.addEstudiante(e3);
		c.addEstudiante(e4);
		c.addEstudiante(e5);
		c.addEstudiante(e6);
		
		c.listarAlumnos();
	}

}
