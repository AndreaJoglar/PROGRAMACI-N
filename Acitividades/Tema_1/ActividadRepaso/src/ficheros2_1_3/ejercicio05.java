package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio05 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* determinar si un número es mágico
		 * ejemplo: num = 12345
		 * Si las posiciones pares las ocupan números pares
		 * y las posiciones impares las ocupan números impares
		 */
		
		int cifra = 0;
		int posicion = 0;
		int cifraMagica= 0;
		
		System.out.println("Escribe un número: ");
			
		for (int num = teclado.nextInt(); num > 0; num = num / 10) {
			cifra = num % 10;
			posicion++;
			System.out.println("Cifra ("+posicion+"): "+cifra);
			if ((cifra % 2 == 0) && (posicion % 2 == 0)) {
				cifraMagica++;
			}
			else {
				if ((cifra % 2 != 0) && (posicion % 2 != 0)) {
					cifraMagica++;
				}
			}
			cifra++;
		}
		if (cifraMagica == posicion) {
			System.out.println("\n¡Número mágico!");
		}
		else {
			System.out.println("\n¡Oooh! No es un número mágico.");
		}
	}
}
