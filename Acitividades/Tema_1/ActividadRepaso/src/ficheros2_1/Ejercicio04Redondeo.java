package ficheros2_1;

import java.util.Scanner;

public class Ejercicio04Redondeo {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir cantidad a invertir
		 * pedir interés anual
		 * pedir número de años
		 * mostrar capital obtenido cada año
		 */
		
		System.out.println("Introduce la cantidad que vas a invertir: ");
		double inversion = teclado.nextDouble();
		
		while (inversion <= 0) {
			System.out.println("Por favor, introduce una cantidad válida: ");
			inversion = teclado.nextDouble();
		}
		
		System.out.println("Introduce el interés anual: ");
		double interes = teclado.nextDouble();
				
		while (interes <= 0) {
			System.out.println("Por favor, introduzca un porcentaje de interés mayor que 0: ");
			interes = teclado.nextDouble();
		}
		interes = interes / 100;
		
		System.out.println("Introduce años: ");
		int anios = teclado.nextInt();
		
		while (anios <= 0) {
			System.out.println("Tienes que invertir, como mínimo, durante un año. Vuelva a intentarlo: ");
			anios = teclado.nextInt();
		}
		
		for (int anio = 1; anio <= anios; anio++) {
			inversion = inversion + (inversion * interes);
			System.out.println("Después del año "+anio+" obtendrás "+(((double)Math.round(inversion*100d)/100d))+" euros.");
		}

	}

}