package Ficheros;

import java.util.Scanner;

public class ejercicio04 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Cuántos elementos tiene el vector?");
		int v[]=new int[teclado.nextInt()];
		varianzaVector(v);
	}
	
	/**
	 * Funcion que calcula la varianza de un vector
	 * @param v vector de enteros
	 */
	public static void varianzaVector (int v[]) {
		double varianzaV = 0;
		for (int i=0;i<v.length;i++) {
			System.out.println("["+i+"]");
			v[i]=teclado.nextInt();
			System.out.println("["+i+"] "+v[i]);
			varianzaV = varianzaV+(Math.pow(v[i], 2));
		}
		varianzaV = varianzaV/v.length;
		System.out.println("Varianza vector = "+varianzaV);
	}
}
