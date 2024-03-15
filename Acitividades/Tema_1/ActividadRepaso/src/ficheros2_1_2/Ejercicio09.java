package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio09 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida dos números enteros.
		 * El programa pedirá de nuevo el segundo número mientras no sea mayor que el primero.
		 * El programa terminará escribiendo los dos números.
		 */
		
		System.out.println("Introduce el primer número: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduce un número mayor que "+num1+": ");
		int num2 = teclado.nextInt();
		
		while (num2 <= num1) {
			System.out.println(num2+" no es mayor que "+num1+". Inténtelo de nuevo: ");
			num2 = teclado.nextInt();
		}
		System.out.println("Los números que ha escrito son "+num1+" y "+num2+".");
		

	}

}
