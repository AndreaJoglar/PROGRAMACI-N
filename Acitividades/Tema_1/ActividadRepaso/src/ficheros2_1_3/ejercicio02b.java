package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio02b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inicializar con el primero. boolean primero = true
		
		
		
		System.out.println("Escribe un número: ");
		int num = teclado.nextInt();
		int suma = num;
		int mayor = num;
		int menor = num;
		
		
		for (int cont = 2; cont <= 10; cont++) {
			System.out.println("Escribe un número: ");
			num = teclado.nextInt();
			suma += num;
			if (num < menor) {
					menor = num;
				}
			if (num > mayor) {
					mayor = num;
				}
		}
		System.out.println("Suma = "+suma);
		System.out.println("Media = "+suma/10.0);
		System.out.println("Menor = "+menor);
		System.out.println("Mayor = "+mayor);

	}

}
