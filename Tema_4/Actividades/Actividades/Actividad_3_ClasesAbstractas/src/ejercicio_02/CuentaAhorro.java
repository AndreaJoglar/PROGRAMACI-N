package ejercicio_02;

public class CuentaAhorro extends Cuenta {

	private double interesVariable; //interes 2.5% --> interes = 2.5
	private double saldoMinimo;
	
	/**
	 * Constructor con parametros
	 * @param numeroCuenta entero
	 * @param cliente Persona
	 * @param interesVariable real
	 * @param saldoMinimo real
	 */
	public CuentaAhorro (long numeroCuenta, Persona cliente, 
						 double interesVariable, double saldoMinimo) {
		super(numeroCuenta, cliente);
		this.interesVariable = interesVariable;
		this.saldoMinimo = saldoMinimo;
	}

	@Override
	public void retirar(double cantidad) {
		if (cantidad <= saldo) {
			double cantidadQueMeQueda = saldo - cantidad;
			if (cantidadQueMeQueda > saldoMinimo) {
				saldo = saldo - cantidad;
			}else {
				System.out.println("ERROR. No respeta el saldo mínimo");
			}
		}else {
			System.out.println("No hay cantidad suficiente");
		}
		
	}

	@Override
	public void actualizarSaldo() {
		double cantidad = saldo * (interesVariable / 100);
		saldo += cantidad;
		
	}

	@Override
	public String toString() {
		return "CuentaAhorro [interesVariable=" + interesVariable + ", saldoMinimo=" + saldoMinimo 
				+ ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo 
				+ "\n\tcliente=" + cliente.toString();
	}
	

}
