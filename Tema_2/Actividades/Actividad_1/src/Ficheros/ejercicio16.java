package Ficheros;

import java.util.Scanner;

public class ejercicio16 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce las horas: ");
		int horas = teclado.nextInt();
		System.out.println("Introduce los minutos: ");
		int min = teclado.nextInt();
		System.out.println("Introduce los segundos: ");
		int seg = teclado.nextInt();
		
		Libreria.hora(horas, min, seg);

	}

}
