package Ficheros;

import java.util.Scanner;

public class ejercicio02 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el radio: ");
		double radio = teclado.nextDouble();
		Libreria.areaCirculo(radio);
		System.out.println("Perimetro: "+Libreria.perimetroCirculo(radio)); 
		//podemos mostrar directamente la función llamada
	}
}
