package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio06 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* PIN_SECRETO
		 * tenemos 3 intentos
		 * si eso correcto, mostrar "Login correcto"
		 * sino, "Llamando a la policía
		 */
		
		final int PIN_SECRETO = (int)(Math.random()*9999+0001);
		
		int cont = 1;
		System.out.println("Intento ("+cont+"). Introduce el número PIN: ");
		int pin = teclado.nextInt();	
		
		for (cont = 2; cont <= 3; cont++) {
			if (pin == PIN_SECRETO) {
				System.out.println("¡Login correcto!");
				cont = 3;
			}
			else {
				System.out.println("Intento ("+cont+"). Introduce el número PIN: ");
				pin = teclado.nextInt();	
			}
	
		}
		if (pin != PIN_SECRETO) {
			System.out.println("¡Llamando a la police!");
		}

	}

}
