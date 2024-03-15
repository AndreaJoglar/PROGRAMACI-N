package Ficheros;

import java.util.Scanner;

public class ejercicio03Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero: ");
		int num = teclado.nextInt();
		
		if (Libreria.esNegativo(num) == true) {
			System.out.println("Es negativo.");
		}
		else {
			System.out.println("Es positivo.");
		}
	}
}
