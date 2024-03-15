package ficheros2_1;

import java.util.Scanner;

public class ejercicio02b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir número entero positivo
		 * mostrar todos los impares
		 * desde 1 hasta el número
		 * SEPARADOS POR COMAS
		 */
		
		
		System.out.println("Introduce un número entero positivo: ");
		int num = teclado.nextInt();
		
		while (num < 0) {
			System.out.println("Por favor, introduce un número positivo: ");
			num = teclado.nextInt();
		}
		
		System.out.println("Números impares: ");
		
		for (int cont = 1; cont <= num; cont++) {
			if (cont % 2 != 0) {
				if ((cont == num) || cont == num - 1) {
					System.out.println(cont+".");
				}
				else {
					System.out.print(cont+", ");
				}
				
			}
		}

	}

}