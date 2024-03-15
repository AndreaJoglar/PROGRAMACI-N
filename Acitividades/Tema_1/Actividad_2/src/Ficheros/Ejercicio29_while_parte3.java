package Ficheros;

import java.util.Scanner;

public class Ejercicio29_while_parte3 {
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
		 * Tiene que parar cuando metamos un valor negativo
		 * la condicion = true es que la nota sea mayor de 0
		 */
	
		int numAprobados = 0;
		int numSuspensos = 0;
		int numSuficiente = 0;
		int numBien = 0;
		int numNotable = 0;
		int numSobresaliente = 0;
		boolean condicion = true;
		
		while (condicion == true) {
			System.out.println("Introduce una nota: ");
			double nota = teclado.nextDouble();
			if (nota < 0) {
				condicion = false;
			}
			if (nota >= 0 && nota <5) {
				numSuspensos++;
			}
			if (nota >= 5 && nota <6) {
				numAprobados++;
			}
			if (nota >= 6 && nota <7) {
				numNotable++;
			}
			if (nota >= 7 && nota <9) {
				numAprobados++;
			}
			if (nota >= 9 && nota >= 10) {
				numSobresaliente++;
			}
			
		}
		System.out.println("El número de aprobados es "+numAprobados);
		System.out.println("El número de suspensos es "+numSuspensos);
		System.out.println("El número de suficientes es "+numSuficiente);
		System.out.println("El número de bienes es "+numBien);
		System.out.println("El número de notables es "+numNotable);
		System.out.println("El número de sobresalientes es "+numSobresaliente);
		
		
		
		

	}

}
