package Ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce el número del DNI (sin letra): ");
		int dni = teclado.nextInt();
		
		while (Libreria.comprobarDni(dni) == false) {
			System.out.println("ERROR en el DNI. Por favor, inténtelo de nuevo: ");
			dni = teclado.nextInt();
		}
		
		System.out.println("Introduce una letra: ");
		char letra = teclado.next().charAt(0);
		letra = Character.toUpperCase(letra);
		Libreria.dniValido(dni, letra);
	}

}
