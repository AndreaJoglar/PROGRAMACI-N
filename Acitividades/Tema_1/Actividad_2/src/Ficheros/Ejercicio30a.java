package Ficheros;

import java.util.Scanner;

public class Ejercicio30a {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Diseñar el algoritmo que indique el mayor de una serie de números que introducimos por teclado.
		 * Crea dos versiones: 
		 * en la primera la cantidad está definida 
		 * en la segunda será indefinida.
		 */
		int num;
		int mayor; //siempre inicializamos el primer número que pedimos como el mayor
		
		System.out.println("Inserte un número: ");
		mayor = teclado.nextInt();
			
		for (int cont = 1; cont < 5; cont++) { // como inicializamos el primer número como el mayor, el contador va a ser 4 veces para que aparezcan 5 números
			System.out.println("Inserte un número: ");
			num = teclado.nextInt();
			if (num > mayor) {
				mayor = num;
			}
		}
		System.out.println("Número mayor = "+mayor);
	}

}
