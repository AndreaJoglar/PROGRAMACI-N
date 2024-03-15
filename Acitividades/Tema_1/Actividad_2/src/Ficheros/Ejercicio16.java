package Ficheros;

import java.util.Scanner;

public class Ejercicio16 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dada una hora por teclado (horas, minutos y segundos)
		 * realizar un algoritmo que muestre la hora después de incrementar un segundo.
		 */
		int horas, min, seg;
		
		
		System.out.println("Introduce las horas: ");
		horas = teclado.nextInt();
		System.out.println("Introduce los minutos: ");
		min = teclado.nextInt();
		System.out.println("Introduce los segundos: ");
		seg = teclado.nextInt();
		
		seg++; //Incremento seg ++ --> seg = seg + 1
		
		if (seg == 60) {
			seg = 0;
			min++;
			if (min == 60) {
				min = 0;
				horas++;
				if (horas == 24) {
					horas = 0;
				}
			}
		}
		System.out.println("Son las "+horas+":"+min+":"+seg);
		
		

	}

}
