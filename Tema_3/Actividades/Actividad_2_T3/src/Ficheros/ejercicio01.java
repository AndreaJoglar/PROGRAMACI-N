package Ficheros;

import java.util.Scanner;

public class ejercicio01 {
	static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Filas: ");
		int filas=teclado.nextInt();
		System.out.println("Columnas: ");
		int columnas=teclado.nextInt();
		
		int m [] []=new int [filas][columnas];
		Libreria.leerMatriz(m);
		*/
		
		int m [][] = {{1,2,3},
					  {4,5,6}};	
		
		Libreria01.mostrarMatriz(m);
		System.out.println("Suma por filas: ");
		Libreria01.sumaFilas(m);
		System.out.println("Suma por columnas: ");
		Libreria01.sumaColumnas(m);
		
		int matriznueva [][] = Libreria01.intercambia(m);
		Libreria01.mostrarMatriz(matriznueva);
		
		if (Libreria01.esSelectiva(m)==true) {
			System.out.println("m es selectiva.");
		}
		else System.out.println("m no es selectiva.");
		
		int [][] m2 = {{1,2,3},{4,1,5},{6,7,1}};
		
		if (Libreria01.esSelectiva(m2)==true) {
			System.out.println("La matriz 2 es selectiva. ");
		}
		else System.out.println("La matriz 2 no es selectiva.");
		
		int [][] matrizPuntoSilla = {{8,1,26},
									{13,15,17},
									{ 4, 9,32}};
		
		int [][]noSilla = {{1,2,3},{4,5,6},{7,8,9}};
		Libreria01.tienePuntoSilla(matrizPuntoSilla);
		if (Libreria01.tienePuntoSilla(noSilla)==false) {
			System.out.println("No tiene punto silla");
		}
		
		
	}

}
