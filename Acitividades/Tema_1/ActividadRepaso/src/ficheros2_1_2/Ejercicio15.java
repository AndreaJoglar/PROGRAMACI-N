package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir número entero mayor que 0
		 * mostrar sus divisores
		 */
		
		System.out.println("Escriba un número mayor que cero: ");
		int num = teclado.nextInt();
		
		while (num <= 0) {
			System.out.println("Por favor, escriba un número mayor que cero: ");
			num = teclado.nextInt();
		}
		
		System.out.print("Los divisores de "+num+" son ");
		
		for (int divisor = 1; divisor <= num; divisor++) {
			if (num % divisor == 0) {
				System.out.print(divisor+" ");
			}
		}

	}

}
