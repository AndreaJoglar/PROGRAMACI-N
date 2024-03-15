package Ficheros;

import java.util.Scanner;

public class ejercicio06 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]m= {{4,7,8},
					{2,9,1},
					{5,3,6}};
		
		Libreria.mayorMenorMedia(m);
		Libreria.peorNota(m);
		Libreria.mejorNotaTres(m);
		System.out.println("La media de la asignatura 1 es "+Libreria.mediaUno(m));
	}

}
