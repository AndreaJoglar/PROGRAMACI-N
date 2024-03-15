package ejercicio_2;

public class CuentaAhorro extends Cuenta {

	protected double interesVariable;
	protected double saldoMinimo;
	
	/**
	 * Constructor con parametros
	 * @param numeroCuenta entero
	 * @param cliente Persona
	 * @param interesVariable real
	 * @param saldoMinimo real
	 */
	public CuentaAhorro(long numeroCuenta, Persona cliente, double interesVariable,
																double saldoMinimo) {
		super(numeroCuenta, cliente);
		this.interesVariable = interesVariable;
		this.saldoMinimo = saldoMinimo;
	}

	/**
	 * @return the interesVariable
	 */
	public double getInteresVariable() {
		return interesVariable;
	}

	/**
	 * @param interesVariable the interesVariable to set
	 */
	public void setInteresVariable(double interesVariable) {
		this.interesVariable = interesVariable;
	}

	/**
	 * @return the saldoMinimo
	 */
	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	/**
	 * @param saldoMinimo the saldoMinimo to set
	 */
	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	/**
	 * Metodo para cambiar el interes
	 * @param interes
	 */
	public void interes (double interes) {
		this.interesVariable = interes;
	}

	@Override
	public void retirar(double cantidad) {
		if (cantidad <= this.saldo) {
			double saldoRestante = this.saldo - cantidad;
			if (saldoRestante < this.saldoMinimo) {
				System.out.println("ERROR. No se respeta el saldo mínimo.");
			}
			else {
				this.saldo -= cantidad;
			}
		}
		else {
			System.out.println("ERROR. No se puede retirar más cantidad de la disponible en cuenta");
		}

	}

	@Override
	public void actualizarSaldo() {
		double interes = saldo * (this.interesVariable/100);
		this.saldo += interes;
	}

	@Override
	public String toString() {
		return "CuentaAhorro [interesVariable=" + interesVariable 
				+ ", saldoMinimo=" + saldoMinimo + ", numeroCuenta="
				+ numeroCuenta + ", saldo=" + saldo + "\n\tcliente=" + cliente + "]";
	}

	
	
}
