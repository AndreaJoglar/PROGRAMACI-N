package ficheros2_1;

import java.util.Scanner;

public class EjercicioCifras {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Contar número cifras pares de un número
		
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		int cifra;
		int cont = 0;
		
		while (num > 0) {
			cifra = num % 10;
			if (cifra % 2 == 0) {
				cont++;
				System.out.println("El número "+cifra+" es par");
			}
			num = num/10;
		}
		System.out.println("Número cifras pares = "+cont);

	}

}
