package ficheros2_1;

import java.util.Scanner;

public class Ejercicio06b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir un programa que pida al usuario un número entero 
		 * y muestre por pantalla un triángulo rectángulo como el de más abajo.
		 */
		
			
		System.out.println("Introduce un número de filas: ");
		int filas = teclado.nextInt();
		
		for (int contFila = 1; contFila <= filas; contFila++) {
			int num = (2 * contFila) - 1;
			for (int valor = num; valor >=1; valor-=2) {
				System.out.print(valor+" ");
			}
			System.out.println();	
		}
		
	}
}
