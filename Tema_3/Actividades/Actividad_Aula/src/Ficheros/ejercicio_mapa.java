package Ficheros;


public class ejercicio_mapa {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] relieve = {2,4,3,5,5,5,5,7,9,8,6,5,7,8,8,8,10,9,7,6,4,3,4,4,4,2,0};
		System.out.println("Número valles: "+Libreria.numeroValle(relieve));
		System.out.println("Valor máximo pico: "+Libreria.valorPicoMasAlto(relieve));
		System.out.println("Número de mesetas: "+Libreria.numMeseta(relieve));
		
	}

}
