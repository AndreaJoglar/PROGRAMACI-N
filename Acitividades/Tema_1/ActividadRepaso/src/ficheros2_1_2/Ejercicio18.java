package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio18 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir cantidad de números
		 * pedir números hasta esa cantidad
		 * mostrar cuántos son pares y cuántos impares.
		 */
		
		System.out.println("¿Cuántos números vas a escribir?");
		int cantidad = teclado.nextInt();
		
		while (cantidad < 0) {
			System.out.println("¡Imposible! Vuelve a intentarlo: ");
			cantidad = teclado.nextInt();
		}
		
		int contPares = 0;
		int contImpares = 0;
		
		for (int cont = 1; cont <= cantidad; cont++) {
			System.out.print("Escriba el número "+cont+": ");
			int num = teclado.nextInt();
			if (num % 2 == 0) {
				contPares++;
			}
			else {
				contImpares++;
			}
		}
		
		System.out.println("Has escrito "+contPares+" números pares y "+contImpares+" números impares.\nGracias por su colaboración.");

	}

}
