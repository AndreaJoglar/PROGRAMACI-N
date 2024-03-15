package ficheros2_1;

import java.util.Scanner;

public class Ejercicio05b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número de filas: ");
		int num = teclado.nextInt();
		
		
		for (int filas = num; filas >= 0; filas--) {
			System.out.println();
			for (int columna = filas; columna >= 1; columna--) {
				System.out.print("* ");
			}
		}

	}

}
