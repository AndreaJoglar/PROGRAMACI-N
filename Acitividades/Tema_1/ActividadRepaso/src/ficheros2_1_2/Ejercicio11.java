package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio11 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida la cantidad de números positivos que se tienen que escribir
		 * y a continuación pida números 
		 * hasta que se haya escrito la cantidad de números positivos indicada.
		 */
		
		System.out.println("Escribe la cantidad de números positivos que vayas a escribir: ");
		int cantidad = teclado.nextInt();
		
		
		while (cantidad <= 0) {
			System.out.println("La cantidad debe ser mayor que 0. Inténtelo de nuevo: ");
			cantidad = teclado.nextInt();
		}
		
		int cont = 0; 
		int contPositivos = 0;
		int contNum = 0;
		
		while (cont < cantidad) {
			System.out.println("Escriba un número: ");
			int num = teclado.nextInt();
			if (num > 0) {
				contPositivos++;
				contNum++;
				cont++;
			}
			else {
				contNum++;
			}
		}
		if (contPositivos == 0) {
			System.out.println("No has escrito números positivos.");
		}
		else {
			if (contPositivos == 1) {
				if (contNum == 1) {
					System.out.println("Has escrito "+contPositivos+" número positivo.");
				}
				else {
					System.out.println("Has escrito "+contNum+" números, "+contPositivos+" de ellos positivo.");
				}
			}
			else {
				System.out.println("Has escrito "+contNum+" números, "+contPositivos+" de ellos positivos.");
			}
		}
	}

}
