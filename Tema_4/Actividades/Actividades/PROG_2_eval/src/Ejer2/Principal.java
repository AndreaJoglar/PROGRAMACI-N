package Ejer2;

import java.util.Scanner;

public class Principal {

	public static Scanner t = new Scanner(System.in);

	private Mensaje mensajes[];
	private GestorDeIncidencias gestor = new GestorDeIncidencias();

	public static void main(String[] args) {
		new Principal().run();
	}

	/**
	 * Ejecuta las diferentes opciones del menu hasta que el usuario decida
	 * abandonar
	 */
	private void run() {
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
	private void mostarMenu() {
		System.out.println("");
		System.out.println("1- Generar Mensajes");
		System.out.println("2- Procesar Mensajes");
		System.out.println("3- Visualizar Incidencias de Forma Detallada "
				+ "(Incidencias/Nostas/Actuaciones");
		System.out.println("4- Visualizar Errores y Presupuesto");
		System.out.println("S- Salir");
		System.out.println("");
	}

	/**
	 * Lee por teclado la opcion de menu elegida
	 * 
	 * @return Los caracteres correspondientes a las opciones (1-8)) o las
	 *         letras 's' o 'S'
	 */
	private char pedirOpcion() {
		char opcion;
		do {
			System.out.println(" Opcion: ");
			opcion = t.next().charAt(0);
		} while ((opcion < '1') && (opcion > '8') && (opcion != 's')
				&& (opcion != 'S'));
		return opcion;
	}

	/**
	 * Procesa la opcion tecleada por el usuario
	 * 
	 * @param opcion
	 *            char Indica valores en el rango 1-4
	 */
	private void procesarOpcion(char opcion) {
		switch (opcion) {
		case '1':
			mensajes = new Simulador().crearSimulacion(100);
			System.out.println("Mensajes Generados");
			break;
		case '2':
			gestor.tratarMensajes(mensajes);
			break;
		case '3':
			// Mostrar Listado de las incidencias con sus datos asociados
			// (Incidencia/Notas/Actuaciones)
			
			break;
		case '4':
			// Mostrar Errores y Presupuesto
			
			break;
		}
	}
}
