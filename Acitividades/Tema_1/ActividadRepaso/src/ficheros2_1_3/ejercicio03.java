package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio03 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir números hasta que
		 * 1) se haya introducido 10 números
		 * 2) la suma de todos los números sea mayor de 100
		 * mostrar qué condición se ha cumplido
		 * si se introdujeron 10 números
		 * o si se superó con la suma 100
		 */
		
		boolean condicion1 = true; 
		boolean condicion2 = true;
		int suma = 0;
		int cont = 1;
		
		while ((condicion1 == true) && (condicion2 == true)) {
			System.out.println("Introduce un número ("+cont+"): ");
			int num = teclado.nextInt();
			suma = suma + num; 
			cont++;
			if (cont > 10) {
				condicion1 = false;
			}
			if (suma > 100) {
				condicion2 = false;
			}
		}
		if (condicion1 == false) {
			System.out.println("Finaliza el programa. Ya has introducido 10 números.");
		}
		else {
			System.out.println("Finaliza el programa. La suma de los números (suma = "+suma+") supera 100.");
		}
	}
}
