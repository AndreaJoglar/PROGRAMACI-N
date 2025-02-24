package Ficheros;

import java.util.Scanner;

public class Actividad_notas {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int notas[][] = {{3,2,7,8,6,4,5,9,5,1},
						  {4,8,7,6,3,4,8,9,2,4},
						  {7,2,6,8,9,10,0,5,4,10},
						  {8,6,4,7,1,10,5,3,4,8}};
		
		Libreria.notaMasAlta(notas);
		System.out.println("Curso del que quieres saber la media: ");
		char curso = teclado.next().charAt(0);
		while (curso!='A' && curso!='B' && curso!='C' && curso!='D') {
			System.out.println("ERROR. Vuelva a introducir el curso: ");
			curso = teclado.next().charAt(0);
		}
		
		Libreria.calcularMediaCurso(curso);
		
		System.out.println("Número de aprobados del curso "+curso+" = "+Libreria.numeroAprobados(curso));
		System.out.println("Número de suspensos del curso "+curso+" = "+Libreria.numeroSuspensos(curso));
		
		Libreria.mostrarEstadistica(notas);
	}

}
