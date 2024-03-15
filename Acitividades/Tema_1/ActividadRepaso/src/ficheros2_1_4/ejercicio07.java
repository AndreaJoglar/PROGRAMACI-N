package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio07 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* calculadora
		 * 1) si pulsamos -1 se apaga
		 * 2) pedimos dos variables A y B
		 * pedimos que pulse 1, 2 o 3;
		 * Si pulsamos 1 = Math.sqrt de A+B
		 * Si pulsamos 2 = A/B (si B = 0, no se puede dividir)
		 * Si pulsamos 3 = (A * B)/ 2.5
		 */
		
		//condición de encendido (no pulsamos -1)
		boolean encendido = true;
		double resultado;
		
		while (encendido == true) {
			//pedimos valor de A y B
			System.out.println("Introduce valor de la variable A: ");
			double a = teclado.nextDouble();
			System.out.println("Introduce valor de la variable B: ");
			double b = teclado.nextDouble();
			// Pedimos que elija entre la operación 1, 2 o 3
			System.out.println("Escoje la operación que desee realizar (1, 2 o 3) o pulse -1 para apagar: ");
			int operacion = teclado.nextInt();
			//mientras que no elija entre 1, 2 o 3, mostramos mensaje
			if (operacion == -1) {
				System.out.println("Goodbye!");
				encendido = false;
			}
			else {
				if (operacion == 1) {
					resultado = (double) Math.sqrt(a+b);
					System.out.println("Raíz cuadrada de "+a+" + "+b+" = "+resultado);
				}
				if (operacion == 2) {
					if (b == 0) {
						System.out.println("No puede dividirse entre 0.");
					}
					else {
						resultado = a/b;
						System.out.println(a+"/"+b+" = "+resultado);
					}
				}
				if (operacion == 3) {
					resultado = (a * b)/2.5;
					System.out.println("("+a+" x "+b+")/ 2,5 = "+resultado);
				}
			}
		}
	}
}
