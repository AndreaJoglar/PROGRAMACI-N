package Ficheros;

import java.util.Scanner;

public class ejemplo5numero {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*leer 5 números por teclado 5 veces, indicar cuál es par 
		 * y mostrar un conteo de todos los números pares que
		 * se introdujeron
		 */
		
		int cont = 1;
		int contPares = 0;
		
		while (cont <= 5) {
			System.out.println("Introduce un número: ");
			int numero = teclado.nextInt();
			System.out.println(numero);
			
			int resto = numero % 2;
			if (resto == 0) {
				System.out.println("El número es par");
				contPares = contPares + 1;
			}
			else {
				System.out.println("El número es impar");
			}
			// avance bucle
			cont = cont + 1;
		}
		System.out.println("Pusiste "+contPares+" números pares");
	}

}
