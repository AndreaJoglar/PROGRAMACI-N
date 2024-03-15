package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio14 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que calcule
		 * la descomposición en factores primos de un número.
		 */
		/* Se divide el número dado por el menor de sus divisores primos. 
		 * El cociente se vuelve a dividir por el menor de sus divisores primos
		 * y así sucesivamente con los demás cocientes, hasta llegar a un cociente primo que se dividirá por sí mismo.
		 */
		
		System.out.println("Escriba un número entero mayor que 1: ");
		int num = teclado.nextInt();
		int divisor = 2;
		
		
		while (num <= 1) {
			System.out.println(num+" no es mayor que 1. Inténtelo de nuevo: ");
			num = teclado.nextInt();
		}
		
		System.out.print("Descomposición en factores primos: ");
		
		while (num > 1) {
			//buscar un divisor
			if (num % divisor == 0) {
				num = num/divisor;
				System.out.print(divisor+" ");
			}
			else {
				divisor++;
			}
		
		
		}

	}

}
