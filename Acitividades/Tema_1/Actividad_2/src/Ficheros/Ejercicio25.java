package Ficheros;

import java.util.Scanner;

public class Ejercicio25 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Media de números. Para cuando metemos un número negativo
		 * Media de números y cantidad introducida.
		 * leer num
		 * if (num < 0)
		 * condicion == false
		 * else suma = suma + num
		 * contNum++
		 * media = media / contNum;
		 */
		
		boolean condicion = true;
		int suma = 0;
		int contNum = 0;
		
		while (condicion == true) {
			System.out.println("Número: ("+contNum+"): ");
			int num = teclado.nextInt();
			if (num < 0) {
				condicion = false;
			}
			else {
				suma = suma + num;
				contNum++;
			}
		}
		if (contNum > 0) {
			double media = (double) suma /contNum;
			System.out.println("La media "+media);
		}
		System.out.println("FIN!!");
		

	}

}
