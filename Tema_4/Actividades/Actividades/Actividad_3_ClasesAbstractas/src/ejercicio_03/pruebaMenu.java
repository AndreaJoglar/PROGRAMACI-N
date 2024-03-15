package ejercicio_03;

import java.util.Scanner;

public class pruebaMenu {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colegio colegio = new Colegio ();
		
		cargarDatos (colegio);
		
		int opcion = menu();
		
		while (opcion != 0) {
			switch (opcion) {
				case 1:{
					insertarProfesor (colegio);
					break;
				}
				case 2:{
					insertarAlumno(colegio);
					break;
				}
				case 3: {
					colegio.listarColegio();
					break;
				}
				case 4: {
					System.out.println("DNI a buscar: ");
					String dni = teclado.next();
					Persona p = colegio.buscarPersona(dni);
					if (p == null) {
						System.out.println("Persona no encontrada.");
					}
					else {
						System.out.println(p.toString());
					}
					break;
				}
				case 5: {
					System.out.println("DNI a eliminar: ");
					String dni = teclado.next();
					colegio.borrarPersona(dni);
					break;
				}
			};
			opcion = menu();
		}
	}
	
	private static void insertarAlumno(Colegio colegio) {
		Direccion dir = new Direccion("Calle", "Ciudad", 33204, "España");
		System.out.println("DNI: ");
		String dni = teclado.next();
		System.out.println("Nombre: ");
		String nombre = teclado.next();
		System.out.println("Apellidos: ");
		String apellidos = teclado.next();
		
		Alumno a = new Alumno(dni, nombre, apellidos, dir);
		colegio.insertarPersona(a);
		
	}

	private static void insertarProfesor(Colegio colegio) {
		Direccion dir = new Direccion("Calle", "Ciudad", 33204, "España");
		System.out.println("DNI: ");
		String dni = teclado.next();
		System.out.println("Nombre: ");
		String nombre = teclado.next();
		System.out.println("Apellidos: ");
		String apellidos = teclado.next();
		System.out.println("Despacho: ");
		String despacho = teclado.next();
		
		Profesor p = new Profesor(dni, nombre, apellidos, dir, despacho);
		colegio.insertarPersona(p);
		
	}

	//nos sirve para probar el método de listar 
	private static void cargarDatos(Colegio colegio) {
		Direccion dir1 = new Direccion("Calle1", "Ciudad1", 33204, "España");
		
		Alumno a1 = new Alumno("1111", "Pepe", "XXXX", dir1);
		
		Alumno a2 = new Alumno("2222", "Charo", "XXXX", dir1);
		
		Alumno a3 = new Alumno("3333", "Marta", "XXXX", dir1);
		
		Profesor p1 = new Profesor("111111x", "Prof1", "apellido1", dir1, "Desp1");
		Profesor p2 = new Profesor("222222x", "Prof2", "apellido2", dir1, "Desp2");
		
		colegio.insertarPersona(a1);
		colegio.insertarPersona(a2);
		colegio.insertarPersona(a3);
		
		colegio.insertarPersona(p1);
		colegio.insertarPersona(p2);
	}

	private static int menu() {
		System.out.println("\n******************");
		System.out.println("1.- Insertar profesor: ");
		System.out.println("2.- Insertar alumno: ");
		System.out.println("3.- Listar colegio: ");
		System.out.println("4.- Buscar Persona: ");
		System.out.println("5.- Borrar Persona: ");
		System.out.println("0.- Salir ");
		System.out.println("Opción: ");
		int opcion = teclado.nextInt();
		return opcion;
	}

}
