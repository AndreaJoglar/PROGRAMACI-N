package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio02Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* primera columna dibujar 1 columna++
		 * segunda dibujar 2 columna++
		 * tercera dibujar 3 columna++
		 * cuarta dibujar 4 columna++
		 */
		
		System.out.println("Introduce un número: ");
		int tope = teclado.nextInt();
		
		for (int filas = 1; filas <= tope; filas++) {
			for (int num = 1; num <= filas; num++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		for (int filas = 1; filas <= tope - 1; filas++) {
			for (int num = 1; num <= tope - filas; num++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	
	}

}
