package Ficheros;

import java.util.Scanner;

public class Ejercicio11 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Diseña un algoritmo que determine si tres números que pedimos por
		 * teclado están ordenados de mayor a menor (NO consiste en ordenar,
		 * solo indicar si están ordenados o no).
		 */
		
		System.out.println("Introduce un número: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduce otro número: ");
		int num2 = teclado.nextInt();
		System.out.println("Introduce otro número: ");
		int num3 = teclado.nextInt();
		
		if ((num1 > num2) && (num2 > num3)) {
			System.out.println("Los números están ordenados de mayor a menor");
		}
		else {
			System.out.println("Los números no están ordenados de mayor a menor");
		}
	}
}
