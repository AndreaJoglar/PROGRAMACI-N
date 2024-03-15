package ejercicio;

public class Lavadora extends Electrodomestico {

	protected final int CARGA = 5;
	
	protected int carga;
	
	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		this.precio = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
		this.carga = CARGA;
	}

	/**
	 * Constructor que recibe parametros
	 * @param precio real
	 * @param color TipoColor
	 */
	public Lavadora(double precio, TipoColor color) {
		super(precio, color);
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
		this.carga = CARGA;
	}

	/**
	 * Metodo get del atributo carga
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Metodo set del atributo carga
	 * @param carga the carga to set
	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}

	/**
	 * Metodo get de la constante CARGA
	 * @return the CARGA
	 */
	public int getCARGA() {
		return CARGA;
	}
	
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if (this.carga > 5) {
			precioFinal += 50;
		}
		
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precio=" + precio 
				+ ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
	

}
