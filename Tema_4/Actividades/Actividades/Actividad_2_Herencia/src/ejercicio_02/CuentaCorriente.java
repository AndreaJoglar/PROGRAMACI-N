package ejercicio_02;

public class CuentaCorriente extends Cuenta {
	
	protected float sobregiro;

	/**
	 * Constructor con los parametros
	 * @param saldo
	 * @param tasaAnual
	 */
	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		this.sobregiro = 0;
	}

	/**
	 * Metodo get del atributo sobregiro
	 * @return the sobregiro
	 */
	public float getSobregiro() {
		return sobregiro;
	}

	/**
	 * Metodo set del atributo sobregiro
	 * @param sobregiro the sobregiro to set
	 */
	public void setSobregiro(float sobregiro) {
		this.sobregiro = sobregiro;
	}
	
	
	@Override //notación para evitar errores y saber que estamos sobrecargando. No hace falta comentar
	public void retirar (float cantidad) {
		if (cantidad < saldo) {
			super.retirar(cantidad);
		}
		else {
			sobregiro = cantidad - saldo;
			saldo = 0;
			numRetiros++;
		}
		
	}
	
	@Override
	public void consignar (float cantidad) {
		if (sobregiro > 0) { //sacamos más dinero de lo que teníamos
			//el saldo sería 0
			if (sobregiro <= cantidad) {
				saldo = cantidad - sobregiro;
				sobregiro = 0;
			}
			else {
				sobregiro = sobregiro - cantidad;
				//saldo sigue siendo 0
			}		
			numConsignaciones++;
		}
		else {
			super.consignar(cantidad);
		}
	}
	
	
	
	/**
	 * Imprime los datos de la cuenta corriente
	 */
	public void imprimir() {
		
		System.out.println("Saldo: "+ this.saldo);
		System.out.println("Comisión: "+this.comisionMensual);
		
		int totalTransacciones = this.numConsignaciones + this.numRetiros;
		System.out.println("Número de transacciones: "+totalTransacciones);
		System.out.println("Valor del sobregiro: "+this.sobregiro);
	}
	
	

}
