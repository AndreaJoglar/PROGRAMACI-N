package Ficheros;

import java.util.Scanner;

public class Ejercicio04 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Diseña un algoritmo que calcule la media de tres números
		 * que pediremos al usuario. 
		 * Se deben dar como resultado la media con decimales y redondeada
		 */
		/* leer los 3 números (los declaramos como int)
		 * media con decimales (double) = (num1 + num 2 + num3) / 3
		 * media sin decimales (int) = (num1 + num 2 + num3) / 3
		 */
		
		int num1, num2, num3;
		
		System.out.println("Num 1: ");
		num1 = teclado.nextInt();
		System.out.println("Num 2: ");
		num2 = teclado.nextInt();
		System.out.println("Num 3: ");
		num3 = teclado.nextInt();
		
		int suma = (num1 + num2 + num3); // creamos suma para abreviar después la operación, pero podría dejarse (num1 + num2 + num3)
		double mediaConDecimales = suma / 3.0; // para que salgan los decimales hay que añadir decimales a la división
		int mediaSinDecimales = suma / 3;
		System.out.println("Media con decimales = "+ mediaConDecimales);
		System.out.println("Media sin decimales = "+ mediaSinDecimales);
		
	}

}
