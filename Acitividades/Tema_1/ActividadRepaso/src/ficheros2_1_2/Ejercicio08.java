package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio08 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida dos números enteros 
		 * y que escriba si el mayor es múltiplo del menor.
		 */
		
		System.out.println("Introduce un número: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduce otro número: ");
		int num2 = teclado.nextInt();
		
		
		if (num1 == num2) {
			System.out.println("Son el mismo número, por lo tanto son múltiplos.");
		}
		else {
			if (num1 > num2) {
				if (num1 % num2 == 0) {
					System.out.println(num1+" es múltiplo de "+num2+".");
				}
				else {
					System.out.println(num1+" no es múltiplo de "+num2+".");
				}
			}
			else {
				if (num2 % num1 == 0) {
					System.out.println(num2+" es múltiplo de "+num1+".");
				}
				else {
					System.out.println(num2+" no es múltiplo de "+num1+".");
				}
				
			}
		}
	}

}
