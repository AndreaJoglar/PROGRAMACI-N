package envios;

/**
 * @autor Andrea Fernández Joglar
 * @version 1.2
 */

public class EnviosEjec {

	public static void main(String[] args) {

		Persona p1 = new Persona ("1111111a", "LUIS");
		Persona p2 = new Persona ("2222222b", "JUAN");
		
		Envios paqueteJuan = new Envios (p1, p2, "urgente");
		
		System.out.println (paqueteJuan.toString());
		System.out.println ("Importe Envío: " + paqueteJuan.calculaImporte(5));
	}

}
