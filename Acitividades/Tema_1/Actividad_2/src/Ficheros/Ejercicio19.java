package Ficheros;

import java.util.Scanner;

public class Ejercicio19 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Los empleados de una fábrica trabajan por turnos: diurno y nocturno.
		 * Se debe calcular el jornal diario de acuerdo con los siguientes puntos:
		 * horas diurnas es de 20€
		 * horas nocturnas es de 35€
		 * domingo: la tarifa + 10€ para el turno diurno y 15€ para el nocturno. 
		 */
		
		int horas, turno;
		boolean esDomingo;
		
		System.out.println("Introduce número de horas: ");
		horas = teclado.nextInt();
		System.out.println("Tipo de turno: 1-diurno y 2-nocturno");
		turno = teclado.nextInt();
		System.out.println("Es domingo (true/false): ");
		esDomingo = teclado.nextBoolean();
		
		double sueldo = 0.0;
		
		if (turno == 1) {
			sueldo = horas * 20;
			if (esDomingo == true) {
				sueldo = sueldo + 10;
			}
		}
		else {
			sueldo = horas * 35;
			if (esDomingo == true) {
				sueldo = sueldo + 15;
			}
		}
		System.out.println("El sueldo es "+sueldo);

	}

}
