package Ficheros_Matrices;

import java.util.Scanner;

public class ejercicio02 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]m=Libreria_Matriz.crearMatrizFormula();
		Libreria_Matriz.mostrarMatriz(m);
		System.out.println("Triángulo superior: ");
		Libreria_Matriz.trianguloSuperior(m);
		System.out.println("Triángulo superior inverso: ");
		Libreria_Matriz.trianguloSuperiorInverso(m);
		System.out.println("Triángulo inferior: ");
		Libreria_Matriz.trianguloInferior(m);
		System.out.println("Triángulo inferior inverso: ");
		Libreria_Matriz.trianguloInferiorInverso(m);
	}

}
