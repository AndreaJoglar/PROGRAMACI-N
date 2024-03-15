package Ficheros;

import java.util.Scanner;

public class ejercicio_02 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v[]= new int[10];
		leerVector(v);
		mostrarInverso(v);

	}
	
	/**
	 * Funcion que lee 10 numeros enteros y
	 * los almacena en un vector
	 * @param v vector de enteros
	 */
	public static void leerVector (int v[]) {
		for (int i = 0; i< v.length; i++) {
			System.out.println("["+i+"]" );
			v[i] = teclado.nextInt();
		}
	}
	
	/**
	 * Funcion que muestra los elementos de un vector
	 * indicando para cada elemento su posicion en orden inverso
	 * @param v vector de enteros
	 */
	public static void mostrarInverso (int v[]) {
		for (int i = v.length-1; i >= 0; i--) {
			System.out.println("["+i+"] "+v[i]);
		}
	}

}
