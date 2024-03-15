package Ficheros;

import java.util.Scanner;

public class Ejercicio30bClase {
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Diseñar el algoritmo que indique el mayor de una serie de números que introducimos por teclado.
		 * Crea dos versiones: 
		 * en la primera la cantidad está definida 
		 * en la segunda será indefinida.
		 */
		 System.out.println("Introduce la cantidad de números que vayas a poner: ");
		 int cant = teclado.nextInt();
		 
		 		 
		 System.out.println("Introduzca un número: ");
		 int num = teclado.nextInt();
		 int mayor = num;
		 
		 for (int cont = 2; cont <= cant; cont++) {
			 System.out.println("Introduzca un número: ");
			 num = teclado.nextInt();
			 if (num > mayor) {
				 mayor = num;
			 }
		 }
		 System.out.println("El mayor es "+mayor);
		 
		

	}

}
