package Ficheros;

public class Ejercicio33for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Genera una combinación al azar para la lotería primitiva.
		 * Los números de la lotería son 6, comprendidos del 1 al 49.
		 * En esta versión no importa si se repite algún número.
		 * Para generar números aleatorios:
		 * función Math.random: genera num aleatorios entre 0.0 y 1.0 (semilla).
		 * el resultado de Math.random se multiplica por la cantidad de valores a generar.
		 * Por ejemplo, del 1 al 49 hay 49 números.
		 * Pero si multiplicamos Math.random * 49 va a empezar en 0. Para solucionarlo:
		 * (Math.random * 49) + 1 (hay que sumar el inicio para que no empiece en 0 a contar.
		 */
		// generamos un valor para la función (Math.random * 49)+1
		
		
		for (int veces = 1; veces <= 6; veces++) {
			int num = (int)(Math.random()*49 + 1); //importantes los paréntesis
			System.out.println("Posición ("+veces+") = "+num);
		}

	}

}
