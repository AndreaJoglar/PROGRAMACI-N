package Ficheros;

import java.util.Scanner;

public class ejercicio08 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v []= new int [200];
		
		for (int i = 0; i<v.length;i++) {
			v [i]=(int) (Math.random()*11);
			System.out.println("["+i+"] "+v[i]);
		}
		
		System.out.println("Valores repetidos: ");
		boolean repite = false;
		int suma = 0;
		for (int i=0;i<v.length;i++) {
			int cont = 0;
			for (int j = 0; j<v.length;j++) {
				if (i!=j && v[i]==v[j]) {
					cont++;
					repite=true;
				}
			}
			if (cont>=1) {
				System.out.println("["+i+"] "+v[i]+", número de veces que aparece: "+cont);
				suma = suma + cont;
				System.out.println("Suma = "+suma);
			}
			
		}
		int media = suma/v.length;
		System.out.println("Media de conteo = "+media);
		
		if (repite == false) {
			System.out.println("No se repite.");
		}
		

	}

}
