package envios;

/**
 * @author Andrea Fernández Joglar
 * @version 1.2
 */

public class EnviosEjec {

	public static void main(String [] args) {
		/*
		int numero = 25;
		double numero2 = 34.7;
		
		numero = (int) (numero2);
		
		System.out.println(numero);
		*/

		Persona p1 = new Persona ("1111111a", "LUIS");
		Persona p2 = new Persona ("2222222b", "JUAN");
		
		Envios paqueteJuan = new Envios (p1, p2, "urgente");
		
		System.out.println (paqueteJuan.toString());
		System.out.println ("Importe Envío: " + paqueteJuan.calculaImporte(5));
		

	}

}
