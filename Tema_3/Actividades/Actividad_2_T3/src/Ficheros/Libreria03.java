package Ficheros;

import java.util.Scanner;

public class Libreria03 {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Pedir una dimension impar y rellenar la matriz
	 * con valores aleatorios entre 1 y 9.
	 * @return matriz de enteros
	 */
	public static int [][] matrizCuadradaImpar (){
		System.out.println("Introduce una dimensión impar: ");
		int dim = teclado.nextInt();
		while (dim%2==0) {
			System.out.println("Error. Por favor, introduzca una dimensión impar: ");
			dim = teclado.nextInt();
		}
		int m [][] = new int [dim][dim];
		for (int i= 0; i<m.length;i++) {
			for (int j = 0; j<m[0].length;j++) {
				m[i][j]= (int)((Math.random()*9)+1);
			}
		}
		
		return m;
	}
	
	/**
	 * Funcion que muestra la matriz completa
	 * @param m matriz de enteros
	 */
	public static void mostrarMatriz (int m [][]) {
		for (int i=0; i<m.length;i++) {
			for (int j=0; j<m[0].length;j++) {
				System.out.print(m[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Funcion que muestra la matriz en forma
	 * de reloj de arena
	 * @param m matriz de enteros
	 */
	public static void mostrarRelojArena (int [][]m) {
		//piramide invertida
		for (int i=0; i<=m.length/2;i++) {
			//espacios
			for (int espacio=0; espacio <i; espacio++) {
				System.out.print("  ");
			}
			//columnas
			for (int j=i; j<m[0].length-i;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		//piramide
		for (int i=(m.length/2)+1; i<m.length;i++) {
			//espacios
			for (int espacio=0;espacio<(m.length-i-1);espacio++) {
				System.out.print("  ");
			}
			//columnas
			for (int j=m.length-i-1;j<=i;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
}
