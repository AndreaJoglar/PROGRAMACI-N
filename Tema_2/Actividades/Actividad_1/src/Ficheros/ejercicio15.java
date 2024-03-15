package Ficheros;

import java.util.Scanner;

public class ejercicio15 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el dividendo: ");
		int D = teclado.nextInt();
		System.out.println("Introduce el divisor: ");
		int d = teclado.nextInt();
		
		int cociente = Libreria.cociente(D, d);
		System.out.println("Cociente = "+cociente);
		int resto = Libreria.resto(D, d);
		System.out.println("Resto = "+resto);
	}

}
