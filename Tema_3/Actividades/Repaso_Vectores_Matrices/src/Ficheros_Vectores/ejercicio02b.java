package Ficheros_Vectores;

import java.util.Scanner;

public class ejercicio02b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce dimensión de un vector: ");
		int dim=teclado.nextInt();
		int []v=new int [dim];
		Libreria.leerVector(v);
		System.out.println("Suma de los valores del vector: "+Libreria.suma(v));
		System.out.println("Valor máximo del vector: "+Libreria.max(v));
		System.out.println("Suma de los valores pares del vector: "+Libreria.sumaNumerosPares(v));
		System.out.println("Suma de los valores en posiciones impares: "+Libreria.SumaPosicionesImpares(v));
	}

}
