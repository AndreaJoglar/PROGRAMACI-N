package ficheros2_1;

import java.util.Scanner;

public class Ejercicio04 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir un programa que pregunte al usuario una cantidad a invertir,
		 * el interés anual y el número de años,
		 * y muestre por pantalla el capital obtenido en la inversión cada año que dura la inversión.
		 */
		System.out.println("Introduce la cantidad que vayas a invertir: ");
		double inversion = teclado.nextInt();
		
		
		System.out.println("Introduce el porcentaje de interés anual: ");
		double interes = teclado.nextInt();
		interes = interes / 100;
		
		
		System.out.println("Introduce el número de años: ");
		int anios = teclado.nextInt();
		
	    inversion = (inversion * interes) + inversion;
	    		
		for (int contAnio = 1; contAnio <= anios; contAnio++) {
			System.out.println("El capital obtenido en el año "+contAnio+" es de "+inversion);
			inversion = inversion + (inversion * interes);
		}
		
	}

}
