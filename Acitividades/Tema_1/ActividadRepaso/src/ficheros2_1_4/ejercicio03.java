package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio03 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* imprimir forma diamante con asteriscos
		 */
		System.out.println("Introduce un número: ");
		int tope = teclado.nextInt();
		//pico
		for (int espacio = 1; espacio < tope; espacio++) {
			System.out.print("  ");
		}
		System.out.println(" *");
		//triángulo superior
		for (int filas = 1; filas <= tope; filas++) {
			
			//espacios
			for (int espacio = 1; espacio <= tope - filas; espacio++) {
				System.out.print("  ");
			}
			//asteriscos
			for (int columna = 1; columna <= filas * 2; columna++) {
				System.out.print("* ");		
			}
			System.out.println();
		}
		//triángulo inferior
		for (int filas = 1; filas < tope; filas++) {
			//espacios
			for (int espacio = 1; espacio <= filas; espacio++) {
				System.out.print("  ");
			}
			//asteriscos
			for (int columna = 1; columna <= (tope- filas) * 2; columna++) {
				System.out.print("* ");		
			}
			System.out.println();
		}
		//pico
		for (int espacio = 1; espacio < tope; espacio++) {
			System.out.print("  ");
		}
		System.out.print(" *");
	}

}
