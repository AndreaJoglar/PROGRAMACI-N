package Ficheros;

import java.util.Scanner;

public class Ejercicio26 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Mostrar el mensaje “¿Desea terminar (s/n)?” 
		 * el programa terminará cuando el usuario pulse ‘S’ o ‘s’, 
		 * en otro caso el programa continuará indefinidamente.
		 * leer car
		 * repetir mientras el car sear distinto de 'S' y sea distinto de 's' (condicion == true).
		 * if (car == 'S' y car == 's')
		 * condicion = false;
		 */
		
		boolean cond = true;
		
		while (cond == true) {
			System.out.println("¿Desea terminar (s/n)? ");
			String cadena = teclado.next();
			char caracter = cadena.charAt(0);
			if ((caracter == 'S') || caracter == 's') {
				cond = false;
			}
		}
		System.out.println("¡¡FIN!!");
		
		

	}

}
