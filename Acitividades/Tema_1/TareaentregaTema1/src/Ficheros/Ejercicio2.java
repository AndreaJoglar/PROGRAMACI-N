package Ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numMes = 1;
		double prestamo, impFinal;
		int cuantiaMes;
		
		System.out.println("Introduce la cantidad del préstamo que debe devolver: ");
		prestamo = teclado.nextDouble();
		
		impFinal = prestamo + (prestamo * 0.05);
		cuantiaMes = 10;
		double temp = impFinal;
		
		while (prestamo <= 0) {
			System.out.println("Valor incorrecto. Introduzca un número válido para el préstamo: ");
			prestamo = teclado.nextDouble();
		}
		
		while (impFinal > cuantiaMes) {
			impFinal = impFinal - cuantiaMes;
			System.out.println("El mes "+numMes+" deberá pagar "+cuantiaMes+" (pendiente de pago: "+impFinal+")");
			cuantiaMes = cuantiaMes * 2;
			numMes++;
		}
		if (impFinal < cuantiaMes) {
			cuantiaMes = 0;
			System.out.println("El mes "+numMes+" deberá pagar "+impFinal+" (pendiente de pago: "+cuantiaMes+").");
		}
		System.out.println("Deberás devolver el préstamo en "+numMes+" meses.");
		System.out.println("Importe final = "+temp);
	
		
		
		
			
		
		

	}

}
