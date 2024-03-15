package Ficheros;

import java.util.Scanner;

public class Ejercicio23_for {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calcula el factorial de un numero entero. 
		 * El factorial es el resultado de multiplicar ese número por todos los números menores que él.
		 * Ejemplo: 4! = 4*3*2*1 = 24
		 * leer num
		 * mientras (cont <= num)
		 * fact = fact * cont
		 * cont++
		 */
		
		System.out.println("Escribe un número: ");
		int num = teclado.nextInt();
		int fact = 1;
		
		for (int cont = 1; cont <= num; cont++) {
			fact = fact * cont;
		}
		System.out.println("Factorial de "+num+"! ="+fact);


	}

}
