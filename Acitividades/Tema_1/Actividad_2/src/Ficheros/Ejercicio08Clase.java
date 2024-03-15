package Ficheros;

import java.util.Scanner;

public class Ejercicio08Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Determinar si un número real pedido por teclado tiene o no decimales (con variable)
		
		double num; 
		
		System.out.println("Introduce número: ");
		num = teclado.nextDouble();
		
		int temp = (int) num;
		
		if (num == temp) {
			System.out.println("No tiene decimales");
		}
		else {
			System.out.println("Tiene decimales");
		}
		

	}

}
