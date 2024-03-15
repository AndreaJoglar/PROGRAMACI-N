package Ficheros_Vectores;

import java.util.Scanner;

public class ejercicio05 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []v=Libreria.generaVector();
		System.out.println("Vector original: ");
		Libreria.mostrarVector(v);
		Libreria.ordenarVector(v);
		
		System.out.println("Vector ordenado: ");
		Libreria.mostrarVector(v);
		System.out.println("Mediana del vector: "+Libreria.medianaVector(v));

	}

}
