package Ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Calcula el numero de digitos de un numero
	 * @param numero: entero
	 * @return entero
	 */
	public static int numeroDeDigitos (int numero) {
		int digito = 0;
		while (numero >= 1) {
			numero = numero / 10;
			digito++;
		}
		return digito;
	}
	
	/**
	 * Calcula el inverso de un numero
	 * @param numero: entero
	 * @return: entero
	 */
	public static int numeroInverso (int numero) {
		
		int numeroInverso = 0;
		while (numero >= 1) {
			int digito = numero % 10;
			numero = numero / 10;
			numeroInverso = (numeroInverso * 10) + digito;
			
		}
		return numeroInverso;
	}
	
	/**
	 * Determina si el numero contiene el digito indicado como parametro
	 * @param numero: entero
	 * @param digito: entero
	 * @return: boolean
	 */
	public static boolean contieneDigito (int numero, int digito) {
		int digitoNum2;
		while (numero >= 1) {
			digitoNum2 = numero % 10;
			numero = numero / 10;
			if (digitoNum2 == digito) {
				return true;
			}
		}
		return false;
		
	}
	
	/**
	 * Funcion que muestra un menu y retorna la opcion leida
	 * @return: entero
	 */
	public static int menu () {
		System.out.println("1.- Números cuñados ");
		System.out.println("2.- Números familia ");
		int opcion = teclado.nextInt();
		return opcion;
		
	}

}
