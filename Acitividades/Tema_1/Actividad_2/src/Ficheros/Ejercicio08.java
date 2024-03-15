package Ficheros;

import java.util.Scanner;

public class Ejercicio08 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Determinar si un número real pedido por teclado tiene o no decimales
		
		double num;
		System.out.println("Introduce un número: ");
		num = teclado.nextDouble();
		
		if (num % 1 == 0) {
			System.out.println("El número no tiene decimales");
		}
		else {
			System.out.println("El número tiene decimales");
		}
	}

}
