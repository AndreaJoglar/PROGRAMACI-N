package Ficheros;

import java.util.Scanner;

public class Ejercicio24_while {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Calcula la media de diez números que pedimos por teclado,
		 * Generaliza la solución para una cantidad cualquiera de números que pediremos al principio.
		 * leer num
		 * suma = suma + num (repetir 10 veces)
		 * media = suma / 10
		 */
		
		int cont = 1;
		int suma = 0;
		
		while (cont <= 10) {
			System.out.println("Número ("+cont+"): ");
			int num = teclado.nextInt();
			suma = suma + num;
			cont++;
		}
		double media = suma / 10.0;
		System.out.println("La media es: "+media);
		
		
		
		

	}

}
