package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio01Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* cada fila tiene 9 asteriscos pintados
		 * las filas impares tienen 9 asteriscos correspondientes con la primera columna
		 * las filas pares tienen 10 columnas, la primera vacía (sin asterisco)
		 */
	
		for (int filas = 1; filas <= 6; filas++) {
			if (filas % 2 == 0) {
				System.out.print("  ");
			}
			for (int asterisco = 1; asterisco <= 9; asterisco++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
