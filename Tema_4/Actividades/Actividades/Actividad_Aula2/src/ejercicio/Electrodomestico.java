package ejercicio;

public class Electrodomestico {

	protected final double PRECIO_BASE = 200;
	protected final TipoColor COLOR = TipoColor.BLANCO;
	protected final char CONSUMO_ENERGETICO = 'F';
	protected final double PESO = 8;
	
	protected double precio;
	protected TipoColor color;
	protected char consumoEnergetico;
	protected double peso;
	
	/**
	 * Constructor por defecto de la clase Electrodomestico
	 */
	public Electrodomestico() {
		this.precio = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
	}

	/**
	 * Constructor con parametros clase electrodomestico
	 * @param precio real
	 * @param color TipoColor
	 */
	public Electrodomestico(double precio, TipoColor color) {
		this.precio = precio;
		this.color = color;
		if (comprobarConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		}
		else {
			this.consumoEnergetico = CONSUMO_ENERGETICO;
		}
		this.peso = PESO;
	}

	/**
	 * Metodo get de la constante precio base
	 * @return the pRECIO_BASE
	 */
	public double getPRECIO_BASE() {
		return PRECIO_BASE;
	}

	/**
	 * Metodo get de la constante color 
	 * @return the cOLOR
	 */
	public TipoColor getCOLOR() {
		return COLOR;
	}

	/**
	 * Metodo get de la constante consumo energetico
	 * @return the cONSUMO_ENERGETICO
	 */
	public char getCONSUMO_ENERGETICO() {
		return CONSUMO_ENERGETICO;
	}

	/**
	 * Metodo get de constante peso
	 * @return the pESO
	 */
	public double getPESO() {
		return PESO;
	}

	/**
	 * Metodo get del atributo precio
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Metodo get del atributo color
	 * @return the color
	 */
	public TipoColor getColor() {
		return color;
	}

	/**
	 * Metodo get del atributo consumo energetico
	 * @return the consumoEnergetico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * Metodo get del atributo peso
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	
	/**
	 * Metodo set del atributo precio
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Metodo set del atributo color
	 * @param color the color to set
	 */
	public void setColor(TipoColor color) {
		this.color = color;
	}

	/**
	 * Metodo set del atributo consumo energetico
	 * @param consumoEnergetico the consumoEnergetico to set
	 */
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	/**
	 * Metodo set del atributo peso
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Metodo que comprueba si la letra es correcta
	 * @param letra char
	 * @return boolean
	 */
	public boolean comprobarConsumoEnergetico (char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' 
			|| letra == 'D' || letra == 'E' || letra == 'F') {
			return true;
		}
		return false;
	}
	
	/**
	 * Metodo que determina precio final
	 * @return real
	 */
	public double precioFinal() {
		double precioFinal = this.precio;
		
		if (this.consumoEnergetico == 'A') {
			precioFinal += 110;
		}
		else if (this.consumoEnergetico == 'B') {
			precioFinal += 90;
		}
		else if (this.consumoEnergetico == 'C') {
			precioFinal += 70;
		}
		else if (this.consumoEnergetico == 'D') {
			precioFinal += 50;
		}
		else if (this.consumoEnergetico == 'E') {
			precioFinal += 40;
		}
		else {
			precioFinal += 40;
		}
		
		if (this.peso >= 0 && this.peso <= 29) {
			precioFinal += 10;
		}
		else if (this.peso >= 30 && this.peso <= 69) {
			precioFinal += 50;
		}
		else if (this.peso >= 70 && this.peso <= 79) {
			precioFinal += 80;
		}
		else {
			precioFinal += 100;
		}
		
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Electrodomestico [PRECIO_BASE=" + PRECIO_BASE + ", COLOR=" + COLOR 
				+ ", CONSUMO_ENERGETICO="
				+ CONSUMO_ENERGETICO + ", PESO=" + PESO + ", precio=" + precio + ", color=" + color
				+ ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
	
	
}
