package Ficheros;

import java.util.Scanner;

public class ejercicio16b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce las horas: ");
		int hora = teclado.nextInt();
		System.out.println("Introduce los minutos: ");
		int min = teclado.nextInt();
		System.out.println("Introduce los segundos: ");
		int seg = teclado.nextInt();
		
		incrementaHora(hora, min, seg);

	}
	public static void incrementaHora (int hora, int min, int seg) {
		System.out.println("Función tres parámetros: ");
		seg++;
		if (seg == 60) {
			seg = 0;
			min++;
			if (min == 60) {
				min = 0;
				hora++;
				if (hora == 24) {
					hora = 0;
				}
			}
		}
		System.out.println("Hora incrementada: "+hora+":"+min+":"+seg);
	}


}
