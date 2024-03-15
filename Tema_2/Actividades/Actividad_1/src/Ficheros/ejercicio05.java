package Ficheros;

import java.util.Scanner;

public class ejercicio05 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un año: ");
		int anio = teclado.nextInt();
		if (Libreria.esBisiesto(anio)==true) {
			System.out.println("Es bisiesto.");
		}
		else {
			System.out.println("No es bisiesto.");
		}
	}
}
