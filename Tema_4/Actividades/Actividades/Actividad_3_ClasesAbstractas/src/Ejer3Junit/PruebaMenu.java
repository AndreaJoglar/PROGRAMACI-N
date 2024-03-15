package Ejer3Junit;

import java.util.Scanner;

public class PruebaMenu {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colegio colegio=new Colegio();
		
		cargarDatos(colegio);
		
		int opcion=menu();
		
		while(opcion!=0) {
			switch (opcion) {
				case 1:{
					insertarProfesor(colegio);
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
				case 4:{
					System.out.println("Nif a buscar ");
					String nif=teclado.next();
					Persona p=colegio.buscarPersona(nif);
					if(p==null) {
						System.out.println("Persona no encontrada");
					}else {
						System.out.println(p.toString());
					}
					break;
				}
				case 5:{
					System.out.println("Nif a buscar ");
					String nif=teclado.next();
					colegio.borrarPersona(nif);
					break;
				}				
			};
			opcion=menu();	
		}
	}

	private static void insertarAlumno(Colegio colegio) {
		// TODO Auto-generated method stub
		Direccion dir=new Direccion("Calle","ciudad",33204,"españa");
		System.out.println("Nif"); String nif=teclado.next();
		System.out.println("Nombre ");String nombre=teclado.next();
		System.out.println("Apellidos ");String ape=teclado.next();
		
		Alumno a=new Alumno(nif,nombre,ape,dir);
		colegio.insertarPersona(a);
	}

	private static void insertarProfesor(Colegio colegio) {
		// TODO Auto-generated method stub
		Direccion dir=new Direccion("Calle","ciudad",33204,"españa");
		System.out.println("Nif"); String nif=teclado.next();
		System.out.println("Nombre ");String nombre=teclado.next();
		System.out.println("Apellidos ");String ape=teclado.next();
		System.out.println("Despacho ");String desp=teclado.next();
		
		Profesor p = new Profesor(nif,nombre,ape,dir,desp);
		colegio.insertarPersona(p);
	}

	private static void cargarDatos(Colegio colegio) {
		Direccion dir1=new Direccion("Calle1","ciudad1",33204,"españa");
		Alumno a1=new Alumno("1111", "alum1", "XXX", dir1);
		Alumno a2=new Alumno("2222", "alum2", "XXX", dir1);
		Alumno a3=new Alumno("3333", "alum3", "XXX", dir1);
		
		Profesor p1=new Profesor("111p", "prof1", "XXX", dir1, "Desp1");
		Profesor p2=new Profesor("222p", "prof2", "XXX", dir1, "Desp2");
		
		colegio.insertarPersona(a1);
		colegio.insertarPersona(a2);
		colegio.insertarPersona(a3);
		
		colegio.insertarPersona(p1);
		colegio.insertarPersona(p2);
	}

	private static int menu() {
		// TODO Auto-generated method stub
		System.out.println("\n\n************************************");
		System.out.println("1.- Insertar Profesor");
		System.out.println("2.- Insertar Estudiante");
		System.out.println("3.- Listar colegio");
		System.out.println("4.- Buscar Persona ");
		System.out.println("5.- Borrar Persona ");
		System.out.println("0.- Salir ");
		System.out.print("opcion:");
		int opcion=teclado.nextInt();
		return opcion;	
	}

}
