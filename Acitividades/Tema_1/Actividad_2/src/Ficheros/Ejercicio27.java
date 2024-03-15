package Ficheros;

import java.util.Scanner;

public class Ejercicio27 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Diseña un algoritmo que pida números 
		 * hasta que se le introduzca un número mayor que 100.
		 * leer num
		 * repetimos mientras num < 100;
		 * para cuando es > 100;
		 */
		
		boolean condicion = true;
		
		while (condicion == true) {
			System.out.println("Introduce un número: ");
			int num = teclado.nextInt();
			if (num > 100) {
				condicion = false;
			}
		}
		System.out.println("¡¡FIN!!");

	}

}
