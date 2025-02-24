package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio05Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* determinar si un número es mágico
		 * ejemplo: num = 12345
		 * Si las posiciones pares las ocupan números pares
		 * y las posiciones impares las ocupan números impares
		 */
		
		System.out.println("Escribe un número: ");
		int num = teclado.nextInt();
		
		int posAct = 0;
		boolean esMagico = true;
		
		while (num > 0 && esMagico == true) { //en el momento en el que una cifra no coincida con la posición, se sale del bucle
			int cifra = num % 10;
			num = num / 10;
			posAct++;
			if ((posAct % 2 == 0) && (cifra % 2 != 0)) {
				esMagico = false;
			}
			if ((posAct % 2 != 0) && (cifra % 2 == 0)) {
				esMagico = false;
			}
		}
		if (esMagico == true) {
			System.out.println("¡Número mágico!");
		}
		else {
			System.out.println("No es un número mágico.");
		}
	}
}
