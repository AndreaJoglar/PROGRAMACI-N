package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio16 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir cantidad de números
		 * pedir números
		 * mostrar un mensaje cada vez que un número no sea mayor que el primero
		 */
		
		System.out.println("¿Cuántos números vas a introducir?");
		int cantidad = teclado.nextInt();
		
		while (cantidad <= 0) {
			System.out.println("¡Imposible! Vuelva a intentarlo: ");
			cantidad = teclado.nextInt();
		}
		
		System.out.println("Escribe un número: ");
		int num1 = teclado.nextInt();
		
		for (int cont = 2; cont <= cantidad; cont++) {
			System.out.println("Escriba un número mayor que "+num1+": ");
			int mayor = teclado.nextInt();
			if (mayor <= num1) {
				System.out.println("¡"+mayor+" no es mayor que "+num1+"!");
			}
		}
		System.out.println("Gracias por su colaboración.");
		
		

	}

}
