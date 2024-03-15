package Ficheros;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio05 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Cuántos elementos tiene el vector?");
		int v [] = new int [teclado.nextInt()];
		medianaVector(v);

	}
	
	public static void medianaVector (int v[]) {
		for (int i=0;i<v.length;i++) {
			System.out.println("["+i+"] ");
			v[i]=teclado.nextInt();
		}
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		
		int posMediana = (v.length+1)/2;
		double mediana = 0;
		System.out.println(posMediana);
		for (int i=0;i<v.length;i++) {
			if (v.length%2!=0) {
				if (i==posMediana-1) {
					mediana=v[i];
				}
			}
			else {
				if (v.length%2==0) {
					if (i==posMediana-1) {
						mediana=(v[i]+v[i+1])/2.0;
					}
				}
			}
		}
		System.out.println(mediana);
	}

}
