package Ficheros;

import java.util.Scanner;

public class Ejercicio18 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Determinar el precio de un billete de tren, conociendo la distancia a recorrer y sabiendo que
		 * si el número de días de estancia es superior a 7 y la distancia superior a 800km 
		 * el billete tiene una reducción del 30%. 
		 * El precio del km es de 2,5€
		 */
		int km, dias;
		
		
		System.out.println("Introduce km: ");
		km = teclado.nextInt();
		System.out.println("Introduce días: ");
		dias = teclado.nextInt();
		
		double precio = km * 2.5;
		
		if ((dias >= 7) && (km >= 800)) {
			System.out.println("¡¡Descuento!!");
			precio = (precio) * (1 - 0.3);
		}
		System.out.println("Precio final: "+precio);

	}

}
