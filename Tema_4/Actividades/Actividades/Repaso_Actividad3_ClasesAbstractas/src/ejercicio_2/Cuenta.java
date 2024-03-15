package ejercicio_2;

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
		this.saldo = 0;
		this.cliente = cliente;
	}

	/**
	 * @return the numeroCuenta
	 */
	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @return the cliente
	 */
	public Persona getCliente() {
		return cliente;
	}
	
	/**
	 * Metodo que permite ingresar una cantidad en la cuenta
	 * @param cantidad real
	 */
	public void ingresar(double cantidad) {
		this.saldo += cantidad;
	}
	
	/**
	 * Metodo abstracto para retirar cantidades de la cuenta
	 * @param cantidad real
	 */
	public abstract void retirar(double cantidad);
	
	/**
	 * Metodo abstracto para actualizar el saldo
	 */
	public abstract void actualizarSaldo();

}
