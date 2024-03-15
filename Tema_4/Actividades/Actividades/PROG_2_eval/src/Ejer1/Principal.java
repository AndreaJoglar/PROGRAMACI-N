package Ejer1;

import java.util.Scanner;

public class Principal {
	
	public static Scanner t = new Scanner(System.in);
	public static Vuelo vuelo = new Vuelo();

	public static void main(String[] args) {
		new Principal().run();
	}

	/**
	 * Ejecuta las diferentes opciones del menu hasta que el usuario decida
	 * abandonar
	 */
	public void run() {
		char opcion;
		do {
			mostarMenu();
			opcion = pedirOpcion();
			procesarOpcion(opcion);
		} while ((opcion != 's') && (opcion != 'S'));
	}

	/**
	 * Muestra por pantalla el men� del programa
	 */
	public void mostarMenu() {
		System.out.println("1- Generar 'vuelo' aleatorio");
		System.out.println("2- Comenzar oferta");
		System.out.println("");
		System.out.println("S- Salir");
		System.out.println("");
	}

	/**
	 * Lee por teclado la opcion de menu elegida
	 * 
	 * @return Los caracteres correspondientes a las opciones (1,2) o las letras
	 *         's' o 'S'
	 */
	public char pedirOpcion() {
		char opcion;
		do {
			System.out.println(" Opcion: ");
			opcion = t.next().charAt(0);
		} while ((opcion < '1') && (opcion > '4') && (opcion != 's')
				&& (opcion != 'S'));
		return opcion;
	}

	/**
	 * Procesa la opcion tecleada por el usuario
	 * 
	 * @param opcion
	 *            char Indica valores 1, 2
	 */
	public void procesarOpcion(char opcion) {

		switch (opcion) {
		case '1':
			//HACER
			break;
		case '2':
				// HACER
				// HACER
			
			break;

		}

	}
}
