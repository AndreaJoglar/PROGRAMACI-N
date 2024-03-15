package Ficheros;

import java.util.Scanner;

public class Ejercicio01 {
	static Scanner teclado = new Scanner (System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calcular la superficie y el perímetro 
		 * de un cuadrado cuyo lado pediremos por teclado
		 */
		/* area de un cuadrado = lado * lado
		 *  perímetro = lado * 4
		 */
		// 1. Leemos el dato 
		
		int lado;
		System.out.print("Introduce lado: ");
		lado = teclado.nextInt();
		
		if (lado >= 0) {
			//lado positivo
			int area = lado * lado;
			int perimetro = 4 * lado;
			System.out.println("Area ="+area);
			System.out.println("Perimetro ="+perimetro);
		}
		else {
			System.out.println("ERROR valor negativo");
		}

	}

}
