package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio01 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa en Java que genere la siguiente serie: 5,10,15,20,25,30… 
		 * El programa preguntará primero cuantos términos se quieren mostrar 
		 * y después mostrará la serie correspondiente.
		 */
		
		System.out.println("¿Cuántos números quieres mostrar?");
		int cantidadNum = teclado.nextInt();
		int valor = 5;
		
		for (int cont = 1; cont <= cantidadNum; cont++) {
			System.out.println("("+cont+"): "+valor);
			valor+=5;
		}

	}

}
