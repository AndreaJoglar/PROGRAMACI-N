package Ficheros;

import java.util.Scanner;

public class ejercicio8 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		/* leer una secuencia de números hasta
		 * introducir un cero y sumarlos a medida que se leen
		 * variable suma se suele llamar "acumulador"
		 */
		
		int numero = 1;
		int suma = 0;
		
		while (numero != 0) {
			System.out.println("Introduce un número: ");
			numero = teclado.nextInt();
			
			suma = suma + numero;
			
			System.out.println("Suma acumulada: "+suma);
		}
		
		System.out.println("¡¡FIN!!");
		
		

	}	
}
