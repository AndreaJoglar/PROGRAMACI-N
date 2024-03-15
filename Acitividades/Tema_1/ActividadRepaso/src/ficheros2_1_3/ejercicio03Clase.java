package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio03Clase {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		int contNum = 0;
		
		while (contNum < 10 && suma < 100) {
			System.out.println("Introduce un número: ");
			int num = teclado.nextInt();
			contNum++;
			suma+=num;
		}
		if (contNum == 10) System.out.println("Acabamos por leer 10 números.");
		else System.out.println("Acabamos porque la suma es mayor que 100");

	}
}
