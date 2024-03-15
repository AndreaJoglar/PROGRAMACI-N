package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio03 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida una cantidad de segundos
		 * y que escriba cuántas horas, minutos y segundos son.
		 */
		
		System.out.println("Introduce los segundos: ");
		int segundos = teclado.nextInt();
		
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		int seg = segundos % 60;
		
		System.out.println(segundos+" segundos son "+horas+" horas, "+minutos+" minutos y "+seg+" segundos.");

	}

}
