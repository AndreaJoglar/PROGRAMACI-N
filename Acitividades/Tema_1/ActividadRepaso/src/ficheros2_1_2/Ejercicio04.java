package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio04 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir un programa que pida dos números por teclado,
		 * el dividendo y un divisor.
		 * Escribir un mensaje que determine si la división es exacta o no.
		 */
		
		System.out.println("Escribe el dividendo: ");
		int dividendo = teclado.nextInt();
		System.out.println("Escribe el divisor: ");
		int divisor = teclado.nextInt();
		
		int resto = dividendo % divisor;
		int cociente = dividendo / divisor;
		
		if (dividendo % divisor == 0) {
			System.out.println("La división es exacta. Cociente: "+cociente+".");
		}
		else {
			System.out.println("La división no es exacta. Cociente: "+cociente+". Resto: "+resto+".");
		}

	}

}
