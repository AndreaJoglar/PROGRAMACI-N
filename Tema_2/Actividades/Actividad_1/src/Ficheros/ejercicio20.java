package Ficheros;

import java.util.Scanner;

public class ejercicio20 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el primer número: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		int num2 = teclado.nextInt();
		System.out.println("Introduce el tercer número: ");
		int num3 = teclado.nextInt();
		
		Libreria.ordenadosMenMay(num1, num2, num3);
	}
}
