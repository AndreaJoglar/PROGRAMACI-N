package Ficheros;

import java.util.Scanner;

public class ejercicio09 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		
		System.out.println("El número tiene "+Libreria.numeroCifras(num)+" cifras.");
	}

}
