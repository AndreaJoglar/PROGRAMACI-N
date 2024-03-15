package ejemplos_01;

import java.util.Scanner;

public class pruebaAlumno {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Con el new estamos instanciando. 
		 * Inicializamos los atributos de este alumno 
		 * llamando al constructor(Alumno(11111111E...))
		 */
		Alumno a1 = new Alumno ("11111111E","Pepe",15); 
		a1.toString();
		Alumno a2 = new Alumno ();
		a2.toString();
		Alumno a3 = new Alumno ("Juan",15);
		a3.toString();
		
		//Para imprimir los datos almacenados
		System.out.println(a1);
		
		//Podemos introducir datos también con el teclado
		System.out.println("Nombre alumno: ");
		String nombre= teclado.next();
		Alumno a4= new Alumno (nombre,12);
		a4.toString();
		
		String n=a1.getNombre();
		n=a1.getNombre();
		System.out.println("Nombre del alumno "+n);
		a1.setNombre("Juan");
		n=a1.getNombre();
		System.out.println("Nombre modificado: "+n);
	}

}
