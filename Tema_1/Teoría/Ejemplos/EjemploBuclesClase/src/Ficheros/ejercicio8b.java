package Ficheros;

import java.util.Scanner;

public class ejercicio8b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		/* leer una secuencia de números y sumarlos
		 * hasta introducir el valor de 0 
		 */
		
		int suma = 0;
		boolean condicion = true;
		
		while (condicion == true) {
			System.out.println("Introducir número: ");
			int num = teclado.nextInt();
			if (num != 0) {
				suma = suma + num;
			}
			else {
				condicion = false;
			}
		}
	
	}	
}
