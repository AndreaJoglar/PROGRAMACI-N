package Ficheros;

import java.util.Scanner;

public class ejemplo6numero {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leer 5 números por teclado 5 veces e indicar cuál es par
		
		int cont = 1;
		while (cont <= 5) {
			//leer número
			System.out.println("Introduce un número: ");
			int numero = teclado.nextInt();
			//mostrar número
			System.out.println(numero);
			int resto = numero % 2;
			if (resto == 0) {
				System.out.println("El número es par");
			}
			else {
				System.out.println("El número es impar");
			}
			
			// avance bucle
			cont = cont + 1;
		}
		
		
		
		
		

	}

}
