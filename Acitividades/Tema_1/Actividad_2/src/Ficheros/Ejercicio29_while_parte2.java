package Ficheros;

import java.util.Scanner;

public class Ejercicio29_while_parte2 {
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
		boolean condicion = true;
		
		while (condicion == true) {
			System.out.println("Introduce una nota: ");
			double nota = teclado.nextDouble();
			if (nota >= 5) {
				numAprobados++;
			}
			else { //nota < 5
				if (nota >= 0) {
					numSuspensos++;
				}
				else {//nota < 0
					condicion = false;
				}
			}
			
		}
		System.out.println("Número de suspensos = "+numSuspensos);
		System.out.println("Número de aprobados = "+numAprobados);
		
		
		

	}

}
