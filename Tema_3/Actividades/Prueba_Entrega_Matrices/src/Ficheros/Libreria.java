package Ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner(System.in);
	

	/**
	 * Función que calcula si todos los elementos 
	 * de un vector son distintos
	 * @param m vector de enteros
	 * @return boolean
	 */
	public static boolean todosDistintos (int [] m) {
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m.length;j++) {
				if (i!=j && m[i]==m[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Función que devuelve el valor máximo de un vector
	 * @param m vector de enteros
	 * @return entero
	 */
	public static int maximo (int[] m) {
		int max = m[0];
		for (int i=0;i<m.length;i++) {
			if (m[i]>max) {
				max=m[i];
			}
		}
		return max;
	}
	
	/**
	 * Función que devuelve la columna en la que se encuentra
	 * el maximo
	 * @param m vector de enteros
	 * @return entero
	 */
	public static int posMax (int [] m) {
		int max=maximo(m);
		int posMax=-1;
		for (int i=0;i<m.length;i++) {
			if(m[i]==max) {
				posMax=i;
				return posMax;
			}
		}
		return -1;
	}
	
	/**
	 * Funcion que imprime una matriz por pantalla.
	 * @param m matriz de enteros
	 */
	public static void imprimeMatriz (int [][] m) {
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
				System.out.print (m[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * Funcion que lee las dimensiones de una matriz
	 * y rellena la matriz con valores introducidos
	 * por el usuario.
	 * @param m matriz de enteros
	 */
	public static void leerMatriz (int [][] m) {
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
				System.out.println("["+i+", "+j+"]");
				m[i][j]=teclado.nextInt();
			}
		}
	}
}
