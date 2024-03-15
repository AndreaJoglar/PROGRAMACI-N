package Ficheros;

import java.util.Scanner;

public class ejercicio_04 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime dim: ");
		int dim = teclado.nextInt();
		
		int v[]= new int [dim];
		leerVector(v);
		mostrarVector(v);
	}
	
	public static void leerVector (int v[]) {
		for (int i = 0; i<v.length; i++) {
			System.out.println("["+i+"]");
			v[i] = teclado.nextInt();
		}	
	}
	
	public static void mostrarVector (int v[]) {
		for (int i = 0; i<v.length; i++) {
			System.out.println("["+i+"] = "+v[i]);
			
		}
	}

}
