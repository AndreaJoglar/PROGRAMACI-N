package Ficheros_Vectores;

import java.util.Scanner;

public class LibreriaRepaso {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Funcion que inserta un valor en un vector
	 * @param v vector de enteros
	 * @param valor entero
	 * @param pos entero
	 * @return vector de enteros
	 */
	public static int [] insertaValor (int v[], int valor, int pos) {
		if (pos<0 || pos>v.length) {
			System.out.println("ERROR. Fuera de rango.");
			
		}
		int [] insertado = new int [v.length];
		for (int i = v.length-2; i>=pos; i--) {
			v[i+1]=v[i];
		}
		v[pos]=valor;
		return insertado;
	}
	
	/**
	 * Funcion que muestra los valores de un vector
	 * @param v vector de enteros
	 */
	public static void mostrarVector (int []v) {
		System.out.print("[");
		for (int i = 0; i < v.length; i++) {
			if (i==v.length-1) {
				System.out.println(v[i]+"]");
			}
			else {
				System.out.print(v[i]+", ");
			}
		}
	}
	
	/**
	 * Funcion que muestra la secuencia creciente mas larga
	 * y la posicion inicial de dicha secuencia
	 * @param v vector de enteros
	 */
	public static void secuencia (int []v) {
		int posMax=-1;
		int tamMax=Integer.MIN_VALUE;
		for (int i=0;i<v.length-1;i++) {
			if (v[i]<v[i+1]) {
				int posIni=i;
				int tam=1;
				while(i<v.length-1 && v[i]<v[i+1]) {
					tam++;
					i++;
				}
				if (tam>tamMax) {
					tamMax=tam;
					posMax=posIni;
				}
			}
		}
		System.out.println("La secuencia creciente más larga empieza en la posición "+posMax+
										" y tiene un tamaño de "+tamMax+".");
	}
	
	/**
	 * Funcion que compara dos vectores
	 * para saber si coinciden su secuencia 
	 * de valores
	 * @param sec1 entero
	 * @param sec2 entero
	 * @return boolean
	 */
	public static boolean coincideAdn (int []sec1, int []sec2) {
		for (int i=0;i<sec2.length;i++) {
			if (sec2[i]==sec1[0]) {
				int indexSec1=0;
				int indexSec2=i;
				while (indexSec1<sec1.length && sec1[indexSec1]==sec2[indexSec2]) {
					indexSec1++;
					indexSec2++;
					if (indexSec2==sec2.length) {
						indexSec2=0;
					}
				}
				if (indexSec1==sec1.length) {
					return true;
				}
			}
		}
		return false;
		}

}
