package ejercicio_02;

public class Cuenta {

	protected float saldo;
	protected int numConsignaciones;
	protected int numRetiros;
	protected float tasaAnual;
	protected float comisionMensual;
	
	/**
	 * Constructor 
	 * @param saldo real
	 * @param tasaAnual real
	 */
	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
		numConsignaciones = 0;
		numRetiros = 0;
		comisionMensual = 0;
	}
	
	/**
	 * Metodo get del atributo saldo
	 * @return the saldo real
	 */
	public float getSaldo() {
		return saldo;
	}

	/**
	 * Metodo get de numero de consignaciones
	 * @return the numConsignaciones entero
	 */
	public int getNumConsignaciones() {
		return numConsignaciones;
	}

	/**
	 * Metodo get del numero de retiros
	 * @return the numRetiros entero
	 */
	public int getNumRetiros() {
		return numRetiros;
	}

	/**
	 * Metodo get del atributo tasa anual
	 * @return the tasaAnual real
	 */
	public float getTasaAnual() {
		return tasaAnual;
	}

	/**
	 * Metodo get del atributo comision mensual
	 * @return the comisionMensual real
	 */
	public float getComisionMensual() {
		return comisionMensual;
	}

	/**
	 * Metodo set del atributo tasa anual
	 * @param tasaAnual the tasaAnual to set
	 */
	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	/**
	 * @param comisionMensual the comisionMensual to set
	 */
	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numConsignaciones=" + numConsignaciones + ", numRetiros=" + numRetiros
				+ ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}

	/**
	 * Asigna un nuevo saldo
	 * @param cantidad real
	 */
	public void consignar (float cantidad) {
		this.saldo += cantidad;
		this.numConsignaciones++;
	}
	
	/**
	 * Retira cantidad de la cuenta
	 * @param cantidad real
	 */
	public void retirar (float cantidad) {
		if (cantidad <= saldo) {
			saldo -=cantidad;
			this.numRetiros++;
		}
	}
	
	/**
	 * Calcula el interes mensual
	 * Tasa anual es 12% => tasaAnual 12
	 */
	public void calcularInteres () {
		float cantidad = saldo * this.tasaAnual/100;
		saldo = saldo + (cantidad/12);
		System.out.println("Tasa mensual = "+cantidad/12);
	}
	
	/**
	 * Resta la comision de mantenimiento al interes mensual generado
	 */
	public void extractoMensual () {
		calcularInteres(); //actualizamos saldo incrementando el interés
		saldo = saldo - comisionMensual;
		
	}
	
	
	
	
	
}
