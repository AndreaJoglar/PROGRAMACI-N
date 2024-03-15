package Ficheros;

import java.util.Scanner;

public class Ejercicio10b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Conversor de Fahrenheit a Celsius
		 * F = (C * (9/5))+32
		 * C = (F - 32) * (5/9)
		 */
		
		System.out.println("Indica la unidad de temperatura que vas a usar (1 = Fahrenheit 2 = Celsius");
		int unidad = teclado.nextInt();
		
		double temperaturaF;
		double temperaturaC;
		
		while ((unidad != 1) && (unidad != 2)) {
			System.out.println("Error. Por favor, introduzca 1 (Fahrenheit) o 2 (Celsius): ");
			unidad = teclado.nextInt();
		}
		
		if (unidad == 1) {
			System.out.println("Introduzca la temperatura: ");
			temperaturaF = teclado.nextDouble();
			temperaturaC = (temperaturaF - 32) * 5/9;
			System.out.println("Temperatura en Celsius = "+temperaturaC);
		}
		else {
			System.out.println("Introduzca la temperatura: ");
			temperaturaC = teclado.nextDouble();
			temperaturaF = (temperaturaC * 9/5) + 32;
			System.out.println("Temperatura en Fahrenheit = "+temperaturaF);
		}
		
	}

}
