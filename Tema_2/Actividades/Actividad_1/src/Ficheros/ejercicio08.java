package Ficheros;

import java.util.Scanner;

public class ejercicio08 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce número 1: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduce número 2: ");
		int num2 = teclado.nextInt();
		System.out.println("Introduce número 3: ");
		int num3 = teclado.nextInt();
		
		System.out.println("Ordenados: "+Libreria.ordenados(num1, num2, num3));
		
	}

}
