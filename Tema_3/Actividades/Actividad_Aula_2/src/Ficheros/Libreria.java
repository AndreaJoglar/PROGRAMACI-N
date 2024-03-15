package Ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Funcion que muestra el alumno que saca un 10
	 * y su curso
	 * @param notas matriz de enteros
	 */
	public static void notaMasAlta (int notas [][]) {
		int notaMasAlta=Integer.MIN_VALUE;
		int alumno=-1;
		int curso=-1;
		boolean diez = false;
		for (int i=0;i<notas.length;i++) {
			for (int j=0;j<notas[0].length;j++) {
				if (notas[i][j]>=notaMasAlta) {
					notaMasAlta=notas[i][j];
					alumno =j+1;
					curso=i+1;
					if (notaMasAlta==10) {
						char letra = 'z';
						if (i==0) letra='A';
						else if (i==1) letra='B';
						else if (i==2) letra='C';
						else letra='D';
						System.out.println("El alumno "+alumno+" del curso "+letra+" sacó un "+notaMasAlta);
						diez=true;
					}
				}
			}
		}
		if (diez == false) System.out.println("Nadie sacó un 10.");
	}
	
	/**
	 * Funcion que calcula la media del curso
	 * @param letra char
	 */
	public static void calcularMediaCurso (char letra) {
		int notas[][] = {{3,2,7,8,6,4,5,9,5,1},
				  {4,8,7,6,3,4,8,9,2,4},
				  {7,2,6,8,9,10,0,5,4,10},
				  {8,6,4,7,1,10,5,3,4,8}};
		int fila;
		if (letra=='A') fila = 0;
		else if (letra=='B') fila = 1;
		else if (letra=='C') fila =2;
		else fila =3;
		int suma=0;
		for (int j=0;j<notas[0].length;j++) {
			suma+=notas[fila][j];
		}
		double media = (Math.rint(suma)/notas[0].length*100)/100;
		System.out.println("La media del curso "+letra+" = "+media);
	}
	
	/**
	 * Funcion que devuelve el numero de aprobados
	 * de un curso
	 * @param letra char
	 * @return entero
	 */
	public static int numeroAprobados (char letra) {
		int notas[][] = {{3,2,7,8,6,4,5,9,5,1},
				  		{4,8,7,6,3,4,8,9,2,4},
				  		{7,2,6,8,9,10,0,5,4,10},
				  		{8,6,4,7,1,10,5,3,4,8}};
		
		int aprobados = 0;
		int fila;
		if (letra=='A') fila = 0;
		else if (letra=='B') fila = 1;
		else if (letra=='C') fila =2;
		else fila =3;
		for (int j=0;j<notas[0].length;j++) {
			if (notas[fila][j]>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	
	/**
	 * Funcion que devuelve el numero de suspensos de un curso
	 * @param letra char
	 * @return entero
	 */
	public static int numeroSuspensos (char letra) {
		int notas[][] = {{3,2,7,8,6,4,5,9,5,1},
		  		{4,8,7,6,3,4,8,9,2,4},
		  		{7,2,6,8,9,10,0,5,4,10},
		  		{8,6,4,7,1,10,5,3,4,8}};

		int suspensos = 0;
		int fila;
		if (letra=='A') fila = 0;
		else if (letra=='B') fila = 1;
		else if (letra=='C') fila =2;
		else fila =3;
		for (int j=0;j<notas[0].length;j++) {
			if (notas[fila][j]<5) {
				suspensos++;
			}
		}
		return suspensos;
	}
	
	/**
	 * Funcion que muestra el numero de aprobados
	 * y suspensos por cada curso
	 * @param notas matriz de enteros
	 */
	public static void mostrarEstadistica (int notas [][]) {
		
		
		for (int i=0;i<notas.length;i++) {
			int aprobado = 0;
			int suspenso= 0;
			for (int j = 0; j < notas[0].length; j++) {
				if (notas[i][j]<5) {
					suspenso++;
				}
				else {
					if (notas[i][j]>=5) {
						aprobado++;
					}
				}
			}
			char curso = 'z';
			if (i==0) curso='A';
			else if (i==1) curso='B';
			else if (i==2) curso='C';
			else curso='D';
			System.out.println("En el curso "+curso+": Suspensos = "+suspenso+". Aprobados = "+aprobado);
		}
	}

}
