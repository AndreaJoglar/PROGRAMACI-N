package Ficheros;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int num = 1; num <= 100; num++) {
			if (Libreria.esPrimo(num)==true) {
				System.out.println(num+" es primo.");
			}
		}

	}

}
