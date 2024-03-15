package ficheros2_1;

import java.util.Scanner;

public class Ejercicio01 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir un programa que pregunte al usuario su edad
		 * y muestre por pantalla todos los años que ha cumplido
		 * (desde 1 hasta su edad).
		 */
		System.out.println("¿Cuántos años tienes?");
		int edad = teclado.nextInt();
		int annio = 2023 - edad;
		
		while (edad < 0) {
			System.out.println("No mientas, gañán, que nadie cumple años en negativo. Pon tu verdadera edad: ");
			edad = teclado.nextInt();
			
		}
		if (edad == 0) {
			System.out.println("Eres un bebé. Cuando cumplas un añín te cuento.");
		}
		
		for (int cumple = 1; cumple <= edad; cumple++) {
			annio++;
			if (cumple == 1) {
				
				System.out.println("En el "+annio+" cumpliste "+cumple+" año.");
			}
			else {
				System.out.println("En el "+annio+" cumpliste "+cumple+" años.");
			}
			
		}

	}

}
