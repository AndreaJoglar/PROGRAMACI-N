package Ficheros;

import java.util.Scanner;

public class posicionCifra {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		System.out.println("Introduce una posicion dentro del numero: ");
		int posicion = teclado.nextInt();
		
		Libreria.numPosXInv(num, posicion);

	}

}
