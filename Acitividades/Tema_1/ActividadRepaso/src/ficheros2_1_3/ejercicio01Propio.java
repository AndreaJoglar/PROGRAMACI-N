package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio01Propio {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir cantidad de números que se quieren mostrar
		 * mostrar serie 5, 10, 15, 20, 25...
		 */
		
		System.out.println("¿Cuántos números quieres mostrar?");
		int cantidad = teclado.nextInt();
		
		int num = 0;
		
		for (int cont = 1; cont <= cantidad; cont++) {
			num = num + 5;
			if (cont == cantidad) {
				System.out.print(num+".");
			}
			else {
				System.out.print(num+", ");
			}
			
		}

	}

}
