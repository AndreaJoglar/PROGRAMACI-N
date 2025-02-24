package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio04 {
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
		 * 
		 */
		
		final int correcto = (int) (Math.random()*20 + 1);
		int intentos = 1;
		
		boolean acierto = false;
		
		System.out.println("Prueba suerte y escribe un número entre el 1 y el 20 (intento: "+intentos+"): ");
		int num = teclado.nextInt();
		
		while (acierto == false) {
			if (num == correcto) {
				acierto = true;
			}
			else {
				intentos++;
				if (num > correcto) {
					
					System.out.println("El número que escribiste es mayor que el que buscamos. Prueba otra vez (intento: "+intentos+"): ");
					num = teclado.nextInt();
				}
				else {
					System.out.println("El número que escribiste es menor que el que buscamos. Prueba otra vez (intento: "+intentos+"): ");
					num = teclado.nextInt();
				}
			}
		}
		if (intentos < 5) {
			if (intentos == 1) {
				System.out.println("¡Enhorabuena! Solo necesitaste "+intentos+" intento.");
			}
			else {
				System.out.println("¡Enhorabuena! Solo necesitaste "+intentos+" intentos.");
			}
		}
		else {
			if ((intentos >= 5) && (intentos <= 10)) {
				System.out.println("No está mal. Necesitaste "+intentos+" intentos. ¿Crees que podrías acertar más rápido?");
			}
			else {
				System.out.println("Debes echarle más horas. Pero siempre puedes volver a intentarlo.");
			}
		}

	}

}
