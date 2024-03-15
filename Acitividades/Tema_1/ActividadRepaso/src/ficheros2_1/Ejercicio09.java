package ficheros2_1;

import java.util.Scanner;

public class Ejercicio09 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número: ");
		int N = teclado.nextInt();
		long suma = 0; //variable más grande para los enteros
			
		for (int num = 0; num <= N; num++) {
			long fact = 1;
			for (int cont = 1; cont <= num; cont++) {
				fact = fact * cont;
			}
			suma = suma + fact;
			System.out.println(num+"! : "+fact);
		}
		System.out.println("Suma de factoriales = "+suma);

	}

}
