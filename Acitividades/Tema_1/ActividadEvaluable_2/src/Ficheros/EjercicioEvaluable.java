package Ficheros;

import java.util.Scanner;

public class EjercicioEvaluable {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Algoritmo fecha (día, mes, año) por teclado
		 * Calcular fecha al sumar un día.
		 * datos = int positivo
		 */
		
		int dia, mes, anio;
		System.out.println("Introduce el día: ");
		dia = teclado.nextInt();
		System.out.println("Introduce el mes: ");
		mes = teclado.nextInt();
		System.out.println("Introduce el año: ");
		anio = teclado.nextInt();
		
		dia++;
		
		if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
			if (dia == 31) {
				dia = 1;
				mes++;
			}
		}
		else {
			if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
			
				if (dia == 32) {
					dia = 1;
					mes++;
					if (mes == 13) {
						mes = 1;
						anio++;
					}
				}
			}
			else {
				if (mes == 2) {
					if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) {
						
						if (dia == 30) {
							dia = 1;
							mes++;
						}
					}
					else {
						
						if (dia == 29) {
							dia = 1;
							mes++;
						}
					}
				}
			}
		}
		System.out.println("La fecha = "+dia+" / "+mes+" / "+anio);
	}
}
