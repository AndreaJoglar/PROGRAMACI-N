package ficheros2_1;

import java.util.Scanner;

public class Ejercicio03 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir número entero positivo a usuario
		 * mostrar cuenta atrás desde número hasta cero
		 * SEPARADOS POR COMAS
		 */
		
		System.out.println("Escribe un número positivo: ");
		int num = teclado.nextInt();
		
		while (num < 0) {
			System.out.println("ERROR: número negativo. Por favor, escribe un número positivo: ");
			num = teclado.nextInt();
		}
		
		while (num >= 0) {
			if (num == 0) {
				System.out.print(num+".");
			}
			else {
				System.out.print(num+", ");
			}
			num--;
		}
	}
}