package Ficheros;

import java.util.Scanner;

public class Ejercicio12 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Diseña un algoritmo que determine si 5 números pedidos por teclado 
		 * son consecutivos o no.
		 */
		System.out.println("Introduce un número: ");
		int ant = teclado.nextInt();
		
		int cont = 1;
		boolean consecutivos = true;
		
		while (cont < 5) {
			System.out.println("Introduce un número: ");
			int act = teclado.nextInt();
			if ((ant - act != 1) && (ant - act != -1)) {
				consecutivos = false;
			}
			ant = act;
			cont = cont + 1;
		}
		if (consecutivos == true) {
			System.out.println("Son consecutivos");
		}
		else {
			System.out.println("ERROR");
		}
	}

}
