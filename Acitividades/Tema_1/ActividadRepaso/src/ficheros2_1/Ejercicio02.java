package ficheros2_1;

import java.util.Scanner;

public class Ejercicio02 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir un programa que pida al usuario un número entero positivo
		 * y muestre por pantalla todos los números impares
		 * desde 1 hasta ese número separados por comas.
		 */
		
		System.out.println("Introduce un número positivo: ");
		int num = teclado.nextInt();
		
		while (num < 0) {
			System.out.println("No me vaciles, anda. Introduce un número positivo:");
			num = teclado.nextInt();
		}
		
		if (num % 2 == 0) {
			num--;
		}
		
		for (int contNum = 1; contNum <= num; contNum++) {
			if (contNum % 2 != 0) {
				System.out.print(contNum);
			}
			if (contNum % 2 == 0) {
				System.out.print(", ");
			}
		}
		
		
	
	}

}
