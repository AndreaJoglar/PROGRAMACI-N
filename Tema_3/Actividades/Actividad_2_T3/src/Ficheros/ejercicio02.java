package Ficheros;

import java.util.Scanner;

public class ejercicio02 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][]=Libreria02.crearMatriz();
		Libreria02.mostrarMatriz(m);
		System.out.println();
		Libreria02.trianguloSuperior(m);
		Libreria02.trianguloInferior(m);
		Libreria02.diagonalSuperior(m);
		Libreria02.diagonalInferior(m);
	

	}

}
