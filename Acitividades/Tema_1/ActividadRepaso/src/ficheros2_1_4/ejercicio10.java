package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio10 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Pedir número de día y número de mes
		 * Mostrar estación del año:
		 * si mes 12 (y día  || >=21), 1, 2, 3 (y día >= 20: ES INVIERNO
		 * si mes 3 (y día <= 21),4, 5 o 6 (y día <= 21) PRIMAVERA
		 * si mes 6 (y día <= 22), 7, 8, 9 (y día <= 22) VERANO
		 * else ES OTOÑO
		 * 
		 */
		System.out.println("Introduce un mes: ");
		int mes = teclado.nextInt();
		while ((mes < 1) || (mes > 12)) {
			System.out.println("Solo hay 12 meses. Inténtalo de nuevo: ");
			mes = teclado.nextInt();
		}
		
		System.out.println("Introduce un día del mes: ");
		int dia = teclado.nextInt();
		
		if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
			while ((dia < 1) || (dia > 30)) {
				System.out.println("El mes tiene 30 días. Por favor, indique un día correcto: ");
				dia = teclado.nextInt();
			}
		}
		else {
			if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
				while ((dia < 1) || (dia > 31)) {
					System.out.println("El mes tiene 31 días. Introduzca un día correcto: ");
					dia = teclado.nextInt();
				}
			}
			else {
				if (mes == 2) {
					while ((dia < 1) || (dia > 29)) {
						System.out.println("El mes tiene 28 o 29 días. Por favor, introduzca un día correcto: ");
						dia = teclado.nextInt();
					}
				}	
			}
		
		}
		if (((mes == 12) && (dia >= 21)) || (mes == 1) || (mes == 2) || ((mes == 3) && (dia <= 20))) {
			System.out.println("Es invierno");
		}
		else {
			if (((mes == 3) && (dia >= 21) || (mes == 4) || (mes == 5) || (mes == 6) && (dia <= 21))) {
				System.out.println("Es primavera");
			}
			else {
				if (((mes == 6) && (dia >= 22)) || (mes == 7) || (mes == 8) || ((mes == 9) && (dia <= 22))) {
					System.out.println("Es verano");
				}
				else {
					System.out.println("Es otoño");
				}
			}
		}
		
		
	}

}
