package Ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el primer número: ");
		double num1 = teclado.nextDouble();
		System.out.println("Introduce el segundo número: ");
		double num2 = teclado.nextDouble();
		System.out.println("Introduce el tercer número: ");
		double num3 = teclado.nextDouble();
		
		if ((num1 == num2) && (num2 == num3)) {
			System.out.println("Ha escrito tres veces el mismo número.");
		}
		else {
			if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
				System.out.println("Ha escrito uno de los números dos veces.");
			}
			else {
				System.out.println("Los tres números que ha escrito son distintos.");
			}
		}

	}

}
