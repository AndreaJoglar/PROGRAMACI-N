package Ficheros_Vectores;

import java.util.Scanner;

public class ejercicio06 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float []v=Libreria.crearVectorReal();
		Libreria.mostrarVectorReal(v);
		System.out.println("Indica el valor que quieres buscar: ");
		float valor=teclado.nextFloat();
		if (Libreria.busqueda(v, valor)==-1) {
			System.out.println("El valor no aparece en el vector.");
		}
		else System.out.println("El valor "+valor+" aparece en la posición "+Libreria.busqueda(v, valor));
		
	}

}
