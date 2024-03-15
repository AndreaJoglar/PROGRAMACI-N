package Ficheros;

import java.util.Scanner;

public class Ejercicio5b {
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		//leemos el valor de a y b
		
		
		System.out.print("Introduce a: ");
		a = teclado.nextInt();
		System.out.print("Introduce b : ");
		b = teclado.nextInt();
		System.out.println("a = "+a+" b = "+b);
		
		// Intercambio sin variable auxiliar
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = "+a+" b = "+b);
		

	}

}
