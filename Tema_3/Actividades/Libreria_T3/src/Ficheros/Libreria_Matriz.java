package Ficheros;

import java.util.Scanner;

public class Libreria_Matriz {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Funcion que lee los valores de una matriz
	 * @param m
	 */
	public static void leerMatriz (int[][]m) {
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
				System.out.println("["+i+","+j+"]: ");
				m[i][j]=teclado.nextInt();
			}
		}
	}

}
