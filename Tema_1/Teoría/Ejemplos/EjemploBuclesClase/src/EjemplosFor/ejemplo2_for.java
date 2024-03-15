package EjemplosFor;

import java.util.Scanner;

public class ejemplo2_for {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* calcular divisiones bucles for
		 * restando dividendo - divisor
		 * el resto es el resultado
		 * el cociente es el número de restas
		 */
		
		int D, d;
		
		System.out.println("Dividendo: ");
		D = teclado.nextInt();
		System.out.println("Divisor: ");
		d = teclado.nextInt();
		
		int coc = 0;
		int resto = D;
		
		for (; resto >= d; resto = resto - d) {
			coc = coc + 1;
		}
		System.out.println("Cociente = "+coc+" Resto = "+resto);
		
		
		

	}

}
