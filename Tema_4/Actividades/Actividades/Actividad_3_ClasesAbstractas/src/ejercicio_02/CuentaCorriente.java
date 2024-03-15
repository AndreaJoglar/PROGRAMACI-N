
package ejercicio_02;

/**
 * 
 */
public class CuentaCorriente extends Cuenta {
	//interés fijo: 1.5 % No hace falta ponerlo como atributo, porque es un valor fijo
	
	/**
	 * Constructos con parametros
	 * @param numeroCuenta entero
	 * @param cliente Persona
	 */
	public CuentaCorriente(long numeroCuenta, Persona cliente) {
		super(numeroCuenta, cliente);
		
	}

	@Override
	public void retirar(double cantidad) {
		if (cantidad <= saldo) {
			saldo -= cantidad;
		}

	}

	@Override
	public void actualizarSaldo() {
		double interes = saldo * 0.015;
		saldo += interes;

	}

	@Override
	public String toString() {
		return "CuentaCorriente [numeroCuenta=" + numeroCuenta 
								+ ", saldo=" + saldo + "\n" 
								+ "\tcliente=" + cliente + "]";
	}
	
	

}
