package Ficheros;

import java.util.Scanner;

public class ejercicio21 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Numero binario. \n2. Numero decimal.");
		int opcion = teclado.nextInt();
		while ((opcion != 1) && (opcion != 2)) {
			System.out.println("1. Numero binario. \n2. Numero decimal.");
			opcion = teclado.nextInt();
		}
		Libreria.conversorBinDec(opcion);
	}
}
