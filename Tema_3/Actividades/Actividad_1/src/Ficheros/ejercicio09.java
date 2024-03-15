package Ficheros;

import java.util.Scanner;

public class ejercicio09 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v []= {3,3,3,8,5,5,3,9,3,3};
		System.out.println("Número de valles: "+numValles(v));
		System.out.println("Número de picos: "+numPicos(v));
		System.out.println("Número de mesetas: "+numMesetas(v));
	}
	
	/**
	 * Funcion que cuenta el numero de valles de un vector
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int numValles (int v[]) {
		int contValles = 0;
		for (int i=1;i<v.length-1;i++) {
			if ((v[i]<v[i-1])&&(v[i]<v[i+1])) {
				contValles++;
			}
		}
		return contValles;
	}
	
	/**
	 * Funcion que cuenta el numero de picos de un vector
	 * @param v vector de enteros.
	 * @return enteros
	 */
	public static int numPicos (int v[]) {
		int contPicos =0;
		for (int i=1;i<v.length-1;i++) {
			if ((v[i]>v[i-1])&&(v[i]>v[i+1])) {
				contPicos++;
			}
		}
		return contPicos;
	}
	
	/**
	 * Funcion que devuelve el numero de mesetas
	 * en un vector.
	 * @param v de enteros
	 * @return entero
	 */
	public static int numMesetas (int v[]) {
		int contMeseta=0;
		boolean hayMeseta=false;
		if (v[0]==v[1]) {
			hayMeseta=true;
			contMeseta++;
		}
		for (int i=1;i<v.length-1;i++) {
			if (v[i]==v[i+1] && hayMeseta == false)  {
				hayMeseta =true;
				contMeseta++;
			}
			else if (v[i]==v[i+1]);
			else hayMeseta = false;
		}
		return contMeseta;
	}

}
