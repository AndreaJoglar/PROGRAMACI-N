package envios;

/**
 * @autor Andrea Fernández Joglar
 * @version 1.2
 */

public class Envios {
	private Persona destinatario;
	private Persona remitente;
	private String tipoEnvio;

	/**
	 * Constructor con todos los parametros
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
	 * Metodo get del atributo destinatario
	 * @return destinatario Persona
	 */
	public Persona getDestinatario() {
		return destinatario;
	}

	/**
	 * Metodo set del atributo destinatario
	 * @param destinatario Persona
	 */
	public void setDestinatario(Persona destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * Metodo get del atributo remitente
	 * @return remitente Persona
	 */
	public Persona getRemitente() {
		return remitente;
	}

	/**
	 * Metodo set del atributo remitente
	 * @param remitente Persona
	 */
	public void setRemitente(Persona remitente) {
		this.remitente = remitente;
	}

	/**
	 * Metodo get del atributo tipoEnvio
	 * @return tipoEnvio String
	 */
	public String getTipoEnvio() {
		return tipoEnvio;
	}

	/**
	 * Metodo set del atributo tipoEnvio
	 * @param tipoEnvio String
	 */
	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	/**
	 * Metodo para calcular el importe de un envio
	 * @param peso real
	 * @return real
	 */
	public double calculaImporte(double peso) {
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
			System.out.println("Error en la opción");
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
