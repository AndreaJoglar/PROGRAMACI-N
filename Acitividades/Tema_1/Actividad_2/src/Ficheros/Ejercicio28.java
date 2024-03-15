package Ficheros;

import java.util.Scanner;

public class Ejercicio28 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implementar un algoritmo que pida números 
		 * hasta que el número leído este entre 1 y 5, en ese momento se debe salir.
		 */
		boolean condicion = true;
		
		while (condicion == true) {
			System.out.println("Introduce un número: ");
			int num = teclado.nextInt();
			if ((num >= 1) && (num <= 5)) {
				condicion = false;
			}
		}
		System.out.println("¡¡FIN!!");

	}

}
