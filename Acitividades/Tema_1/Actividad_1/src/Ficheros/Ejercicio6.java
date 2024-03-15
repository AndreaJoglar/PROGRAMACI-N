package Ficheros;

import java.util.Scanner;

public class Ejercicio6 {
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* A, B Y C
		 * B tome el valor de A original
		 * C tome el valor de B original
		 * A tome el valor de C original
		 */
		// Resolver con una sola variable
		
		int a, b, c;
		System.out.print("Introduce a: ");
		a = teclado.nextInt();
		System.out.print("Introduce b: ");
		b = teclado.nextInt();
		System.out.print("Introduce c: ");
		c = teclado.nextInt();
		System.out.println("a = "+a+" b = "+b+" c = "+c);
		
		int tempb = b;
		b = a;
		a = c;
		c = tempb;
		System.out.println("a = "+a+" b = "+b+" c = "+c);
		
		

		

	}

}
