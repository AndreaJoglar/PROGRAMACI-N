package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio02 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inicializar con el primero. boolean primero = true
		
		int suma = 0;
		int mayor = 0, menor = 0;
		boolean esPrimero = true;
		
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Escribe un número: ");
			int num = teclado.nextInt();
			suma += num;
			if (esPrimero == true) {
				mayor = menor = num;
				esPrimero = false;
			}
			else {
				if (num < menor) {
					menor = num;
				}
				if (num > mayor) {
					mayor = num;
				}
			}
		}
		System.out.println("Suma = "+suma);
		System.out.println("Media = "+suma/10.0);
		System.out.println("Menor = "+menor);
		System.out.println("Mayor = "+mayor);

	}

}
