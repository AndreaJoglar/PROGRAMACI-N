package Ficheros;

import java.util.Scanner;

public class Ejercicio17 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Realiza un algoritmo que resuelva una ecuación de segundo grado. 
		 * El programa pedirá por teclado los 3 coeficientes y mostrará las posibles soluciones:
		 * no tiene solución, una única solución (y su valor) o dos soluciones (y sus valores)
		 * ecuación segundo grado -->(-b±√(b²-4ac))/(2a)
		 * No tendría solución si la raíz cuadrada es negativa: b² - 4ac < 0 --> no solución 
		 * Solo tiene una solución cuando la raíz es igual que 0--> b² - 4ac = 0 --> soluc = -b/2a
		 * Tiene dos soluciones cuando la raíz es mayor que 0 --> b² -4ac > 0:
		 * 														sol 1 = -b+√(b²-4ac))/(2a)
		 * 														sol 2 =-b-√(b²-4ac))/(2a)
		 */
		
		int a, b, c;
		
		System.out.println("Introduce un valor: ");
		a = teclado.nextInt();
		System.out.println("Introduce un valor: ");
		b = teclado.nextInt();
		System.out.println("Introduce un valor: ");
		c = teclado.nextInt();
		
		int raiz = (b * b) - (4 * a * c);
		
		if (raiz < 0) {
			System.out.println("No tiene solución.");
		}
		else {
			if (raiz == 0) {
				int sol = (-1 * b) / (2 * a);
				System.out.println("Una solución: "+sol);
			}
			else {
				double solRaiz = Math.sqrt(raiz);
				double sol1 = (((-1) * b) + solRaiz) / (2 * a);
				double sol2 = (((-1) * b) - solRaiz) / (2 * a);
				System.out.println("Solución 1 = "+sol1+" Solución 2 = "+sol2);
			}
		
		}

	}

}
