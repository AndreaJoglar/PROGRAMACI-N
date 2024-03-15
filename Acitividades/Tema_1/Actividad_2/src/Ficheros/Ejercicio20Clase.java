package Ficheros;

import java.util.Scanner;

public class Ejercicio20Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Dado el nombre o numero de mes y año
		 * comprobando si es bisiesto o no,
		 * determinar el número de días del mes.
		 */
		
		int mes, anio;
		
		System.out.println("Introduce un mes: ");
		mes = teclado.nextInt();
		System.out.println("Introduce un año: ");
		anio = teclado.nextInt();
		
		if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
			System.out.println("El mes tiene 30 días");
		}
		else {
			if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
				System.out.println("El mes tiene 31 días");
			}
			else {
				if (mes == 2) {
					if ((anio % 4 == 0) && (anio % 100 != 0)) {
						System.out.println("El año es bisiesto. El mes tiene 29 días.");
					}
					else {
						System.out.println("El mes tiene 28 días.");
					}
				}
				else {
					System.out.println("Error en el mes.");
				}
				
			}
		}
	}

}
