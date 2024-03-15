package Ficheros;

import java.util.Scanner;

public class Ejercicio06 {
	static Scanner teclado = new Scanner(System.in);	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calcula la raíz cuadrada de un numero 
		 * que pediremos por teclado, 
		 * teniendo la precaución de que el número no sea negativo; 
		 * en este caso se debe informar de que la operación no es posible.
		 */
		double num;
		System.out.println("Introduce un número: ");
		num = teclado.nextDouble();
						
		if (num >=0) {
			double raiz = Math.sqrt(num);
			System.out.println("El resultado es "+raiz);
		}
		else {
			System.out.println("Error. Valor negativo. No es posible realizar la operación");
			
		}
		

	}

}
