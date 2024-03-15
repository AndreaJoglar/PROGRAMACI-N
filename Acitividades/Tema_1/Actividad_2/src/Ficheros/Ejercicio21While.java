package Ficheros;

import java.util.Scanner;

public class Ejercicio21While {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir todos los números pares entre 1 y 20
		 */
		
		int valor = 1;
		
		while (valor <= 20) {
			if (valor % 2 == 0) {
				System.out.println("Número par "+valor);
			}
			valor++;
		}

	}

}
