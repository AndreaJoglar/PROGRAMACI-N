package ficheros2_1_3;

import java.util.Scanner;

public class ejercicio05b {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Determinar si una fecha:
		 * día, mes, año
		 * es mágica
		 */
		
		System.out.println("Escribe un año: ");
		int anio = teclado.nextInt();
		System.out.println("Escribe mes:");
		int mes = teclado.nextInt();
		System.out.println("Escribe día: ");
		int dia = teclado.nextInt();
		
		while ((mes < 1) || (mes > 12)) {
			System.out.println("Escribe mes: ");
			mes = teclado.nextInt();
		}
		
		int suma = anio * (int)(Math.pow(10, 4));
		suma = suma + (mes * (int) (Math.pow(10, 2)));
		suma = suma + dia;
		
		System.out.println(suma);
		
		int posAct = 0;
		boolean esMagico = true;
		
		while (suma > 0 && esMagico == true) { //en el momento en el que una cifra no coincida con la posición, se sale del bucle
			int cifra = suma % 10;
			suma = suma / 10;
			posAct++;
			if ((posAct % 2 == 0) && (cifra % 2 != 0)) {
				esMagico = false;
			}
			if ((posAct % 2 != 0) && (cifra % 2 == 0)) {
				esMagico = false;
			}
		}
		if (esMagico == true) {
			System.out.println("¡Número mágico!");
		}
		else {
			System.out.println("No es un número mágico.");
		}
	}
}
