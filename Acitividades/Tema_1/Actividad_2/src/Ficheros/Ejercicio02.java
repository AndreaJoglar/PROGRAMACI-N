package Ficheros;

import java.util.Scanner;

public class Ejercicio02 {
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calcular la superficie y el perímetro 
		 * de un rectángulo cuyos datos pediremos por teclado
		 */
		// Declaramos la base y la altura
		
		int base, altura;
		System.out.println("Introduce la base: ");
		base = teclado.nextInt();
		System.out.println("Introduce la altura: ");
		altura = teclado.nextInt();
		
		if(base >= 0 && altura >= 0) {
			//valores correctos
			int area = base * altura;
			int perimetro = (2 * base) + (2 * altura);
			System.out.println("Area: "+area);
			System.out.println("Perimetro: "+perimetro);
		}
		else {
			if (altura < 0) {
				System.out.println("ERROR altura negativa");
			}
			if (base < 0) {
				System.out.println("ERROR base negativa");
			}
			// Hacemos esto para saber cuál de los dos valores introducimos mal
		}

	}

}
