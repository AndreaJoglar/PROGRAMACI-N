package Ficheros;

import java.util.Scanner;

public class Ejemplo1 {
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Saca por pantalla un mensaje si la edad
		 * leída por teclado es mayor de edad
		 */
		
		int edad;
		// leemos la edad por teclado
		
		System.out.println("Introduce edad: ");
		edad = teclado.nextInt();
		
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("Es menor de edad");
		}
		// else sirve para sacar un mensaje en caso de que no se cumpla la condición
		

	}

}
