package Ficheros;

public class ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tablero [][]=Libreria.generarTablero();
		Libreria.mostrarMatriz(tablero);
		
		System.out.println("Matriz: ");
		Libreria.colocarBarcoFila(tablero, 1, 2, 3);
		Libreria.mostrarMatriz(tablero);
		
		System.out.println("Matriz: ");
		Libreria.colocarBarcoFila(tablero, 2, 1, 2);
		Libreria.mostrarMatriz(tablero);
		
		System.out.println("Matriz: ");
		Libreria.colocarBarcoFila(tablero, 0, 0, 4);
		Libreria.mostrarMatriz(tablero);
		
		System.out.println("Matriz: ");
		Libreria.colocarBarcoColumna(tablero, 3, 2, 3);
		Libreria.mostrarMatriz(tablero);
	}

}
