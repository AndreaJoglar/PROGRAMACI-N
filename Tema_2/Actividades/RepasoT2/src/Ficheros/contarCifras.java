package Ficheros;

import java.util.Scanner;

public class contarCifras {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Número: ");
		int num = teclado.nextInt();
		
		int cifras = Libreria.contarCifra(num);
		System.out.println("Número de cifras = "+cifras);
		 
		System.out.println("Cifra de la que quieres conocer su posicion: ");
		int cifraPos = teclado.nextInt();
		
		System.out.println("El número está en la posición "+Libreria.posicionNum(num, cifraPos)+
														" empezando por la ultima cifra");
		System.out.println("El número está en la posición "+Libreria.posicionNumInv(num, cifraPos)+
														" empezando por la primera cifra");
		System.out.println("Numero invertido = "+Libreria.numeroInv(num));
		
		
	}

}