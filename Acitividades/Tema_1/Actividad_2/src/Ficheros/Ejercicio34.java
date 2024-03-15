package Ficheros;

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Genera combinaciones al azar para una quiniela de futbol. 
		 * Recordemos que son 15 resultados : 1, X y 2.
		 */
		
		for (int veces = 1; veces <= 15; veces++) {
			int num = (int)(Math.random()*3);
			if (num == 0) {
				System.out.println("Posición ("+veces+") = x");
			}
			else {
				System.out.println("Posición ("+veces+") = "+num);
			}
			
		}

	}

}
