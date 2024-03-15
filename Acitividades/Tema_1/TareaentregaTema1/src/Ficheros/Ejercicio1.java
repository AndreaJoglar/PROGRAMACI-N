package Ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double inf, sup, num, suma;
		int contInf, contSup, contFuera;
				
		num = 1;
		suma = 0;
		contInf = 0;
		contSup = 0;
		contFuera = 0;
		
		System.out.println("Introduce el número inferior del intervalo: ");
		inf = teclado.nextDouble();
		
		System.out.println("Introduce el número superior del intervalo: ");
		sup = teclado.nextDouble();
		
		while (sup < inf) {
			System.out.println("El número superior es menor que el inferior. Por favor, introduzca un número mayor que el límite inferior: ");
			sup = teclado.nextDouble();
		}
		
		while (num != 0) {
			System.out.println("Introduce un número: ");
			num = teclado.nextDouble();
			if ((num > inf) && (num < sup)) {
				suma = suma + num;
			}
			if (num == inf) {
				contInf++;
			}
			if (num == sup) {
				contSup++;
			}
			if (((num < inf) || (num > sup)) && (num != 0)) {
				contFuera++;
			}
		}
		if (num == 0) {
			System.out.println("Suma de los números dentro del intervalo = "+suma);
			System.out.println("Número de veces que escribiste el número inferior = "+contInf);
			System.out.println("Número de veces que escribiste el número superior = "+contSup);
			System.out.println("Número de veces que escribiste números fuera del intervalo = "+contFuera);
		}

	}

}
