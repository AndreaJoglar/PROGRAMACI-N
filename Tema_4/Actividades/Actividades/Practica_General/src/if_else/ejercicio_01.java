package if_else;

import java.util.Scanner;

public class ejercicio_01 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Calcular IMC: peso /altura * altura
		
		System.out.println("Introduce peso (kg): ");
		double peso = teclado.nextDouble();
		System.out.println("Introduce altura (m): ");
		double altura = teclado.nextDouble();
		
		double imc = peso / (Math.pow(altura, 2));
		System.out.println("Su IMC es "+ Math.rint(imc*100)/100);
		
		if (imc <18.5) System.out.println("Estás por debajo de tu peso ideal.");
		else {
			if (imc >=18.5 && imc <=25) System.out.println("Estás en tu peso ideal.");
			else {
				System.out.println("Tienes sobrepeso.");
			}
		}

	}

}
