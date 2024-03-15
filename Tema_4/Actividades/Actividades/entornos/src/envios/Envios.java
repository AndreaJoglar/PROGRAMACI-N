package envios;

/**
 * @author Andrea Fernandez Joglar
 * @version 1.2
 */

public class Envios {
	
	private Persona destinatario;
	private Persona remitente;
	private String tipoEnvio;

	/**
	 * Constructor de la clase Envios con todos los parametros
	 * @param d Persona
	 * @param r Persona
	 * @param t String
	 */
	public Envios(Persona d, Persona r, String t) {
		this.destinatario = d;
		this.remitente = r;
		this.tipoEnvio = t;
	}

	/**
	 * Metodo que calcula el importe de un envio
	 * @param peso real
	 * @return real
	 */
	public double calculaImporte (double peso) {
		
		double total = 0;
		
		switch (this.tipoEnvio) {
		case "normal":
			total = 3 * peso;
			break;
		case "especial":
			total = 5 * peso;
			break;
		case "urgente":
			total = 10 * peso;
			break;
		default: 
			System.out.println("Error en la opción.");
		}
		return total;
	}

	@Override
	public String toString() {
		return "DATOS DESTINATARIO\n" + destinatario.toString() 
				+ "DATOS REMITENTE\n" + remitente.toString() 
				+ "TIPO ENVIO: " + this.tipoEnvio;
	}

}
