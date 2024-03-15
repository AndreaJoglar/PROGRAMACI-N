package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio12Octal {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* calcular combinación binario
		 * octal
		 * hexadecimal
		 * de un número decimal pedido
		 */
		
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		
		int posicion = 0;
		int valorAcumulado = 0;
		
		while (num >= 8) {
			int resto = num % 8;
			valorAcumulado = ((resto * (int)Math.pow(10, posicion))+valorAcumulado);
			posicion++;
			num = num/8;
		}
		valorAcumulado = ((num * (int)Math.pow(10, posicion))+valorAcumulado);
		System.out.println("Número = "+valorAcumulado);
		

	}

}
