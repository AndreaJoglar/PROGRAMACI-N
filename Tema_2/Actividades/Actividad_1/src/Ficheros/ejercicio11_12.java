package Ficheros;

import java.util.Scanner;

public class ejercicio11_12 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial de 4! = "+Libreria.factorial(4));
		
		int n = 4;
		int k = 3;
		
		int numCombinatorio = Libreria.factorial(n)/Libreria.factorial(k) *
								Libreria.factorial(n-k);
		System.out.println("Combinatorio (4,3) = "+numCombinatorio);

	}

}
