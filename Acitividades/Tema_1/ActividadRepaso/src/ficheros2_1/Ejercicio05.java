package ficheros2_1;

import java.util.Scanner;

public class Ejercicio05 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir un programa que pida al usuario un número entero
		 * y muestre por pantalla un triángulo rectángulo invertido como el de más abajo,
		 *  de altura el número introducido.
		 */
		
		System.out.println("Introduce un número de filas: ");
		int num = teclado.nextInt();
		
		
		for (int filas = 1; filas <= num; filas++) {
			System.out.println();
			for (int columna = 1; columna <= filas; columna++) {
				System.out.print("* ");
				
			}
		}
		

	}

}
