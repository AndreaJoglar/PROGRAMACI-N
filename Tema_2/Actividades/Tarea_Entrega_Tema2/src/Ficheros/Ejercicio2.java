package Ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un día: ");
		int dia = teclado.nextInt();
		
		System.out.println("Introduce un mes: ");
		int mes = teclado.nextInt();
		
		System.out.println("Introduce un año: ");
		int year = teclado.nextInt();
		
		while (Libreria.validarFecha(dia, mes, year) == false) {
			//pedir datos
			System.out.println("Por favor, vuelva a intentarlo. \nIntroduce un día: ");
			dia = teclado.nextInt();
			
			System.out.println("Introduce un mes: ");
			mes = teclado.nextInt();
			
			System.out.println("Introduce un año: ");
			year = teclado.nextInt();
		}
		
		int valor = Libreria.calcularDias(dia, mes, year) % 7;
		switch (valor) {
		case 0: {
			System.out.println("Sábado.");
			break;
		}
		case 1: {
			System.out.println("Domingo.");
			break;
		}
		case 2: {
			System.out.println("Lunes.");
			break;
		}
		case 3: {
			System.out.println("Martes.");
			break;
		}
		case 4: {
			System.out.println("Miércoles.");
			break;
		}
		case 5: {
			System.out.println("Jueves.");
			break;
		}
		case 6: {
			System.out.println("Viernes.");
			break;
		}
		default:
			
		}

	}

}
