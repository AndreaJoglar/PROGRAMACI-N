package Ficheros;

public class ejercicio_mapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int relieve [] = {2,3,4,5,5,3,5,5,4,3,2};
		
		System.out.println("Número de valles: "+Libreria.numeroValle(relieve));
		int resul = Libreria.valorPicoMasAlto(relieve);
		if (resul==Integer.MIN_VALUE) {
			System.out.println("No hay pico.");
		}
		else {
			System.out.println("El pico más alto "+resul);
		}

	}

}
