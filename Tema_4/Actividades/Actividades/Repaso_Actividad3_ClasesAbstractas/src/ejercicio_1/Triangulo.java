package ejercicio_1;

public class Triangulo extends Figura {

	protected int base;
	protected int altura;
	
	/**
	 * Constructor con parametros
	 * @param base
	 * @param altura
	 */
	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		double area = 0;
		area = (this.base * this.altura)/2;
		return area;
	}

}
