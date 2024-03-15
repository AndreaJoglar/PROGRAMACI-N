package Ficheros;

import java.util.Scanner;

public class ejercicio_02b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v[]= crearVector();
		
		mostrarVector(v);
		System.out.println("Suma de elementos del vector = "+suma(v));
		System.out.println("Máximo de un vector = "+max(v));
		System.out.println("Suma de elementos pares del vector = "+sumaNumerosPares(v));
		System.out.println("Suma de elementos en posiciones impares del vector = "+sumaPosicionesImpares(v));
		

	}
	
	//podemos crear una funcion para crear vectores
	public static int [] crearVector () {
		System.out.println("Introduce dim: ");
		int dim=teclado.nextInt();
		int v[] = new int [dim];
		for (int i=0;i<v.length;i++) {
			System.out.println("["+i+"] ");
			v[i]=teclado.nextInt();
		}
		return v;

	}
	
	/**
	 * Funcion que lee los elementos de tipo entero 
	 * que se almacenan en un vector
	 * @param v vector de enteros
	 */
	public static void leerVector (int v[]) {
		for (int i = 0; i < v.length;i++) {
			System.out.println("["+i+"] ");
			v[i]= teclado.nextInt();
		}
	}
	/**
	 * Funcion que muestra los elementos almacenados en un vector
	 * @param v vector de enteros
	 */
	public static void mostrarVector (int v[]) {
		for (int i=0;i<v.length;i++) {
			System.out.println("["+i+"] = "+v[i]);
		}
	}
	
	/**
	 * Funcion que retorna la suma de los elementos
	 * de un vector
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int suma (int v[]) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma = suma + v[i];
		}
		return suma;
	}
	
	/**
	 * Funcion que devuelve el maximo de un vector
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int max (int v[]) {
		int max = v[0];
		for (int i=0;i<v.length;i++) {
			if(v[i]>max) {
				max = v[i];
			}	
		}
		return max;
	}
	
	/**
	 * Funcion que suma de los
	 * numeros pares de un vector
	 * @param v vector de enteros
	 * @return
	 */
	public static int sumaNumerosPares (int v[]) {
		int sumaPares=0;
		for (int i=0;i<v.length;i++) {
			if (v[i]%2==0) {
				sumaPares=sumaPares+v[i];
			}
		}
		return sumaPares;
	}
	
	/**
	 * Función que suma las posiciones impares
	 * de un vector
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int sumaPosicionesImpares (int v[]) {
		int sumaPosImpar = 0;
		for (int i=0;i<v.length;i++) {
			if (i%2!=0) {
				sumaPosImpar = sumaPosImpar+v[i];
			}
		}
		return sumaPosImpar;
	}

}
