package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio19 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir cantidad de números
		 * pedir números (double)
		 * calcular su suma
		 */
		
		System.out.println("¿Cuántos números vas a escribir?");
		int cantidad = teclado.nextInt();
		
		while (cantidad < 0) {
			System.out.println("¡Imposible! Vuelva a intentarlo: ");
			cantidad = teclado.nextInt();
		}
		
		double suma = 0;
		
		for (int cont = 1; cont <= cantidad; cont++) {
			System.out.println("Escriba el número "+cont+": ");
			double num = teclado.nextDouble();
			suma = suma + num; 
		}
		
		System.out.println("La suma de los números que has escrito es "+suma);

	}
}
