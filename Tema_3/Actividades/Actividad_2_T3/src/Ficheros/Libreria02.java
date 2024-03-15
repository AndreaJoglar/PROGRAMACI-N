package Ficheros;

import java.util.Scanner;

public class Libreria02 {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Funcion que lee una dimension y genera una matriz
	 * cuadrada.
	 * @return matriz de enteros
	 */
	public static int [][] crearMatriz (){
		System.out.println("Indica dimensión de la matriz cuadrada: ");
		int dim = teclado.nextInt();
		int m [][]= new int [dim][dim];
		
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
				m[i][j]=i+j;
			}
		}
		return m;
	}
	
	/**
	 * Funcion que muestra el contenido de una matriz por filas.
	 * @param m matriz de enteros
	 */
	public static void mostrarMatriz (int m [][]) {
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * Funcion que muestra la diagonal superior
	 * de una matriz.
	 * @param m matriz de enteros
	 */
	public static void diagonalSuperior (int [][]m) {
		System.out.println("Diagonal superior: ");
		for (int i=0; i<m.length;i++) {
			for (int j=0; j<m[0].length;j++) {
				if (j<i) {
					System.out.print("   ");
					
				}
				else {
					if (m[i][j]<10) System.out.print(m[i][j]+"  ");
					else System.out.print(m[i][j]+" ");
				}
					
			}
			System.out.println();
		}
	}
	
	/**
	 * Funcion que muestra el triangulo superior de una matriz
	 * @param m matriz de enteros
	 */
	public static void trianguloSuperior (int [][]m) {
		System.out.println("Triangulo superior: ");
		for (int i = 0; i < m.length; i++) {
			for (int huecos=0;huecos<i;huecos++) {
				System.out.print("  ");
			}
			for (int j = i+1; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}
		System.out.println();
		}
		
	}
	
	
	/**
	 * Funcion que muestra la diagonal
	 * de una matriz.
	 * @param m matriz de enteros
	 */
	public static void diagonalInferior (int [][]m) {
		System.out.println("Diagonal inferior: ");
		for (int i=0; i<m.length;i++) {
			for (int j=0;j<=i;j++) {
				if (m[i][j]<10) System.out.print(m[i][j]+"  ");
				else System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Funcion que muestra el triangulo inferior de una matriz
	 * @param m matriz de enteros
	 */
	public static void trianguloInferior (int [][]m) {
		System.out.println("Triángulo inferior: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}
