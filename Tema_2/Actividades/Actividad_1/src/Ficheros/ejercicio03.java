package Ficheros;

import java.util.Scanner;

public class ejercicio03 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		
		if (esPositivo(num) == true) {
			System.out.println("El número "+num+" es positivo.");
		}
		else {
			System.out.println("El número "+num+" es negativo.");
		}
	}
	/*
	 * necesita: variable número por teclado
	 * produce: decide si el número es positivo o negativo
	 * devuelve: un booleano
	 */
	public static boolean esPositivo (int num) {
		boolean positivo = true;
		if (num < 0) {
			positivo = false;
		}
		return positivo;
	}
}
