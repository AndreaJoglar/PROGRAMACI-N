package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio17 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir cantidad de números
		 * pedir números
		 * escribir cuántos negativos
		 */
		
		System.out.println("¿Cuántos números vas a introducir?");
		int cantidad = teclado.nextInt();
		
		while (cantidad < 0) {
			System.out.println("¡Imposible! Vuelva a intentarlo: ");
			cantidad = teclado.nextInt();
		}
				
		int contNegativos = 0;
		
		for (int cont = 1; cont <= cantidad; cont++) {
			System.out.print("Escriba el número "+cont+": ");
			int num = teclado.nextInt();
			if (num < 0) {
				contNegativos++;
			}
		}
		
		if ((cantidad == 0) || (contNegativos == 0)) {
			System.out.println("No ha escrito ningún número negativo.");
		}
		else {
			if (contNegativos == 1) {
				System.out.println("Ha escrito "+contNegativos+" número negativo.");
			}
			else {
				System.out.println("Ha escrito "+contNegativos+" números negativos.");
			}
		}
		

	}

}
