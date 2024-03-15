package Ficheros;

import java.util.Scanner;

public class Ejercicio09Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leídos dos números por teclado, restar al mayor el menor. 
		 * Por ejemplo, si A = 9 y B = 3 
		 * entonces se debe mostrar “el primero es mayor y la resta es 6“
		 */
		
		int num1,num2;
		double resta;
		System.out.println("Introduce num1: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce num2");
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			resta = num1 - num2;
			System.out.println("El primer número es mayor que el segundo y la resta es: "+resta);
		}
		else {
			resta = num2 - num1;
			System.out.println("El segundo número es mayor que el primero y la resta es = "+resta);
		}

	}

}
