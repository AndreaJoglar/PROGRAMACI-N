package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio06 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir un programa que pida dos números reales por teclado
		 * y determine cual es el menor y cual es el mayor
		 * o escriba si son iguales
		 */
		
		System.out.println("Escribe el primer número: ");
		double num1 = teclado.nextDouble();
		System.out.println("Escribe el segundo número: ");
		double num2 = teclado.nextDouble();
		
		if (num1 == num2) {
			System.out.println("Los números son iguales");
		}
		else {
			if (num1 > num2) {
				System.out.println("El primer número ("+num1+") es mayor que el segundo número ("+num2+").");
			}
			else {
				System.out.println("El segundo número ("+num2+") es mayor que el primer número ("+num1+").");
			}
		}

	}

}
