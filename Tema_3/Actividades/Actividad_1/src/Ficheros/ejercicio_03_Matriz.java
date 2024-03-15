package Ficheros;

import java.util.Scanner;

public class ejercicio_03_Matriz {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce columnas: ");
		int columnas = teclado.nextInt();
		
		int m[][]=new int[filas][columnas];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				m[i][j]=(int) (Math.random()*10+1);
			}
		}
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.print (m[i][j]+"  ");
			}
			System.out.println();
		}
		

	}

}
