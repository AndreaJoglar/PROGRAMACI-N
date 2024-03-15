package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio02 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida una cantidad de segundos
		 *  y que escriba cuántos minutos y segundos son.
		 */
		
		System.out.println("Introduce segundos: ");
		int seg = teclado.nextInt();
		
		int min = seg / 60;
		int segundos = seg % 60;
		
		System.out.println(seg+" segundos son "+min+" minutos y "+segundos+" segundos");
		

	}

}
