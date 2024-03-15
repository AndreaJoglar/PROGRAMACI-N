package Ficheros;

import java.util.Scanner;

public class Ejercicio32 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reutiliza el ejercicio anterior para mostrar los números primos que hay del 1 al 100
		
		for (int num = 2; num <= 100; num++) {
			//comprobar si es primo
			boolean esPrimo = true;
			for (int div = 2; div <= (num-1); div++) {
				if (num % div == 0) {
					esPrimo = false;	
				}
			}
			if (esPrimo == true) {
				System.out.println("El número "+num+" es primo.");
			}
			
		}
		
	}
}


