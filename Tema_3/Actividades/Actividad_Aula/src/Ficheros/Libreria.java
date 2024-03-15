package Ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Funcion que determina si hay valles en un vector
	 * @param v vector de enteros
	 * @param pos entero
	 * @return boolean
	 */
	public static boolean esValle (int v[], int pos) {
		if (v[pos]<(v[pos-1])&&(v[pos]<v[pos+1])) return true;
		else return false;
	}
	
	/**
	 * Funcion que determina si hay picos en un vector
	 * @param v vector de enteros
	 * @param pos entero
	 * @return boolean
	 */
	public static boolean esPico (int v [], int pos) {
		if ((v[pos-1]<v[pos])&&(v[pos]>v[pos+1]))return true;
		return false;
	}
	
	/**
	 * Funcion que calcula el numero de valles de un vector
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int numeroValle (int v[]) {
		int contValles = 0;
		for (int i=1;i<v.length-1;i++) {
			if (esValle(v, i)) {
				contValles++;
			}
		}
		return contValles;
	}
	
	/**
	 * Funcion que devuelve el valor del pico mas alto de un vector.
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int valorPicoMasAlto (int v[]) {
		int masAlto = v[1];
		for (int i=1;i<v.length-1;i++) {
			if (v[i]>masAlto && esPico(v, i)==true) {
				masAlto = v[i];
			}
		}
		return masAlto;
	}
	
	/**
	 * Funcion que devuelve el numero de mesetas de un vector.
	 * @param v vector de entero
	 * @return entero
	 */
	public static int numMeseta (int v[]) {
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
