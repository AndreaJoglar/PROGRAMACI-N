package Ficheros;

import java.util.Scanner;

public class Libreria {
	
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Función de eleccion en un menu
	 * @return entero
	 */
	public static int menu () {
		System.out.println("CALCULO DE AREAS: \n1- Calcular el area de un triangulo: "
				+"\n2- Calcular el area de un trapecio: \n3- Calcular el area de un rectangulo: "
				+"\n4- Calcular el area de un cuadrado: ");
		int opcion = teclado.nextInt();
		return opcion;
	}
	
	/**
	 * Calcula el area del triangulo
	 */
	public static void areaTriangulo () {
		System.out.println("Introduce la base: ");
		int b = teclado.nextInt();
		System.out.println("Introduce la altura: ");
		int a = teclado.nextInt();
		int area = (b * a) / 2;
		System.out.println("Area triangulo: "+area);
	}
	
	/**
	 * Calcula el area del trapecio
	 */
	public static void areaTrapecio () {
		System.out.println("Introduce la base pequeña: ");
		int b = teclado.nextInt();
		System.out.println("Introduce la base grande: ");
		int B = teclado.nextInt();
		System.out.println("Introduce la altura: ");
		int h = teclado.nextInt();
		int area = ((b + B) * h) / 2;
		System.out.println("Area trapecio: "+area);
	}
	
	/**
	 * Calcula el area del rectangulo
	 */
	public static void areaRectangulo () {
		System.out.println("Introduce la base: ");
		int b = teclado.nextInt();
		System.out.println("Introduce la altura: ");
		int h = teclado.nextInt();
		int area = (b * h);
		System.out.println("Area rectangulo: "+area);
	}
	
	/**
	 * Calcula el area del cuadrado
	 */
	public static void areaCuadrado () {
		System.out.println("Introduce el lado: ");
		int l = teclado.nextInt();
		int area = (l * l);
		System.out.println("Area cuadrado: "+area);
	}

}
