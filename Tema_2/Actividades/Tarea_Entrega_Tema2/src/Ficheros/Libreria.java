package Ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner(System.in);	
	
	/**
	 * Comprobar que el entero tiene a lo sumo 8 digitos y es positivo
	 * @param dni: entero
	 * @return boolean
	 */
	public static boolean comprobarDni (int dni) {
		if (dni < 0) return false;
		if (dni >= 100000000) return false;
		return true;
	}
	
	/**
	 * Calcula la letra que corresponde a un DNI
	 * @param dni: entero
	 * @return char
	 */
	public static char letraDni (int dni) {
		int resto = dni % 23;
		switch (resto) {
		case 0: return 'T';
		case 1: return 'R';
		case 2: return 'W';
		case 3: return 'A';
		case 4: return 'G';
		case 5: return 'M';
		case 6: return 'Y';
		case 7: return 'F';
		case 8: return 'P';
		case 9: return 'D';
		case 10: return 'X';
		case 11: return 'B';
		case 12: return 'N';
		case 13: return 'J';
		case 14: return 'Z';
		case 15: return 'S';
		case 16: return 'Q';
		case 17: return 'V';
		case 18: return 'H';
		case 19: return 'L';
		case 20: return 'C';
		case 21: return 'K';	
		}
		return 'E';
	}
	
	/**
	 * Comprueba si una letra de DNI corresponde con el numero del DNI
	 * @param dni: entero
	 * @param letra: char
	 */
	public static void dniValido (int dni, char letra) {
		char letraDni = letraDni(dni);
		if (letra == letraDni) System.out.println("DNI correcto");
		else System.out.println("DNI incorrecto");
	}
	
	//Funciones del Ejercicio2
	
	/**
	 * Determina si la fecha introducida es valida. 
	 * @param dia: entero
	 * @param mes: entero
	 * @param year: entero
	 * @return boolean
	 */
	public static boolean validarFecha (int dia, int mes, int year) {
		if ((dia <= 0) || (dia > 31)) return false; 
		if ((mes <= 0) || (mes > 12)) return false;
		if (year < 1978) return false;
		if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
			if (dia == 31) return false;
		}
		if ((mes == 2) && (anioBisiesto(year) == true)) {
			if (dia > 29) return false;
		}
		if ((mes == 2) && (anioBisiesto(year) == false)) {
			if (dia > 28) return false;
		}
		return true;
	}
	
	/**
	 * Calcula si un año es bisiesto
	 * @param year: entero
	 * @return boolean
	 */
	public static boolean anioBisiesto (int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Calcula los dias del mes, teniendo en cuenta si es año bisiesto
	 * @param mes: entero
	 * @param year: entero
	 * @return entero
	 */
	public static int diasMes (int mes, int year) {
		if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
			return 30;
		}
		if (mes == 2) {
			if (anioBisiesto(year) == true) return 29;
			else return 28;
		}
		return 31;
	}
	
	/**
	 * Calcula los dias que transcurren desde la fecha introducida
	 * @param dias: entero
	 * @param mes: entero
	 * @param year: entero
	 * @return entero
	 */
	public static int calcularDias (int dias, int mes, int year) {
		int total = 0;
		//años completos teniendo en cuenta si son o no bisiestos
		for (int anio = 1978; anio < year; anio++) {
			if (anioBisiesto(anio) == true) total = total + 366;
			else total = total + 365;
		}
		for (int m = 1; m < mes; m++) {
			total = total + diasMes(m, year);
		}
		total = total + dias;
		return total; 
	}
}
