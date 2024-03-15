package Ficheros;

import java.util.Scanner;

public class ejercicio10 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce número de horas de trabajo diarias: ");
		int horas = teclado.nextInt();
		System.out.println("¿Es diurno? (true/false)");
		boolean esDiurno = teclado.nextBoolean();
		System.out.println("¿Es domingo? (true/false)");
		boolean esDomingo = teclado.nextBoolean();
		
		System.out.println("Sueldo diario: "+Libreria.sueldoDiario(horas, esDiurno, esDomingo));
	}


}
