package Ficheros;

import java.util.Scanner;

public class ejercicio23 {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		
		Libreria.sumaDigitos(num);
	}
}
