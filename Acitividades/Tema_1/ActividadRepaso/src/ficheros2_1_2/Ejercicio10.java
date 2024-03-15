package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida números enteros
		 * mientras sean cada vez más grandes.
		 */
		
		System.out.println("Introduzca un número: ");
		int num1 = teclado.nextInt();
		System.out.println("Escribe un número mayor que "+num1+": ");
		int num2 = teclado.nextInt();
		
				
		while (num2 > num1) {
			num1 = num2;
			System.out.println("Escribe un número mayor que "+num1+": ");
			num2 = teclado.nextInt();
		}
		if (num2 <= num1) {
			System.out.println(num2+" no es mayor que "+num1+".");
		}
		

	}

}
