package Ficheros;

import java.util.Scanner;

public class Ejercicio14 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Determinar el número de cifras de un número
		 * Ejemplo 9560 tiene 4 cifras
		 * 369 tiene 3 cifras
		 */
		
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		System.out.println(num);
		
		int cont = 0;
		
		while (num > 0) {
			num = num / 10;
			cont = cont + 1;
		}
		System.out.println("Número de cifras: "+cont);

	}

}
