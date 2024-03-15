package Ficheros;

import java.util.Scanner;

public class ejercicio01 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* calcular área y perímetro del cuadrado
		 * programación modular
		 */
		System.out.println("Lado: ");
		int lado = teclado.nextInt();
		
		calcularArea(lado);
		calcularPerimetro(lado);
	}
	/**
	 * Calcula el área del cuadrado
	 * @param lado entero
	 */
	public static void calcularArea (int lado) {
		int area = lado * lado;
		System.out.println("El área es "+area);
	}
	/**
	 * Calcula el perímetro del cuadrado
	 * @param lado entero
	 */
	public static void calcularPerimetro (int lado) {
		int perimetro = 4 * lado;
		System.out.println("El perímetro es "+perimetro);
	}
	
}
