package Ficheros;

import java.util.Scanner;

public class ejemplo4numero {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leer un número y mostrarlo 5 veces
		
		int cont = 1;
		while (cont <= 5) {
			
			//leer número
			System.out.println("Introduce un número: ");
			int numero = teclado.nextInt();
			
			//mostrar número
			System.out.println(numero);
			
			// avance bucle
			cont = cont + 1;
		}
		
		
		
		
		

	}

}
