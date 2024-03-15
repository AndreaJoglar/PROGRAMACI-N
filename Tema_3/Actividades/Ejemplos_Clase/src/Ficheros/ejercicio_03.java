package Ficheros;

import java.util.Scanner;

public class ejercicio_03 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un vector de tamaño determinado por el usuario
		 */
		
		System.out.println("Dime dimensión: ");
		int dim = teclado.nextInt();
		
		int v [] = new int [dim];
		//rellenar un vector
		for (int i = 0; i < dim; i++) {
			System.out.println("["+i+"]");
			v[i] = teclado.nextInt();
		}
		
		// mostrar
		for (int i = 0; i <dim; i++) {
			System.out.println("["+i+"] = "+v[i]);
		}
		
	}

}
