package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio08 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* videojuego con dos personajes: A y B
		 * Math.random quién empieza A o B
		 * Ataque por turnos
		 * Si A ataca, resta lo que pierda de ataque a la defensa de B
		 * Cambio de turno. Ataca B
		 * Alternancia hasta que alguno pierda.
		 * Valor aleatorio inicial stamina entre 1 - 100.
		 * ataque: dos valores aleatorios entre 1 - 50. Siempre el mismo durante el combate
		 * 
		 */
		System.out.println("Veamos quién empieza atacando...");
		int turno = (int)(Math.random()*2+1);
		
		if (turno == 1) {
			System.out.println("Empieza atacando el jugador A.");
		}
		else {
			System.out.println("Empieza atacando el jugador B.");
		}
		
		int staminaA = (int)(Math.random()*100+1);
		int staminaB = (int)(Math.random()*100+1);
		System.out.println("\nVeamos con cuánta energía empieza cada jugador...");
		System.out.println("A empieza con "+staminaA+" puntos de energía y B con "+staminaB+" puntos de energía.");
		System.out.println("pulse cualquier tecla para continuar");
		teclado.next();
		
		final int ataqueA = (int)(Math.random()*50+1);
		final int ataqueB = (int)(Math.random()*50+1);
		System.out.println("\nAhora comprobemos vuestros puntos de ataque...");
		System.out.println("A empieza con "+ataqueA+" puntos de ataque y B con "+ataqueB+" puntos de ataque.");
		
		int contA = 0;
		int contB = 0;
		boolean energia = true;
		
		while (energia == true) {
			if (turno == 1) {
				contA++;
				staminaA = staminaA - ataqueA;
				staminaB = staminaB - ataqueA;
				System.out.println("\nAtaque ("+contA+") de A: A perdió "+ataqueA+" puntos de energía. Te quedan: "+staminaA);
				System.out.println("B, perdiste "+ataqueA+" puntos de energía. Te quedan: "+staminaB);
				if ((staminaA < 1) || (staminaB < 1)) {
					energia = false;
				}
				else{
					turno = 2;
				}
				}
			if (turno == 2) {
				contB++;
				staminaB = staminaB - ataqueB;
				staminaA = staminaA - ataqueB;
				System.out.println("\nAtaque ("+contB+") de B: B perdió "+ataqueB+" puntos de energía. Te quedan: "+staminaB);
				System.out.println("A perdiste "+ataqueB+" puntos de energía. Te quedan "+staminaA);
				if ((staminaA < 1) || (staminaB < 1)) {
					energia = false;
				}
				else{
					turno = 1;
				}
			}
			
		}
			
		
		System.out.println("\nGAME OVER");
		
		if ((staminaA < 1) && (staminaB > 0)) {
			System.out.println("\n¡Enhorabuena B! Ganaste el combate.");
		}
		else {
			if ((staminaA > 0) && (staminaB < 1)) {
				System.out.println("\n¡Enhorabuena A! Ganaste el combate.");
			}
			else {
				System.out.println("¡EMPATE! Sois igual de malos...");
			}

		}
		
	}

}
