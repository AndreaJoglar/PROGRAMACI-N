package Ficheros_Matrices;

import java.util.Scanner;

public class ejercicio_ApoyoMatriz {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Número de filas: ");
		int filas= teclado.nextInt();
		System.out.println("Número de columnas: ");
		int columnas=teclado.nextInt();
		
		//genera matriz a partir de filas y columnas
		int [][]m=Libreria_Matriz.generarMatriz(filas, columnas);
		
		//muestra matriz
		Libreria_Matriz.muestraMatriz(m);;
		
		//busca un valor dentro de la matriz
		System.out.println("Indica el valor que debe buscarse: ");
		int valor = teclado.nextInt();
		Libreria_Matriz.buscarValor(m, valor);
		/*
		//muestra la suma de cada fila de la matriz
		int []v=Libreria_Matriz.sumaPorFilas(m);
		for (int i = 0; i < m.length; i++) {
			System.out.println("Suma fila ["+i+"] = "+v[i]);
		}
		*/
		//muestra la suma de cada columna de la matriz
		int []v=Libreria_Matriz.sumaPorColumnas(m);
		for (int j = 0; j < m[0].length; j++) {
			System.out.println("Suma columna ["+j+"] = "+v[j]);
		}
		
		//muestra la matriz traspuesta
		System.out.println("Matriz traspuesta: ");
		int [][] traspuesta = Libreria_Matriz.calcularTraspuesta(m);
		Libreria_Matriz.muestraMatriz(traspuesta);
		/*
		//suma de dos matrices
		System.out.println("Suma de dos matrices: ");
		int [][]matriz1= {{1,2,3},{9,1,2},{6,7,4}};
		int [][]matriz2= {{8,7,3},{0,1,1},{2,1,2}};
		int [][]suma=Libreria_Matriz.sumaMatrices(matriz1, matriz2);
		Libreria_Matriz.muestraMatriz(suma);
		
		//producto de dos matrices
		System.out.println("Producto de dos matrices: ");
		int [][] m2 = {{2,0,1},{-5,2,3}};
		int [][] m1 = {{1,2},{-1,0},{-3,-1}};
		int [][]producto=Libreria_Matriz.productoMatrices(m1, m2);
		Libreria_Matriz.muestraMatriz(producto);
		
		//suma de diagonal de la matriz
		System.out.println("Suma de la diagonal de la matriz: ");
		int sumaDiagonal=Libreria_Matriz.calcularSumaDiagonal(m);
		System.out.println(sumaDiagonal);
		*/
		
		System.out.println("Suma de la diagonal inversa: "+Libreria_Matriz.calcularSumaDiagonalInversa(m));
		//System.out.println("Diagonalizar una matriz: ");
		//Libreria_Matriz.diagonalizarMatriz(m);
		//Libreria_Matriz.mostrarMatriz(m);
		
		int m3[][]= {{1,0,0,0},
				 	 {1,2,0,0},
				 	 {1,2,3,0},
				 	 {1,2,3,4}};
		
		int m4[][]= {{1,2,3,4},
				 {0,2,3,4},
				 {0,0,3,4},
				 {0,0,0,4}};
		
		System.out.println(Libreria_Matriz.matrizTriangularSuperior(m3));
		System.out.println(Libreria_Matriz.matrizTriangularSuperior(m4));
		
		System.out.println(Libreria_Matriz.matrizTriangularInferior(m4));
		System.out.println(Libreria_Matriz.matrizTriangularInferior(m3));
	}

}
