package Ficheros;

import java.util.Scanner;

public class ejercicio8d {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
			
		// TODO Auto-generated method stub
		/* leer una secuencia de números 
		 * y mostrar solo los pares por pantalla.
		 * La secuencia acaba cuando metemos un cinco.
		 */
		
		boolean condicion = true;
		
		while (condicion == true) {
			System.out.println("Introducir número: ");
			int num = teclado.nextInt();
			if (num %2 == 0) {
				System.out.println("Número: "+num);
			}
			if (num % 2 != 0) {
				System.out.println("El número es impar");
			}
			if (num == 5) {
				condicion = false;
			}
		} // acaba el bucle
		System.out.println("Acabóse");
	
	}	
}