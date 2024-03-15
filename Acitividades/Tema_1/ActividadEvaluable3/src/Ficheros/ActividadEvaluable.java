package Ficheros;

import java.util.Scanner;

public class ActividadEvaluable {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		int nuevoNum = 0;
		
		while (num <= 0) {
			System.out.println("Error: número negativo. Vuelva a intentarlo: ");
			num = teclado.nextInt();
		}
		
		while (num != 0) {
			int cifra = num % 10;
			num = num / 10;
			nuevoNum = nuevoNum * 10 + cifra;
		}
		num = nuevoNum;
		System.out.println("Número invertido = "+num);
		
		
		
		
		

	}

}
