package Ficheros;

import java.util.Scanner;

public class ejercicio17 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el valor de a: ");
		int a = teclado.nextInt();
		System.out.println("Introduce el valor de b: ");
		int b = teclado.nextInt();
		System.out.println("Introduce el valor de c: ");
		int c = teclado.nextInt();
		
		Libreria.ecuacion2Grado(a, b, c);

	}

}
