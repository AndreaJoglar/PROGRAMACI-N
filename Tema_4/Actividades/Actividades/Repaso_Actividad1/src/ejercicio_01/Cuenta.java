package ejercicio_01;

public class Cuenta {

	private String titular;
	private double cantidad;
	
	/**
	 * Constructor con todos los parametros
	 * @param titular String
	 * @param cantidad real
	 */
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	/**
	 * Constructor con un parametro titular
	 * @param titular String
	 */
	public Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0;
	}

	/**
	 * Metodo get del atributo titular
	 * @return titular String
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * Metodo set del atributo titular
	 * @param titular String
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * Metodo get del atributo cantidad
	 * @return cantidad real
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * Metodo set del atributo cantidad
	 * @param cantidad real
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]\n";
	}
	
	/**
	 * Ingresa una cantidad positiva en la cuenta
	 * @param cantidad real
	 */
	public void ingresar (double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
	}
	
	/**
	 * Retira una cantidad de la cuenta. Si la cuenta queda en negativo,
	 * queda a cero.
	 * @param cantidad real
	 */
	public void retirar (double cantidad) {
		this.cantidad = this.cantidad - cantidad;
		if (this.cantidad < 0) {
			this.cantidad = 0;
		}
	}
	
	
	
}
