package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio01 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida dos números y que escriba su media aritmética.
		 * Se recuerda que la media aritmética de dos números es la suma de ambos números dividida por 2.
		 */
		
		System.out.println("Introduce el primer número: ");
		double num1 = teclado.nextDouble();
		System.out.println("Introduce el segundo número: ");
		double num2 = teclado.nextDouble();
		
		double media = (num1 + num2)/ 2;
		
		System.out.println("La media aritmética de "+num1+" y "+num2+" es "+media);

	}

}
