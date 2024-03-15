package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio13 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Indicar si un número
		 * pedir por teclado
		 * es palíndromo
		 */
		
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		int temp = num;
		
		int nuevoNum = 0;
		
		while (temp > 0) {
			int cifra = temp % 10;
			nuevoNum = (nuevoNum * 10) + cifra;
			temp = temp / 10;
		}
		if (num == nuevoNum) System.out.println("Es palíndromo.");
		else System.out.println();

	}

}
