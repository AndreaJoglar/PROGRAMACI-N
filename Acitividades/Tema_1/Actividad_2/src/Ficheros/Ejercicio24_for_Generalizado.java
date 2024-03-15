package Ficheros;

import java.util.Scanner;

public class Ejercicio24_for_Generalizado {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Calcula la media de diez números que pedimos por teclado,
		 * Generaliza la solución para una cantidad cualquiera de números que pediremos al principio.
		 * leer num
		 * suma = suma + num (repetir cantidad de veces que quiera el usuario)
		 * media = suma / cantidad
		 */
		
		
		int suma = 0;
		System.out.println("Cantidad de veces: ");
		double cantidad = teclado.nextInt();
		
		for (int cont = 1; cont <= cantidad; cont++) {
			System.out.println("Número ("+cont+"): ");
			int num = teclado.nextInt();
			suma = suma + num;
			
		}
		double media = suma / cantidad;
		System.out.println("La media es: "+media);
		
		
		
		

	}

}
