package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio05 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Mejorar el programa anterior para que tenga en cuenta si el divisor es cero, 
		 * que muestre un mensaje indicando que no se puede dividir
		 */
		
		System.out.println("Escribe el dividendo: ");
		int dividendo = teclado.nextInt();
		System.out.println("Escribe el divisor: ");
		int divisor = teclado.nextInt();
		
	
		if (divisor == 0) {
			System.out.println("No se puede dividir por cero");
		}
		else {
			int resto = dividendo % divisor;
			int cociente = dividendo / divisor;
			if (dividendo % divisor == 0) {
				System.out.println("La división es exacta. Cociente: "+cociente+".");
			}
			else {
				System.out.println("La división no es exacta. Cociente: "+cociente+". Resto: "+resto+".");
			}
		}
		
		
	

	}

}
