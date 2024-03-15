package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio04Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Adivinar número entre 1 y 20
		 * número se definió como una constante
		 * pedir números al usuario
		 * el programa indica si el número es mayor o menor que la constante
		 * mostrar cantidad de intentos necesarios para acertar
		 * si cantidad intentos < 5 mostrar enhorabuena
		 * si cantidad <=10 y >= 5: no está mal
		 * si cantidad > 10 debe practicar más
		 */
		
		final int NUMERO_SECRETO = (int) ((Math.random()*20)+1);
		
		boolean acierto = false;
		
		int intentos = 0;
		
		while (acierto == false) {
			System.out.println("Escribe un número: ");
			int num = teclado.nextInt();
			intentos++;
			if (num == NUMERO_SECRETO) {
				acierto = true;
			}
			else {
				if (num < NUMERO_SECRETO) {
					System.out.println("El número secreto es mayor.");
				}
				else {
					System.out.println("El número secreto es menor.");
				}
			}
		}
		if (intentos < 5) System.out.println("Enhorabuena!!");
		if ((intentos >= 5 && (intentos <= 10))) System.out.println("No está mal");
		if (intentos > 10) System.out.println("Debes practicar más");

	}

}
