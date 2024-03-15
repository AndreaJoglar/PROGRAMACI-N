package Ficheros;

import java.util.Scanner;

public class ejercicio03 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m [][] = Libreria03.matrizCuadradaImpar();
		System.out.println("MATRIZ COMPLETA: ");
		Libreria03.mostrarMatriz(m);
		
		//Libreria03.piramideInvertida(m);
		//Libreria03.piramide(m);
		System.out.println("\nRELOJ DE ARENA: ");
		Libreria03.mostrarRelojArena(m);
	}

}
