package Ficheros_Vectores;

import java.util.Scanner;

public class ejercicio_ApoyoVector {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("Indica dimensión del vector: ");
		int dim = teclado.nextInt();
		int v[] = new int [dim];
		LibreriaApoyo.leerVector(v);
		LibreriaApoyo.mostrarVector(v);
		LibreriaApoyo.maximo(v);
		LibreriaApoyo.minimo(v);
		LibreriaApoyo.posicionValorMaximo(v);
		LibreriaApoyo.posicionValorMinimo(v);
		System.out.println("Introduce un valor que quieres buscar en el vector: ");
		int valor=teclado.nextInt();
		if (LibreriaApoyo.buscarValor(v, valor)) {
			System.out.println("El valor "+valor+" aparece en el vector.");
		}
		else System.out.println("El valor "+valor+" no aparece en el vector.");
		
		int []a= {1,2,3,4,5};
		int []b= {6,2,2,4,1};
		int [] vector=LibreriaApoyo.productoVectorial(a, b);
		System.out.println("Vectores multiplicados: ");
		LibreriaApoyo.mostrarVector(vector);
		*/
		
		System.out.println("Vector aleatorio: ");
		System.out.println("Indica la dimensión del vector aleatorio que se va a generar: ");
		int dimAleat=teclado.nextInt();
		System.out.println("Indica valor máximo que contendrá el vector aleatorio: ");
		int numMax=teclado.nextInt();
		int aleatorio []=LibreriaApoyo.vectorAleatorio(dimAleat, numMax);
		LibreriaApoyo.mostrarVector(aleatorio);
		
		System.out.println("Media del vector: "+LibreriaApoyo.media(aleatorio));
		LibreriaApoyo.calcularDesviacion(aleatorio);
		
	}

}
