package ejercicio_02;

public abstract class Cuenta {
	
	protected long numeroCuenta;
	protected double saldo;
	protected Persona cliente;
	
	/**
	 * Constructor con parametros
	 * @param numeroCuenta entero
	 * @param cliente Persona
	 */
	public Cuenta(long numeroCuenta, Persona cliente) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = 0.0;
		this.cliente = cliente;
	}

	/**
	 * Metodo get del atributo numero de cuenta
	 * @return the numeroCuenta entero
	 */
	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * Metodo get del atributo saldo
	 * @return the saldo real
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo get del atributo cliente
	 * @return the cliente Persona
	 */
	public Persona getCliente() {
		return cliente;
	}
	
	/**
	 * Permite ingresar una cantidad a la cuenta
	 * @param cantidad real
	 */
	public void ingresar (double cantidad) {
		saldo += cantidad;
	}

	/**
	 * Metodo abstracto para retirar cantidades de la cuenta
	 * @param cantidad real
	 */
	public abstract void retirar (double cantidad);
	
	/**
	 * Metodo abstracto para actualizar el saldo de la cuenta
	 */
	public abstract void actualizarSaldo ();
	

}
