package Ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir 3 double
		 * mientras el usuario escriba números mayores que el primero
		 */
		System.out.println("Introduce un número: ");
		double num = teclado.nextDouble();
		
		System.out.println("Escriba un número mayor que "+num+": ");
		double mayor = teclado.nextDouble();
		
		while (mayor > num) {
			System.out.println("Escribe un número mayor que "+num+": ");
			mayor = teclado.nextDouble();
		}
		if (mayor <= num) System.out.println(mayor+" no es mayor que "+num+".");
	}
}
