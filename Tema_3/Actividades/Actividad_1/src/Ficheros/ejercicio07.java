package Ficheros;

import java.util.Scanner;

public class ejercicio07 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float v [] = {1,2,3,4,5,6};
		ordenarVector(v);

	}
	
	public static void ordenarVector (float v[]) {
		float par []=new float [v.length];
		float impar []=new float [v.length];
		int pares=0;
		int impares=0;
		//separar pares de impares
		for (int i=0;i<v.length;i++) {
			if (v[i]%2==0) {
				par [pares++]=v[i];
			}
			else {
				impar [impares++]=v[i];
			}
		}
		//colocar pares
		for (int i=0;i<pares;i++) {
			v[i]=par[i];
		}
		
		
		//colocar impares
		for (int i=pares;i<v.length;i++) {
			v[i]=impar[i-pares];
			
		}
		
		System.out.println("Vector ordenado: ");
		for(int i=0;i<v.length;i++) {
			System.out.println("["+i+"] "+v[i]);
		}
	}

}
