package Ficheros;

import java.util.Scanner;


public class ejer2 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[]=new int[10];
		leerVector(v);
		mostrarInverso(v);
	}

	public static void leerVector(int v[]) {
		for(int i=0;i<v.length;i++) {
			System.out.println("["+i+"]");
			v[i]=teclado.nextInt();
		}
	}
	
	public static void mostrarInverso(int v[]) {
		for(int i=v.length-1;i>=0;i--) {
			System.out.println("["+i+"]"+v[i]);
		}
	}
}
