package ficheros2_1;

import java.util.Scanner;

public class Ejercicio08Factorial {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Factorial de un número.
		 * Leer por teclado un número entero N no negativo
		 * mostrar el factorial de todos los números desde 0 hasta N.
		 * El factorial de un número entero se expresa mediante el símbolo ‘!’ y se define de la siguiente forma:
		 * Si n = 0 entonces 0! = 1
		 * Si n > 0 entonces
		 * n! = n * (n – 1) * (n – 2) * …. * 3 * 2 * 1
		 * Por ejemplo, n = 5 entonces
		 * 5! = 5 * 4 * 3 * 2 * 1 = 120
		 */
		
		System.out.println("Introduce un número: ");
		int N = teclado.nextInt();
			
		for (int num = 0; num <= N; num++) {
			int fact = 1;
			for (int cont = 1; cont <= num; cont++) {
				fact = fact * cont;
			}
			System.out.println(num+"! : "+fact);
		}

	}

}
