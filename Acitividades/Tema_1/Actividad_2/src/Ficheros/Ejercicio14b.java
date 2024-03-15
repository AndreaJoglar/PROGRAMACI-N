package Ficheros;

import java.util.Scanner;

public class Ejercicio14b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Invertir un número. Por ej.: 364 = 463
		 * a partir del ejercicio 14
		 */
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		
		int cont = 0;
		int cifra;
		int nuevoNum = 0;
		
		while (num > 0) {
			cifra = num % 10;
			num = num / 10;
			cont = cont + 1;
			nuevoNum = (nuevoNum * 10) + cifra;
		}
		System.out.println("Número de cifras: "+cont);
		System.out.println("El número invertido es "+nuevoNum);

	}

}
