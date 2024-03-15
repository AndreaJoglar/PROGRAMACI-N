package Ficheros;

import java.util.Scanner;

public class ejercicio06 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		double num = teclado.nextDouble();
		
		if (Libreria.tieneDecimales(num) == true) {
			System.out.println("Tiene decimales.");
		}
		else {
			System.out.println("No tiene decimales.");
		}
	}
}
