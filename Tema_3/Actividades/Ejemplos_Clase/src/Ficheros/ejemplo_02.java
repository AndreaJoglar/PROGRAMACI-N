package Ficheros;

import java.util.Scanner;

public class ejemplo_02 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pedimos por teclado los valores del vector
		
		int v [] = new int [5];
		//rellenar un vector
		for (int i = 0; i < 5; i++) {
			System.out.println("["+i+"]");
			v[i] = teclado.nextInt();
		}
		
		// mostrar
		for (int i = 0; i <5; i++) {
			System.out.println("["+i+"] = "+v[i]);
		}

	}

}
