package Ficheros;

import java.util.Scanner;

public class actividad {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m [][]= new int [7][7];
		
		//crear tablero con todo ceros
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j]=0;
			}
		}
		
		mostrarMatriz(m);
		
		if(colocarBarcoFila(m, 2, 2, 4)==true) {//correcto
			System.out.println("\nLa matriz con barco: \n");
			mostrarMatriz(m);
		}
		
		if (colocarBarcoFila(m, 4, 4, 4)==true) {//incorrecto fuera de rango
			System.out.println("\nLa matriz con barco: \n");
			mostrarMatriz(m);
		}
		else System.out.println("El barco se sale de rango");
		
		
		if (colocarBarcoFila(m, 2, 3, 1)){//ya hay barco
			System.out.println("\nLa matriz con barco: \n");
			mostrarMatriz(m);
		}
		else System.out.println("No se puede colocar barco porque ya existe uno en esa posición.");
		
	}

	/**
	 * Funcion que coloca barcos en el tablero
	 * @param m matriz de enteros
	 * @param filaInicio entero
	 * @param columnaInicio entero
	 * @param tam entero
	 * @return boolean
	 */
	public static boolean colocarBarcoFila(int[][] m, int filaInicio, int columnaInicio, int tam) {
		//se desborda por las "columnas"
		if (columnaInicio+tam-1>=m[0].length) {//fuera de rango se desborda de longitud
			return false;
		}
		//posicion ocupada por barco
		for (int j=columnaInicio;j<columnaInicio+tam;j++) {
			if (m[filaInicio][j]!=0) {
				return false; 
			}
		}
		//marcar las posiciones
		for (int j=columnaInicio;j<columnaInicio+tam;j++) {
			m[filaInicio][j]=tam; 	
		}
		return true;
		
	}
	
	/**
	 * Muestra matriz por pantalla
	 * @param m matriz de enteros
	 */
	public static void mostrarMatriz (int [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	

}
