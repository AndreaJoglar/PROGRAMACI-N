package Ficheros;

import java.util.Scanner;

public class EjercicioClase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Media números positivos múltiplos de 5.
		 * Si se introduce un 0, la secuencia finaliza.
		 * Si se introduce un negativo, no se incluye en la media
		 */
		
		int num, suma, cont;
		num = 1;
		cont = 0;
		suma = 0;
		double media;
		
		while (num != 0) {
			System.out.println("Introduce un número: ");
			num = teclado.nextInt();
			if ((num % 5 == 0) && (num > 0)) {
				suma = num + suma;
				cont++;
			}
			if (num == 0) {
				System.out.println("¡¡Se acabó!!");
			}
		}
		if (suma > 0) {
			media = (double) suma/cont;
			System.out.println("La media de los números es "+media);
		}
		else {
			System.out.println("No se calcula la media. Introduce múltiplos de 5.");
		}
	}
}
