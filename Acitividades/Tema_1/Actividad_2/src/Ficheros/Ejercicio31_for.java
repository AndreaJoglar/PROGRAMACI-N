package Ficheros;

import java.util.Scanner;

public class Ejercicio31_for {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Determinar si un número introducido por teclado es primo o no.
		 *  Un número primo solo es divisible por él mismo y por la unidad.
		 *  si es mayor de 2 y divisible entre él mismo y entre 1, pero no entre 2
		 *  leer núm
		 *  si % contador == 0 --> no es primo
		 *  repetir desde que contador es = 2 hasta num-1.
		 *  Si encontré un divisor, entonces es false
		 */
		
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		
		boolean encontreDivisor = false;
				
		for (int div = 2; div <= (num-1); div++) {
			if (num % div == 0) {
				encontreDivisor = true;
			}
		}
		if (encontreDivisor == true) {
			System.out.println("El número no es primo.");
		}
		else {
			System.out.println("El número es primo.");
		}
	
	}

}
