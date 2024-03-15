package Ficheros;

import java.util.Scanner;

public class ejercicio_01 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v [] = new int [10];
		
		for (int i = 0; i<v.length; i++) {
			System.out.println("["+i+"] ");
			v[i]= teclado.nextInt();
		}
		
		for (int i = 0; i<v.length; i++) {
			System.out.println("["+i+"] "+v[i]);
		}
	}

}
