package Ficheros;

import java.util.Scanner;

public class ejercicio8c {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
			
		// TODO Auto-generated method stub
		/* leer una secuencia de números y mostrarlos
		 * si son pares 
		 */
		
		boolean condicion = true;
		
		while (condicion == true) {
			System.out.println("Introducir número: ");
			int num = teclado.nextInt();
			if (num %2 == 0) {
				System.out.println("Número: "+num);
			}
			else {
				condicion = false;
			}
		}
	
	}	
}