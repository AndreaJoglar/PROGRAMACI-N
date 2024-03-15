package ejercicio_03;

import java.util.Scanner;

public class pruebaPassword {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Dimensión: ");
		int dim = teclado.nextInt();
		
		System.out.println("Longitud del password: ");
		int longitud = teclado.nextInt();
		
		
		boolean fuerte [] = new boolean [dim];
		Password v[]= new Password [dim];
		
		for (int i = 0; i < v.length; i++) {
			v[i]=new Password(longitud);
			//fuerte[i]=v[i].esFuerte();
			System.out.println(v[i].getContraseña()+" " +v[i].esFuerte());
		}
	}

}
