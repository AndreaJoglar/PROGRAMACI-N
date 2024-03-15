package Ficheros;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calcula cual es el mayor, mediano y menor
		 * de tres números que se piden por teclado
		 */
		int n1, n2, n3;
		int mayor = 0, mediano = 0, pequeño = 0;
		
		System.out.println("Introduce un número: ");
		n1 = teclado.nextInt();
		System.out.println("Introduce un número: ");
		n2 = teclado.nextInt();
		System.out.println("Introduce un número: ");
		n3 = teclado.nextInt();
		
		//Colocamos los condicionales
		
		if (n1 > n2 && n2 > n3) {
			mayor = n1;
			mediano = n2;
			pequeño = n3;
		}
		if (n1 > n2 && n3 > n2 && n1 > n3) {
			mayor = n1;
			mediano = n3;
			pequeño = n2;
		}
		if (n1 > n2 && n3 > n2 && n3 > n1) {
			mayor = n3;
			mediano = n1;
			pequeño = n2;
		}
		if (n2 > n1 && n2 > n3 && n1 > n3 ) {
			mayor = n2;
			mediano = n1;
			pequeño = n3;
		}
		if (n2 > n1 && n2 > n3 && n3 > n1) {
			mayor = n2;
			mediano = n3;
			pequeño = n1;
		}
		if (n3 > n2 && n2 > n1) {
			mayor = n3;
			mediano = n2;
			pequeño = n1;
		}
		System.out.println("Mayor: "+mayor+" Mediano: "+mediano+" Pequeño: "+pequeño);
		

	}

}
