package Ficheros;

public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Reutiliza el ejercicio anterior: Genera una apuesta al azar
		 *  y unos resultados también al azar; 
		 *  después indica cuántos aciertos se han producido.
		 */
		
		System.out.println("Pos \tApu \tResul"); // \t para tabulación
		int acierto = 0;
		
		for (int veces = 1; veces <= 15; veces++) {
			
			int valorApuesta = (int)(Math.random()*3);
			int resultado = (int)(Math.random()*3);
			System.out.print(" "+veces+"\t ");
			if (valorApuesta== 0) {
				System.out.print("X");
			}
			else {
				System.out.print(valorApuesta);
			}
			System.out.print("\t  ");
			if (resultado== 0) {
				System.out.print("X");
			}
			else {
				System.out.print(resultado);
			}
			System.out.println();
			if (valorApuesta == resultado) {
				acierto++;
			}
		}
		System.out.println("Se han producido "+acierto+" aciertos.");
		
	
	}

}
