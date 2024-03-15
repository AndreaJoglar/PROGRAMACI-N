package Ficheros;

import java.util.Scanner;

public class Ejercicio05 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Determinar si un número leído por teclado es positivo o negativo
		
		int num;
		System.out.println("Introduce número: ");
		num = teclado.nextInt();
		
		if (num >= 0) { // para los informáticos "0" es el primer número positivo
			System.out.println("Número positivo");
		}
		else  {
			System.out.println("Número negativo");
		}

	}

}
