package Ficheros;

import java.util.Scanner;

public class Actividad {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce número 1: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduce número 2: ");
		int num2 = teclado.nextInt();
		
		int opcion = Libreria.menu();
		
		if (opcion == 1) {
			if (Libreria.numeroInverso(num1) == num2) {
				System.out.println("Son cuñados");
			}
			else System.out.println("No son cuñados");
		}
		
		int digitoNum1 = 0;
		boolean condicion = false;
		
		if (opcion == 2) {
			while ((num1 >= 1) && (condicion == false)) {
				digitoNum1 = num1 % 10;
				num1 = num1 / 10;
				condicion = Libreria.contieneDigito(num2, digitoNum1);
			}
			if (Libreria.contieneDigito(num2, digitoNum1)) {
				System.out.println("Son familia");
			}
			else System.out.println("No son familia");
			
		}
	

	}

}
