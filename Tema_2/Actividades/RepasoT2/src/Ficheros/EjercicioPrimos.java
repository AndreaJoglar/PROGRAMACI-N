package Ficheros;

import java.util.Scanner;

public class EjercicioPrimos {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numero: ");
		int num = teclado.nextInt();
		
		if (Libreria.esPrimo(num) == true) {
			System.out.println("Es primo");
		}
		else System.out.println("No es primo");
		
		Libreria.primoSiguiente(num);
		System.out.println("Primo siguiente "+Libreria.primSiguiente(8));
		
		System.out.println("Introduce el limite minimo del intervalo: ");
		int min = teclado.nextInt();
		System.out.println("Introduce el limite maximo del intervalo: ");
		int max = teclado.nextInt();
		
		System.out.println("Los números primos entre "+min+" y "+max+" son: ");
		Libreria.primosIntervalo(min, max);
	}

}
