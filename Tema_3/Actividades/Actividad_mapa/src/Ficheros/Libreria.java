package Ficheros;

public class Libreria {
	
	/**
	 * Funcion que determina si una posicion es valle
	 * @param v vector de enteros
	 * @param pos entero
	 * @return boolean
	 */
	public static boolean esValle (int v[], int pos) {
		if (pos>0 && pos<v.length-1) {
			if (v[pos]<v[pos-1] && v[pos]<v[pos+1]) {
				return true;
			}
			else return false;
		}
		return false;
	}
	
	/**
	 * Funcion que determina si una posicion es pico
	 * @param v vector de enteros
	 * @param pos entero
	 * @return boolean
	 */
	public static boolean esPico (int v [], int pos) {
		if (pos>0 && pos<v.length-1) {
			if (v[pos]>v[pos-1] && v[pos]>v[pos+1]) {
				return true;
			}
			else return false;
		}
		return false;
	}
	
	/**
	 * Funcion que calcula el numero de valles
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int numeroValle (int v[]) {
		int cont=0;
		for (int i=0; i<v.length-1;i++) {
			if (esValle(v, i)) cont++;
		}
		return cont;
	}
	
	/**
	 * Funcion que determina el pico mas alto.
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int valorPicoMasAlto (int v []) {
		int max = Integer.MIN_VALUE;
		for (int i=1; i<v.length-1;i++) {
			if (esPico(v, i)) {
				if (v[i]>max) {
					max = v[i];
				}
			}
		}
		return max;
	}
	
	/**
	 * Funcion que calcula el numero de mesetas de un vector.
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int numeroMesetas (int v[]) {
		int contMesetas=0;
		for (int i=0; i<v.length-1; i++) {
			if (v[i]==v[i+1]) {
				contMesetas++;
				while (v[i]==v[i+1]) {
					i++;
				}
			}
		}
		return contMesetas;
	}

}
