package ejercicio_02;

public class CuentaAhorro extends Cuenta {
	
	protected boolean estaActiva;

	/**
	 * Constructor con parametros
	 * @param saldo float
	 * @param tasaAnual float
	 */
	public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		if (saldo <10000) {
			estaActiva = false;
		}
		else {
			estaActiva = true;
		}
	}
	
	/**
	 * Llamamos al metodo del padre si la cuenta esta activa
	 * @param cantidad real
	 */
	public void consignar (float cantidad) {
		if (estaActiva == true) {
			super.consignar(cantidad); // llamada al metodo del padre
		}
		else {
			System.out.println("La cuenta no está activa.");
		}
	}
	
	/**
	 * Retirar si la cuenta esta activa.
	 * Invoca al metodo heredado
	 */
	public void retirar (float cantidad) {
		if (estaActiva == true) {
			super.retirar(cantidad);
			if (saldo < 10000) {
				estaActiva = false;
			}
		}
		else {
			System.out.println("La cuenta no está activa.");
		}
	}
	
	/**
	 * Extracto mensual si se hacen más de 4 retiros, nos quitan 1000 de la cuenat
	 */
	public void extractoMensual() {
		if (numRetiros > 4) {
			int excesoRetiros = numRetiros - 4;
			setComisionMensual(excesoRetiros * 1000);
		}
		else {
			setComisionMensual(0);
		}
		
		super.extractoMensual(); //la función del padre sumaba el interés mensual y además restaba la comisión que tuviese
		
		if (saldo < 10000) {
			estaActiva = false;
		}
		else {
			estaActiva = true;
		}
	}
	
	/**
	 * Muestra por pantalla el saldo, la comision mensual y el numero de transacciones
	 * (suma de consignaciones y retiros)
	 */
	public void imprimir () {
		System.out.println("Saldo: "+ this.saldo);
		System.out.println("Comisión: "+this.comisionMensual);
		
		int totalTransacciones = this.numConsignaciones + this.numRetiros;
		System.out.println("Número de transacciones: "+totalTransacciones);
	}
	
	
	
	
	
	
}
