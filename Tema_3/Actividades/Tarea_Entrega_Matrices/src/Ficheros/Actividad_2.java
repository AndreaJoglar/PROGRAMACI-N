package Ficheros;

import java.util.Scanner;

public class Actividad_2 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		int [][] mat_mccdu= {{ 5, 6, 2,-4},
						  	 { 6, 7, 8, 3},
						  	 {10, 4,-5, 9},
						  	 { 4,-7, 1, 12}};
		
		if (Libreria.mccud(mat_mccdu)==true) {
			System.out.println("Matriz 1: Es mccud.");
		}
		else System.out.println("Matriz 1: No es mccud.");
		
		int [][] no_mat_mccdu={{ 5, 6, 2,-4},
							   { 6, 7, 8, 3},
							   {10, 4,-5, 9},
							   { 4,-7,12, 1}};
		
		if (Libreria.mccud(no_mat_mccdu)==true) {
			System.out.println("Matriz 2: Es mccud.");
		}
		else System.out.println("Matriz 2: No es mccud.");
		
		//---Pruebas independientes de las funciones---
		/*
		System.out.println("Introduce la dimensión de la matriz cuadrada: ");
		int dim= teclado.nextInt();
		int m[][]=new int [dim][dim];
		Libreria.leerMatriz(m);
		Libreria.imprimeMatriz(m);
		
		if (Libreria.mccud(m)) System.out.println("Es mccud.");
		else System.out.println("No es mccud.");
		
		int []prueba ={2,4,6,7,8,9};
		System.out.println(Libreria.todosDistintos(prueba));
		int []pruebaB ={2,4,6,6,8,9};
		System.out.println(Libreria.todosDistintos(pruebaB));
		
		System.out.println("Máximo: "+Libreria.maximo(prueba));
		int [] pruebaC= {1,4,12,3,9,2};
		System.out.println("Posición máximo: ["+Libreria.posMax(pruebaC)+"]");
		*/
	}

}
