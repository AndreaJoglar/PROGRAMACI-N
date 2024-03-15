package Ficheros;

import java.util.Scanner;

public class ejercicio04 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		if (num < 0) {
			System.out.println("ERROR. No se puede calcular la raíz de un número negativo.");
		}
		else {
			System.out.println("Raiz entera = "+Libreria.raizEntera(num));
		}
	}
}
