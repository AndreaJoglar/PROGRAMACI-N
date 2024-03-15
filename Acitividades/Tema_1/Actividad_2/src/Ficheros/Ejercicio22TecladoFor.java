package Ficheros;

import java.util.Scanner;

public class Ejercicio22TecladoFor {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Suma todos los números impares que hay 
		 * entre dos números pedidos por teclado el resultado al final. 
		 */
		
		int inicio, fin; 
		System.out.println("Inicio: ");
		inicio = teclado.nextInt();
		System.out.println("Fin: ");
		fin = teclado.nextInt();
		
		int suma = 0;
		
		for (int num = inicio; num <= fin; num++) {
			if (num % 2 != 0) {
				suma = suma + num;
			}
		}
		System.out.println("Suma = "+suma);
	
	

	}

}
