package Ficheros;

import java.util.Scanner;

public class ejercicio7 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* leer 4 números, 
		 * sumarlos: sumar = sumar + num  4 veces
		 * mostrar suma
		 */
		int cont = 1;
		int contSuma = 0;
		
				
		while (cont <= 4) {
			System.out.println("Introduce un número: ");
			int numero = teclado.nextInt();
			
			contSuma = contSuma + numero;
			
			//avance bucle
			cont = cont + 1;
		}
		System.out.println("La suma de los números es = "+contSuma);
	
		
		

	}

}
