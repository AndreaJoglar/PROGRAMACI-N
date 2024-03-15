package Ficheros_Vectores;

import java.util.Scanner;

public class ejercicio03 {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Indica dimensión del vector: ");
		int dim=teclado.nextInt();
		int []v=new int [dim];
		
		Libreria.crearVectorAleatorio(v);
		Libreria.mostrarVector(v);

	}

}
