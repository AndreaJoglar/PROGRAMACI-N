package Ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Funcion que comprueba si una matriz es MCCUD.
	 * @param m matriz de enteros
	 * @return boolean
	 */
	public static boolean mccud (int [][]m) {
		//comprueba que cada fila tiene elementos distintos.
		for (int i=0;i<m.length;i++) {
			todosDistintos(m[i]);
			if (todosDistintos(m[i])==false) return false;
		}
		//comprueba que el máximo de cada fila es menor que el máximo de la fila siguiente.
		for (int i=0;i<m.length-1;i++) {
			maximo(m[i]);
			if (maximo(m[i])> maximo(m[i+1])) {
				return false;
			}
		}
		//comprueba si la diferencia entre el maximo de la fila i+1 y el max de la fila i es constante
		for (int i=0;i<m.length-1;i++) {
			maximo (m[i]);
			int constante=maximo(m[i+1])-maximo(m[i]);
			for (int j=0;j<m[0].length-1;j++) {
				if (maximo(m[j+1])-maximo(m[j])!=constante) {
					return false;
				}
			}
		}
		//comprueba que en cada columna de la matriz solo aparezca el valor máximo de una de las filas
		for (int i=0;i<m.length;i++) {
			posMax(m[i]);
			for (int j=0;j<m[0].length;j++) {
				if ((i!=j) && (posMax(m[i])== posMax(m[j]))) {
					return false;
				}
			}
		}
		return true;	
	}

	/**
	 * Funcion que calcula si todos los elementos 
	 * de una fila son distintos.
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
	 * Funcion que devuelve el valor maximo de una fila.
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
	 * Funcion que devuelve la columna en la que se encuentra
	 * el maximo.
	 * @param m vector de enteros
	 * @return entero
	 */
	public static int posMax (int [] m) {
		int max=maximo(m);
		int posMax;
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
	 * y la rellena con valores introducidos
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
