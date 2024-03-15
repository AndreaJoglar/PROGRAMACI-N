package Ficheros;

import java.util.Scanner;

public class Ejercicio29_for {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir cantidad de notas
		 * leer N (cantidad de notas)
		 * repetir (contNotas <= N)
		 * leer nota
		 * si la nota es menor que 5,
		 * suspensos++
		 * else aprobados++
		 * contNotas++
		 * fuera del bucle: mostrar contadores
		 */
		
		System.out.println("¿Cuántas notas vas a introducir? ");
		int cantidadNotas = teclado.nextInt();
		
		int numAprobados = 0;
		int numSuspensos = 0;
		
		for (int cont = 1; cont <= cantidadNotas; cont++) {
			System.out.println("Introduce nota ("+cont+"): ");
			double nota = teclado.nextDouble();
			if (nota < 5) {
				numSuspensos++;
			}
			else {
				numAprobados++;
			}
			
		}
		System.out.println("Número de suspensos = "+numSuspensos);
		System.out.println("Número de aprobados = "+numAprobados);
		
		
		

	}

}
