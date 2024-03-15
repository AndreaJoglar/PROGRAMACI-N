package Ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Retorna numero de digitos
	 * @param numero entero
	 * @return entero
	 */
	public static int numeroDeDigitos (int numero) {
		int digito = 0;
		while (numero > 0) {
			numero = numero / 10;
			digito++;
		}
		return digito;
	}
	
	/**
	 * Retorna numero inverso
	 * @param num: entero
	 * @return entero
	 */
	public static int numeroInvertido (int num) {
		int numInverso = 0;
		while (num > 0) {
			int digito = num % 10;
			num = num / 10;
			numInverso = (numInverso * 10) + digito;
		}
		return numInverso;
	}
	
	/**
	 * Detemina si el digito esta contenido en el numero
	 * @param numero entero
	 * @param digito entero
	 * @return boolean
	 */
	public static boolean contieneDigito (int numero, int digito) {
		boolean contieneDigito = false;
		while (numero > 0) {
			int cifra = numero % 10;
			if (cifra == digito) return true;
			numero = numero / 10;
		}
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public static int menu () {
		System.out.println("1. Numeros cuñados ");
		System.out.println("2. Numeros familia ");
		int opcion = teclado.nextInt();
		return opcion;
	}

}
