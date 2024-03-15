package Ficheros;

import java.util.Scanner;

public class Ejercicio30b {
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Diseñar el algoritmo que indique el mayor de una serie de números que introducimos por teclado.
		 * Crea dos versiones: 
		 * en la primera la cantidad está definida 
		 * en la segunda será indefinida.
		 * Para al introducir un 0.
		 */
		 
		 System.out.println("Introduzca un número: ");
		 int num = teclado.nextInt();
		 int mayor = num;
		 
		 boolean cond = true;
		 if (num == 0) {
			 cond = false;
		 }
		 while (cond == true) {
			 System.out.println("Otro número: ");
			 num=teclado.nextInt();
			 if (num > mayor) {
				 mayor = num;
			 }
			 if (num == 0) {
				 cond = false;
			 }
		 }
		
		 System.out.println("Número mayor = "+mayor);

	}

}
