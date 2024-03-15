package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida primero dos números enteros (mínimo y máximo)
		 * y que después pida números enteros situados entre ellos. 
		 * El programa terminará cuando se escriba un número que no esté comprendido entre los dos valores iniciales.
		 * El programa termina escribiendo la cantidad de números escritos.
		 */
		
		System.out.println("Escribe el límite mínimo: ");
		int minimo = teclado.nextInt();
		System.out.println("Escribe el límite máximo: ");
		int maximo = teclado.nextInt();
		
		while (maximo <= minimo) {
			System.out.println("El límite máximo debe ser mayor que el mínimo. Inténtelo de nuevo: ");
			maximo = teclado.nextInt();
		}
		
		System.out.println("Escribe números entre "+minimo+" y "+maximo+" : ");
		double num = teclado.nextDouble();
		int cont = 0;
		
		while ((num >= minimo) && (num <= maximo)) {
			cont++;
			System.out.println("Escribe números entre "+minimo+" y "+maximo+" : ");
			num = teclado.nextDouble();
		}
		if (cont > 1) {
			System.out.println("Ha escrito "+cont+" números entre "+minimo+" y "+maximo+".");
		}
		if (cont == 1) {
			System.out.println("Ha escrito "+cont+" número entre "+minimo+" y "+maximo+".");
		}
		if (cont == 0) {
			System.out.println("No ha escrito ningún número entre "+minimo+" y "+maximo+".");
		}
		
		
		
	}

}
