package ejercicio;

public class Television extends Electrodomestico {

	protected final int PULGADAS = 43;
	
	protected int pulgadas;
	
	/**
	 * Constructor por defecto
	 */
	public Television() {
		this.precio = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
		this.pulgadas = PULGADAS;
	}

	/**
	 * Constructor que recibe parametros
	 * @param precio real
	 * @param peso real
	 */
	public Television(double precio, double peso) {
		super();
		this.precio=precio;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso=peso;
		this.pulgadas = PULGADAS;
	}

	/**
	 * Metodo get del atributo pulgadas
	 * @return the pulgadas
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * Metodo set del atributo pulgadas
	 * @param pulgadas the pulgadas to set
	 */
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	/**
	 * Metodo get de la constante PULGADAS
	 * @return the pULGADAS
	 */
	public int getPULGADAS() {
		return PULGADAS;
	}
	
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if (pulgadas > 50) {
			precioFinal += 100;
		}
		
		return precioFinal;
	}

}
