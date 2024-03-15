package Ficheros;

import java.util.Scanner;

public class Ejercicio5Clase {
	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		//leemos el valor de a y b
		//solución con variable auxiliar (temp)
		
		System.out.print("Introduce a: ");
		a = teclado.nextInt();
		System.out.print("Introduce b : ");
		b = teclado.nextInt();
		System.out.println("a = "+a+" b = "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = "+a+" b = "+b);
		
		

	}

}
