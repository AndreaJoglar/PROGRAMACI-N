package Ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Muestra el area de un cuadrado
	 * @param lado: entero
	 */
	public static void areaCuadrado (int lado) {
		int area = lado * lado;
		System.out.println("Area del cuadrado: "+area);
	}
	
	/**
	 * Calcula el perimetro de un cuadrado
	 * @param lado: entero
	 * @return entero
	 */
	public static int perimetroCuadrado (int lado) {
		int perimetro = lado * 4;
		return perimetro;
	}
	
	/**
	 * Muestra el area del circulo
	 * @param radio: real
	 */
	public static void areaCirculo (double radio){
		double area = Math.PI * (radio * radio);
		System.out.println("Area del circulo: "+area);
	}
	
	/**
	 * Calcula el perimetro del circulo
	 * @param radio: real
	 * @return real
	 */
	public static double perimetroCirculo (double radio) {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}
	
	/**
	 * Determina si un numero es negativo
	 * @param num: entero
	 * @return boolean
	 */
	public static boolean esNegativo (int num) {
		if (num < 0) return true;
		else return false;
	}
	
	/**
	 * Calcula la raiz entera de un numero entero
	 * @param num: entero
	 * @return entero
	 */
	public static int raizEntera (int num) {
		int raiz = 1;
		while ((raiz * raiz <= num)) {
			raiz++;
		}
		return (raiz -1);
	}
	
	/**
	 * Determina si un anio es bisiesto
	 * @param anio: entero
	 * @return boolean
	 */
	public static boolean esBisiesto (int anio) {
		if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0)){
			return true;
		}
		else return false; 
		/* no haría falta el else porque el return no funciona como el syso,
		 * en el momento en que retorna, finaliza la función.
		 */
	}
	
	/**
	 * Determina si un numero tiene decimales
	 * @param num: double
	 * @return boolean
	 */
	public static boolean tieneDecimales (double num) {
		if (num % 1 == 0) return false;
		return true;
	}
	/**
	 * Genera un menu para elegir una opcion dependiendo de 
	 * si se introducen grados Fahrenheit o Centigrados
	 * @return entero
	 */
	
	
	/**
	 * Conversor de grados Centigrados a Fahrenheit
	 * @return real
	 */
	public static double conversorFahrenheit () {
		System.out.println("Introduce la temperatura: ");
		double temp = teclado.nextDouble();
		double F = (temp * 9/5) + 32;
		return F;
	}
	
	/**
	 * Conversor de grados Fahrenheit a Centigrados
	 * @return real
	 */
	public static double conversorCentigrados () {
		System.out.println("Introduce la temperatura: ");
		double temp = teclado.nextDouble();
		double C = ((temp - 32)/9) * 5; 
		return C;
	}
	
	/**
	 * Funcion que determina si a>b>c
	 * @param a: entero
	 * @param b: entero
	 * @param c: entero
	 * @return: boolean
	 */
	public static boolean ordenados (int a, int b, int c) {
		if ((esMayor(a, b)) && (esMayor(b, c))){
			return true;
		}
		return false;
	}
	
	/**
	 * Funcion que determina si el primer parametro es mayor que el segundo
	 * @param num1: entero
	 * @param num2: entero
	 * @return boolean
	 */
	public static boolean esMayor (int a, int b) {
		if (a > b) {
			return true;
		}
		return false;
	}
	
	/**
	 * Funcion que calcula el numero de cifras de un numero
	 * @param num: entero
	 * @return: entero
	 */
	public static int numeroCifras (int num) {
		int cont = 0;
		while (num > 0) {
			cont++;
			num = num/10;
		}
		return cont;
	}
	
	/**
	 * Calcula el sueldo diario teniendo en cuenta numero de horas, tipo de turno
	 * y si es domingo
	 * @param numHoras
	 * @param esDiurno
	 * @param esDomingo
	 * @return
	 */
	public static double sueldoDiario (int numHoras, boolean esDiurno, boolean esDomingo) {
		int sueldoBase = 0;
		if (esDiurno == true) {
			sueldoBase = numHoras * 20;
			if (esDomingo == true) {
				sueldoBase = numHoras * (20+10);
			}
			else sueldoBase = numHoras * 20;
		}
		else {
			sueldoBase = numHoras * 35;
			if (esDomingo == true) {
				sueldoBase = numHoras * (35+15);
			}
			else sueldoBase = numHoras * 35;
		}
		return sueldoBase;
	}
	
	/**
	 * Calcula el factorial de un numero
	 * @param num: entero
	 * @return: entero
	 */
	public static int factorial (int num) {
		int resul = 1;
		for (int i = 1; i <= num; i++) {
			resul= resul * i;
		}
		return resul;
	}
	
	/**
	 * Determina si un numero es primo; determinamos que el 1 no es primo.
	 * @param num: entero
	 * @return: boolean
	 */
	public static boolean esPrimo (int num) {
		if (num == 1) return false;
		for (int valor = 2; valor < num; valor++) {
			if (num%valor == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Funcion que calcula el cociente de la division de un entero
	 * @param D: entero
	 * @param d: entero
	 * @return: entero
	 */
	public static int cociente (int D, int d) {
		int cont = 0;
		while (D>=d) {
			D=D-d;
			cont++;
		}
		return cont;		
	}
	/**
	 * Funcion que calcula el resto de la division de un entero
	 * @param D: entero
	 * @param d: entero
	 * @return: entero
	 */
	public static int resto (int D, int d) {
		while (D>=d) {
			D=D-d;
		}
		return D;		
	}
	
	/**
	 * Funcion que incrementa un segundo la hora y la muestra
	 * @param horas: entero
	 * @param min: entero
	 * @param seg: entero
	 */
	public static void hora (int horas, int min, int seg) {
		seg++;
		if (seg == 60) {
			seg = 0;
			min++;
			if (min == 60) {
				min = 0;
				horas++;
				if (horas == 24) {
					horas = 0;
				}
			}
		}
		System.out.println("Hora incrementada: "+horas+":"+min+":"+seg);
	}
	
	/**
	 * Funcion que calcula la ecuacion de segundo grado
	 * @param a: entero
	 * @param b: entero
	 * @param c: entero
	 */
	public static void ecuacion2Grado (int a, int b, int c) {
		int raiz  = (b * b) - (4 * a * c);
		if (raiz < 0) {
			System.out.println("No tiene solución.");
		}
		else {
			if (raiz == 0) {
				double resul = ((-1) * b+Math.sqrt(raiz)) / (2 * a);
				System.out.println("Una solución = "+resul);
			}
			else {
				double resul1 = ((-1) * b+Math.sqrt(raiz)) / (2 * a);
				double resul2 = ((-1) * b-Math.sqrt(raiz)) / (2 * a);
				System.out.println("Solución 1 = "+resul1+" Solución 2 = "+resul2);
			}
		}
	}
	
	/**
	 * Calcula la cantidad que deberia devolver una maquina expendedora
	 * @param cantidad: real
	 */
	public static void calcularDevolucion (double cantidad) {
		int numMonedas = 0;
		while (cantidad >= 2) {
			numMonedas++;
			cantidad = cantidad - 2;
		}
		System.out.println(numMonedas+" de 2 €.");
		
		numMonedas = 0;
		while (cantidad >= 1) {
			numMonedas++;
			cantidad = cantidad - 1;
		}
		System.out.println(numMonedas+" de 1 €.");
		
		numMonedas = 0;
		while (cantidad >= 0.5) {
			numMonedas++;
			cantidad = cantidad - 0.5;
		}
		System.out.println(numMonedas+" de 0,5 €.");
		
		numMonedas = 0;
		while (cantidad >= 0.2) {
			numMonedas++;
			cantidad = cantidad - 0.2;
		}
		System.out.println(numMonedas+" de 0,2 €.");
		
		numMonedas = 0;
		while (cantidad >= 0.1) {
			numMonedas++;
			cantidad = cantidad - 0.1;
		}
		System.out.println(numMonedas+" de 0,1 €.");
		
		numMonedas = 0;
		while (cantidad >= 0.05) {
			numMonedas++;
			cantidad = cantidad - 0.05;
		}
		System.out.println(numMonedas+" de 0,05 €.");
		
		numMonedas = 0;
		while (cantidad >= 0.02) {
			numMonedas++;
			cantidad = cantidad - 0.02;
		}
		System.out.println(numMonedas+" de 0,02 €.");
		
		numMonedas = 0;
		while (cantidad >= 0.01) {
			numMonedas++;
			cantidad = cantidad - 0.01;
		}
		System.out.println(numMonedas+" de 0,01 €.");
	}
	
	/**
	 * Calcula la edad a partir de la fecha actual y la fecha de nacimiento
	 * @param diaAct: entero
	 * @param mesAct: entero
	 * @param anioAct: entero
	 * @param diaN: entero
	 * @param mesN: entero
	 * @param anioN: entero
	 */
	public static void edad (int diaAct, int mesAct, int anioAct, int diaN, int mesN, int anioN) {
		int anios = anioAct - anioN;
		int meses;
		int dias;
		if (mesN <= mesAct) {
			meses = mesAct - mesN;
		}
		else {
			meses = mesAct + mesN;
			anios--;
		} 
		if (diaN <= diaAct) {
			dias = diaAct - diaN;
		}
		else {
			dias = (diaAct - diaN) + diaAct;
		}
		System.out.println("Edad: "+anios+" años, "+meses+" meses y "+dias+" días.");
	}
	
	/**
	 * Funcion que recibe 3 numeros y los devuelve ordenados de menor a mayor
	 * @param a: entero
	 * @param b: entero
	 * @param c: entero
	 */
	public static void ordenadosMenMay (int a, int b, int c) {
		int mayor = 0, mediano= 0, menor= 0;
		if ((a > b) && (b > c)) {
			mayor = a;
			mediano = b;
			menor = c;
		}
		if ((a > c) && (c > b)) {
			mayor = a;
			mediano = c;
			menor = b;
		}
		if ((b > a) && (a > c)) {
			mayor = b;
			mediano = a;
			menor = c;
		}
		if ((b > a) && (c > a)) {
			mayor = b;
			mediano = c;
			menor = a;
		}
		if ((c > a) && (a > b)) {
			mayor = c;
			mediano = a;
			menor = b;
		}
		if ((c > b) && (b > a)) {
			mayor = c;
			mediano = b;
			menor = a;
		}
		System.out.println("Números ordenados. \nMenor: "+menor+"\nMediano: "+mediano+"\nMayor: "+mayor);
	}
	
	/**
	 * Conversor de binario a decimal o de decimal a binario
	 * @param opcion: entero
	 */
	public static void conversorBinDec (int opcion) {
		System.out.println("Introduce numero: ");
		int num = teclado.nextInt();
		
		if (opcion == 1) {
			int cont = 0;
			int numDec = 0;
			while (num > 0) {
				int cifraBin = num % 10;
				int cifraDec = (int) (cifraBin * (Math.pow(2, cont)));
				numDec = numDec+ cifraDec;
				//incremento bucle
				num = num / 10;
				cont++;	
			}
			System.out.println("Numero decimal = "+numDec);
		}
		if (opcion == 2) {
			int numBin = 0;
			int exp = 0;
			while (num > 0) {
				int cifraBin = num % 2;
				numBin = numBin+ (cifraBin * (int) Math.pow(10, exp));
				exp++;
				num = num / 2;
			}
			System.out.println("Numero binario = "+numBin);
		}
	}
	
	/**
	 * Funcion que muestra todas las cifras pares de un numero
	 * @param num: entero
	 */
	public static void cifrasPares (int num) {
		System.out.println("Números pares: ");
		int cantidad = 0;
		for (int cont = 1; cont <= num; cont++) {
			if (cont % 2 == 0) {
				System.out.println(cont+" es par.");
				cantidad++;
			}
		}
		System.out.println("Total de números pares: "+cantidad);
	}
	
	/**
	 * Funcion que muestra todas las cifras impares de un numero
	 * @param num: entero
	 */
	public static void cifrasImpares (int num) {
		System.out.println("Números impares: ");
		int cantidad = 0;
		for (int cont = 1; cont <= num; cont++) {
			if (cont % 2 != 0) {
				System.out.println(cont+" es impar.");
				cantidad++;
			}
		}
		System.out.println("Total de números impares: "+cantidad);
	}
	
	/**
	 * Funcion que suma los digitos de un numero
	 * @param num: entero
	 */
	public static void sumaDigitos (int num) {
		int suma = 0;
		while (num > 0) {
			int cifra = num % 10;
			suma = suma + cifra;
			num = num / 10;
		}
		System.out.println("Suma de las cifras = "+suma);
	}
}
