package ficheros2_1_4;

public class ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Lanzamiento de dados
		 * generar aleatorio en el lanzamiento de 3 dados.
		 * calificar el lanzamiento en función del número de 6 que salen
		 * 3 seises = Oro; 2 = plata; 1 = bronce; 0 = perdiste
		 */
		int contSeis = 0;
		
		int dado1 = (int)(Math.random()*6 + 1);
		int dado2 = (int)(Math.random()*6 + 1);
		int dado3 = (int)(Math.random()*6 + 1);
		
		System.out.println("Resultado dado 1: "+dado1);
		System.out.println("Resultado dado 2: "+dado2);
		System.out.println("Resultado dado 3: "+dado3);
		
		if (dado1 == 6) contSeis++;
		if (dado2 == 6) contSeis++;
		if (dado3 == 6) contSeis++;
		
		if (contSeis == 3) System.out.println("¡ORO!");
		if (contSeis == 2) System.out.println("¡PLATA!");
		if (contSeis == 1) System.out.println("¡BRONCE!");
		if (contSeis == 0) System.out.println("¡PERDISTE!");
		
		

	}

}
