package ejercicio_2;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(long numeroCuenta, Persona cliente) {
		super(numeroCuenta, cliente);
		
	}

	@Override
	public void retirar(double cantidad) {
		if (cantidad <= this.saldo) {
			this.saldo -= cantidad;
		}
		else {
			System.out.println("ERROR. No se puede sacar la cantidad.");
		}

	}

	@Override
	public void actualizarSaldo() {
		double interes = this.saldo * 0.015;
		this.saldo += interes; 

	}

	@Override
	public String toString() {
		return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo 
				+ "\n\tcliente=" + cliente + "]";
	}
	
	

}
