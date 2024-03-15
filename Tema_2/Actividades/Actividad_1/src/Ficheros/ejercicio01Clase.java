package Ficheros;

import java.util.Scanner;

public class ejercicio01Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lado: ");
		int lado = teclado.nextInt();
		Libreria.areaCuadrado(lado);
		int perimetro = Libreria.perimetroCuadrado(lado);
		System.out.println("El perimetro es "+perimetro);
	}
}
