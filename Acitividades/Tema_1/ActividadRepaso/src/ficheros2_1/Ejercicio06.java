package ficheros2_1;

import java.util.Scanner;

public class Ejercicio06 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir un programa que pida al usuario un número entero 
		 * y muestre por pantalla un triángulo rectángulo como el de más abajo.
		 */
		
			
		System.out.println("Introduce un número de filas: ");
		int filas = teclado.nextInt();
		
		for (int contFila = 1; contFila <= filas; contFila++) {
			System.out.println();
			int num = (2 * contFila) - 1;
			for (int contColumna = 1; contColumna <= contFila; contColumna++) {
				if (contColumna > 1) {
					num = num -2;
				}
				System.out.print(num+" ");
			}
		}
	}
}
