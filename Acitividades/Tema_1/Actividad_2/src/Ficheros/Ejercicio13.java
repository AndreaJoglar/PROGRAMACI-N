package Ficheros;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Dados 2 números enteros, 
		 * implementar un algoritmo que calcule el
		 * cociente y el resto mediante restas sucesivas.
		 * 1) dividendo - divisor
		 * 2) cociente == número de restas
		 * 3) resto == resultado de la resta
		 */
		System.out.println("Dividendo");
		int D = teclado.nextInt();
		System.out.println("Divisor");
		int d = teclado.nextInt();
		
		int resto = D;
		int cociente = 0;
		
		while (resto >= d) {
			resto = resto - d;
			cociente = cociente + 1;
		}
		System.out.println("Cociente= "+cociente+" Resto= "+resto);
	}

}
