package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio12BinarioADecimal {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pasar número binario
		 * a decimal
		 */
		
		System.out.println("Introduce un número binario: ");
		int binario = teclado.nextInt();
		
		int posicion = 0;
		int valorAcumulado = 0;
		
		while (binario > 0) {
			int cifra = binario % 10;
			valorAcumulado = (int) (cifra*Math.pow(2, posicion)) + valorAcumulado;
			binario = binario / 10;
			posicion++;
		}
		System.out.println("El valor decimal es "+valorAcumulado);
		

	}

}
