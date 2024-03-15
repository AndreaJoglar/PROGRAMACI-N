package Ficheros;

import java.util.Scanner;

public class Clase4b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduce otro número: ");
		int num2 = teclado.nextInt();
		
		int opcion = Libreria.menu();
		
		if (opcion == 1) {
			if ((Libreria.numeroDeDigitos(num1)) == (Libreria.numeroDeDigitos(num2))) {
				if (Libreria.numeroInvertido(num1) == num2) {
					System.out.println("Son cuñados.");
				}
				else System.out.println("No son cuñados.");
			}
		}
		else {
			boolean encontreDigito = false;
			while (num2 > 0) {
				int cifraNum2 = num2 % 10;
				if (Libreria.contieneDigito(num1, cifraNum2) == true) {
					encontreDigito = true;
				}
				num2 = num2/10;
			}
			if (encontreDigito == true) {
				System.out.println("Son familia");
			}
			else {
				System.out.println("No son familia");
			}
		}

	}

}
