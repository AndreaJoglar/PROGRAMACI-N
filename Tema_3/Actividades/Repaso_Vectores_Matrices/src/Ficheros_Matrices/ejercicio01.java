package Ficheros_Matrices;

import java.util.Scanner;

public class ejercicio01 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce número de filas: ");
		int filas=teclado.nextInt();
		System.out.println("Introduce número de columnas: ");
		int columnas=teclado.nextInt();
		
		int [][]m=new int [filas][columnas];
		Libreria_Matriz.leerMatriz(m);
		Libreria_Matriz.mostrarMatriz(m);
		Libreria_Matriz.sumaFilas(m);
		Libreria_Matriz.sumaColumnas(m);
		int [][] nuevaMatriz = Libreria_Matriz.intercambia(m);
		Libreria_Matriz.mostrarMatriz(nuevaMatriz);
		if (Libreria_Matriz.esSelectiva(m)) System.out.println("La matriz es selectiva.");
		else System.out.println("La matriz no es selectiva.");
		
		Libreria_Matriz.maxFilasMatriz(m);
		Libreria_Matriz.minColumnasMatriz(m);
		
		Libreria_Matriz.tienePuntoSilla(m);
		if (Libreria_Matriz.tienePuntoSilla(m)==false) System.out.println("No tiene punto silla.");
		
		
	}

}
