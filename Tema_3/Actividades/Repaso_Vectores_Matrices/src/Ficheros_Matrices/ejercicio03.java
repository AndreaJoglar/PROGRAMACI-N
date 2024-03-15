package Ficheros_Matrices;

import java.util.Scanner;

public class ejercicio03 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] m = Libreria_Matriz.crearMatrizImpar();
		Libreria_Matriz.mostrarMatriz(m);
		System.out.println("Reloj de arena: ");
		Libreria_Matriz.relojArena(m);
	}

}
