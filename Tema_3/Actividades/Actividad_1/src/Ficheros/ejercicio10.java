package Ficheros;

import java.util.Scanner;

public class ejercicio10 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Indicar dimensión del vector: ");
		int v[]= new int [teclado.nextInt()];
		generarVector(v);
		
		
		System.out.println("Introduce el valor que quieres buscar en el vector: ");
		int valor = teclado.nextInt();
		if (buscarValor(v, valor)==0) {
			System.out.println("El valor no aparece en el vector.");
		}
		else {
			System.out.println("El valor "+valor+" aparece "+buscarValor(v, valor)+" veces.");
		}
	}
	
	/**
	 * Funcion que genera un vector con valores aleatorios
	 * @param v vector de enteros
	 */
	public static void generarVector (int v[]) {
		for (int i = 0; i<v.length;i++) {
			v[i]= (int) (Math.random()*10+1);
			System.out.println("["+i+"] "+v[i]);
		}
	}
	
	/**
	 * Funcion que busca un valor dentro de un vector
	 * @param v vector de enteros
	 * @param valor entero
	 * @return entero
	 */
	public static int buscarValor (int v[], int valor) {
		int cont = 0;
		for (int i = 0; i<v.length; i++) {
			if (valor == v[i]) {
				cont++;
			}
		}
		return cont;
	}

}
