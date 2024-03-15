package Ficheros;

import java.util.Scanner;

public class Ejercicio09 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leídos dos números por teclado, restar al mayor el menor. 
		 * Por ejemplo, si A = 9 y B = 3 
		 * entonces se debe mostrar “el primero es mayor y la resta es 6“
		 */
		double num1, num2;
		double resta;
		System.out.println("Introduce un número: ");
		num1 = teclado.nextDouble();
		System.out.println("Introduce otro número: ");
		num2 = teclado.nextDouble();
				
		if (num1 > num2) {
			resta = num1 - num2;
			System.out.println("El primero es mayor y la resta es: "+resta);
		}
		else if (num2 > num1) {
			resta = num2 - num1;
			System.out.println("El segundo es mayor y la resta es: "+resta);
		}
		else {
			System.out.println("Los números son iguales y el resultado de la resta es 0");
		}


	}

}
