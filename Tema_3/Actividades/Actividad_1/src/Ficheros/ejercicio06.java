package Ficheros;

import java.util.Scanner;

public class ejercicio06 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float v [] = {1,2,3,4,5};
		System.out.println("Introduce un valor que quieras buscar en el vector: ");
		float valor = teclado.nextFloat();
		busqueda(v, valor);
		if (busqueda(v, valor)!=-1) {
			System.out.println("El valor "+valor+" está en la posición ["+busqueda(v, valor)+"]");
		}
		if (busqueda(v, valor)==-1) {
			System.out.println("El valor "+valor+" no aparece en el vector.");
		}
		
	}
	
	public static int busqueda (float v[], float value) {
		for (int i=0;i<v.length;i++) {
			if (value==v[i]) {
				return i;
			}
		}
		return -1;
	}

}
