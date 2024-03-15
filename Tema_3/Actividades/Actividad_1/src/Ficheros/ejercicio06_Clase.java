package Ficheros;

import java.util.Scanner;

public class ejercicio06_Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float v[]=leerVector();
		mostrarVector(v);
		
		System.out.println("Introduce el valor que quieres buscar: ");
		float valor = teclado.nextFloat();
		if (buscarValor(v, valor)==-1) System.out.println("El valor no aparece en el vector.");
		else System.out.println("El valor está en la posición "+buscarValor(v, valor));
		
	}
	
	/**
	 * Funcion que lee la dimension de un vector y almacena sus valores
	 * introducidos por el usuario.
	 * @return float
	 */
	public static float [] leerVector() {
		System.out.println("Dimensión del vector: ");
		int dim = teclado.nextInt();
		float v[]=new float [dim];
		for (int i=0;i<v.length;i++) {
			System.out.println("["+i+"] ");
			v[i]=teclado.nextFloat();
		}
		return v;
	}
	
	/**
	 * Funcion que muestra los valores de un vector
	 * @param v vector de reales
	 */
	public static void mostrarVector (float []v) {
		for (int i=0;i<v.length;i++) {
			System.out.println("["+i+"] "+v[i]);
		}
		
	}

	/**
	 * Funcion que busca un valor dentro de un vector.
	 * @param v vector de reales
	 * @param value real
	 * @return entero
	 */
	public static int buscarValor (float[]v, float value) {
		for (int i=0;i<v.length;i++) {
			if (v[i]==value) {
				return i;
			}
		}
		return -1;
	}
}
