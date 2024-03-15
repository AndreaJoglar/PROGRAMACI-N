package Ficheros;

import java.util.Scanner;

public class ejercicio13 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero: ");
		int num = teclado.nextInt();
		
		if (Libreria.esPrimo(num)==true) {
			System.out.println("El numero es primo.");
		}
		else System.out.println("El numero no es primo.");

	}

}
