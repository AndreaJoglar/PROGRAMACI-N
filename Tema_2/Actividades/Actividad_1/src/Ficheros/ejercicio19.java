package Ficheros;

import java.util.Scanner;

public class ejercicio19 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce la fecha de hoy. \n1. Día: ");
		int diaAct = teclado.nextInt();
		System.out.println("2. Mes: ");
		int mesAct = teclado.nextInt();
		System.out.println("3. Año: ");
		int anioAct = teclado.nextInt();
		
		System.out.println("Introduce tu fecha de nacimiento. \n1. Día: ");
		int diaN = teclado.nextInt();
		System.out.println("2. Mes: ");
		int mesN = teclado.nextInt();
		System.out.println("3. Año: ");
		int anioN = teclado.nextInt();
		
		Libreria.edad(diaAct, mesAct, anioAct, diaN, mesN, anioN);
		

	}

}
