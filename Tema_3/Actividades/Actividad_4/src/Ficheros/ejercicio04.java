package Ficheros;

import java.util.Scanner;

public class ejercicio04 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v[]=Libreria.generarBaraja();
		Libreria.mostrarBaraja(v);
		
		System.out.println();
		/*System.out.println("Baraja mezclada: ");
		Libreria.mezclarBaraja(v);
		System.out.println();
		*/
		
		
		
		double puntuacion=Libreria.calcularPuntuacion(v);
		double suma=0;
		while(suma<=7) {
			System.out.println("Escoge carta: ");
			int pos=teclado.nextInt();
			char carta=Libreria.elegirCarta(v, pos);
			
			if(carta=='x') {
				System.out.println("Tu carta: "+v[pos]);
				puntuacion=v[pos];
				System.out.println("Puntuación = "+puntuacion);
			}
			else {
				System.out.println("Tu carta: "+carta);
				puntuacion=Libreria.calcularPuntuacion(v);
				System.out.println("Puntuación: "+puntuacion);
			}
			suma+=puntuacion;
			System.out.println(suma);
			
		}
	
		if(suma>7.5)
		System.out.println("Has perdido. Puntuación final: "+suma);
		else System.out.println("Enhorabuena");
	}

}
