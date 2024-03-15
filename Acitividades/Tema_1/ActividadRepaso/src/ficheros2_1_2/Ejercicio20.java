package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio20 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir dos números enteros (int)
		 * escribir suma de todos los enteros
		 * desde el primero hasta el segundo
		 */
		
		System.out.println("Escriba un número entero positivo: ");
		int inferior = teclado.nextInt();
		
		while (inferior < 0) {
			System.out.println("A ver, ho... Escribe un número entero positivo, anda: ");
			inferior = teclado.nextInt();
		}
		
		System.out.println("Escriba un número entero mayor que "+inferior+": ");
		int superior = teclado.nextInt();
		
		while (superior <= inferior) {
			System.out.println("¡Qué graciosín! A ver, artista, escribe un número entero mayor que "+inferior+": ");
			superior = teclado.nextInt();
		}
		
		int suma = 0;
		
		for (int cont = inferior; cont <= superior; cont++) {
			suma = suma + cont;
		}
		System.out.println("La suma desde "+inferior+" hasta "+superior+" es "+suma+".");
		
	}

}
