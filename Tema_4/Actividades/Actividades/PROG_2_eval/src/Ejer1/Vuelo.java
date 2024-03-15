package Ejer1;

public class Vuelo {
	private String[][] vuelo; // matriz que almacena los valores

	public Vuelo() {
		vuelo = null;
	}

	/**
	 * Genera, utilizando la clase Pasajeros para obtener pasajeros aleatorios,
	 * un nuevo vuelo que incluir  tanto los numeros como el pasillo y 
	 * los 6 pasajeros iniciales.
	 * 
	 * @param longitud
	 *            int numero de filas y columnas
	 * @return String contenido de la matriz formateado en filas y columnas
	 */
	public String generarVuelo(int longitud) {
		// HACER
		// HACER

		return toString();
	}

	public boolean estaLibre(int fila, int columna) {
		//HACER
		return true;
	}

	public void marcar(int fila, int columna, String pasajero) {
		vuelo[fila][columna] = pasajero;
	}

	public boolean esLineaEnFila(int f) {
		// HACER
		// HACER
		return true;
	}

	public boolean estaCompleto() {
		// HACER
		// HACER
		return true;
	}

	public boolean esLineaEnColumna(int c) {
		// HACER
		// HACER
		return true;
	}

	public String leerCasilla(int fila, int columna) {
		return vuelo[fila][columna];
	}

	public String toString() {
		String cadenaVuelo = "";
		int longitud = vuelo.length;
		for (int y = 0; y < longitud; y++) {
			for (int x = 0; x < longitud; x++) {
				cadenaVuelo += vuelo[y][x] + " \t";
			}
			cadenaVuelo += "\n";
		}

		return cadenaVuelo;
	}
}
