package Ficheros;

import java.util.Scanner;

public class ejercicio05 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce dimensión: ");
		int dim=teclado.nextInt();
		int [][]m=new int [dim][dim];
		
		Libreria.matrizDiezOnce(m);
		
	}

}
