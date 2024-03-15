package Ficheros;

import java.util.Scanner;

public class Ejer31_extraDiv {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calcular divisores de un número
		
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		
		int div = 1;
		
		while (div <= (num)) {
			if (num % div == 0) {
				System.out.println("El número "+div+" es divisor");
			}
			div++;
		}
	}
}
