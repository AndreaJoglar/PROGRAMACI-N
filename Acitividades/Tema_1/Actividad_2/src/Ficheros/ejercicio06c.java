package Ficheros;

import java.util.Scanner;

public class ejercicio06c {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calcular la raíz cuadrada de un número entero
		 * usando solo sumas, restas, multiplicaciones y divisiones
		 */
		System.out.println("Introduce un número: ");
		double num = teclado.nextDouble();
		
		double potencia = 0;
		int cont = 0;
		
		while (num > potencia) {
			cont++;
			potencia = cont * cont;
			if (potencia > num) cont--;
		}
		System.out.println("La parte entera de la raíz es "+ cont);
	}
}
