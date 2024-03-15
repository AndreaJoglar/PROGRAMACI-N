package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio07 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida el año actual y un año cualquiera
		 * y que escriba cuántos años han pasado desde ese año
		 * o cuántos años faltan para llegar a ese año.
		 */
		
		System.out.println("¿En qué año estamos?");
		int actual = teclado.nextInt();
		System.out.println("Introduce un año cualquiera: ");
		int cualquiera = teclado.nextInt();
		int anios;
		
		if (actual == cualquiera) {
			System.out.println("¡Son el mismo año!");
		}
		else {
			if (actual > cualquiera) {
				anios = actual - cualquiera;
				System.out.println("Desde el año "+cualquiera+" han pasado "+anios+" años.");
			}
			else {
				if (cualquiera > actual) {
					anios = cualquiera - actual;
					System.out.println("Para llegar al año "+cualquiera+" faltan "+anios+" años.");
				}
			}
		}

	}

}
