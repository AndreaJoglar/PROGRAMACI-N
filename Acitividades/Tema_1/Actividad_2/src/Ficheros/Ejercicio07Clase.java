package Ficheros;

import java.util.Scanner;

public class Ejercicio07Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Determinar si un año pedido por teclado es bisiesto o no
		/*Un año es bisiesto cuando:
		* es divisible entre 4, pero no entre 100
		* es divisible entre 100 y 400
		* Si es divisible entre 100, pero no entre 400 NO es bisiesto
		*/
		int anio;
		System.out.println("Introduce un año: ");
		anio = teclado.nextInt();
		
		if ((anio % 4 == 0) && (anio % 100 != 0)) {
			System.out.println("El año es bisiesto.");
		}
		else {
			if (anio % 400 == 0) {
				System.out.println("El año es bisiesto.");
			}
			else {
				System.out.println("El año no es bisiesto.");
			}
		
		}

	}

}
