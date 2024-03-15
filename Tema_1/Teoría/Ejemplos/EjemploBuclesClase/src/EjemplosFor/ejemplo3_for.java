package EjemplosFor;

import java.util.Scanner;

public class ejemplo3_for {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*leer secuencia de números
		 * hasta meter un cero
		 */
		System.out.println("Número: ");
		int num = teclado.nextInt();
				
		for ( ; num != 0; ) { //funciona, pero no tiene mucho sentido plantear este algoritmo con for cuando es como un while
			System.out.println("Valor = "+num);
			System.out.println("Otro número: ");
			num = teclado.nextInt();
		}
		System.out.println("FIN");

	}

}
