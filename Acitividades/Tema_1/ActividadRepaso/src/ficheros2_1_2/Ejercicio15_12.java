package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio15_12 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir dos números enteros
		 * mostrar qué numeros son pares
		 * mostrar qué numeros son impares
		 * dentro del intervalo de los dos números pedidos
		 */
		
		System.out.println("Escribe un número entero: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Escribe un número mayor o igual que "+num1+": ");
		int num2 = teclado.nextInt();
		
		while (num2 < num1) {
			System.out.println("¡Te he pedido un número mayor o igual que "+num1+". Vuelve a intentarlo: ");
			num2 = teclado.nextInt();
		}
		
		while (num1 <= num2) {
			if (num1 % 2 == 0) {
				System.out.println("El número "+num1+" es par.");
			}
			else {
				System.out.println("El número "+num1+" es impar.");
			}
			num1++;
		}

	}

}
