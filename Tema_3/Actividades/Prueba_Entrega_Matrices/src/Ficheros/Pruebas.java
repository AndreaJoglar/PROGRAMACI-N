package Ficheros;

import java.util.Scanner;

public class Pruebas {
	static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("¿Columnas?");
		int dim = teclado.nextInt();
		int [] vector = new int [dim];
	
		for (int i=0;i<filas-1;i++) {
			//equivale al número de columnas
			for (int j=0;j<vector.length;j++) {
				System.out.println("["+i+"] ");
				vector[i]=teclado.nextInt();
			}
			
			//indica si los elementos del vector son distintos
			if (Libreria.todosDistintos(vector)==true) {
				System.out.println("Todos los elementos son distintos");
			}
			else {
				System.out.println("Hay elementos repetidos");
			}
			//indica el máximo de un vector
			System.out.println("Máximo de la fila = "+Libreria.maximo(vector));
			System.out.println("Posición del máximo = ["+Libreria.posMax(vector)+"]");
		}
		
		
	}
}
