package Ficheros;

import java.util.Scanner;

public class Actividad_Aula4 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = Libreria.menu();
		if (opcion == 1) Libreria.areaTriangulo();
		else if (opcion == 2) Libreria.areaTrapecio();
		else if (opcion == 3) Libreria.areaRectangulo();
		else if (opcion == 4) Libreria.areaCuadrado();
	}
}
