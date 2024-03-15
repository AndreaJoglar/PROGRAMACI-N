package ficheros2_1_2;

import java.util.Scanner;

public class Ejercicio12 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida un valor límite positivo
		 * y a continuación pida números
		 * hasta que la suma de los números introducidos
		 * supere el límite inicial.
		 */
		
		System.out.println("Escribe un valor límite positivo: ");
		double limite = teclado.nextInt();
		
		while (limite <= 0) {
			System.out.println("El límite debe ser mayor que 0. Inténtelo de nuevo: ");
			limite = teclado.nextDouble();
		}
		
		double num = 0;
		double suma = 0;
		
		while (suma < limite) {
			System.out.println("Escribe un número: ");
			num = teclado.nextDouble();
			suma = suma + num;
			
		}
		if (suma > limite) {
			System.out.println("Ha superado el límite. La suma de los números introducidos es "+suma);
		}
		
		

	}

}
