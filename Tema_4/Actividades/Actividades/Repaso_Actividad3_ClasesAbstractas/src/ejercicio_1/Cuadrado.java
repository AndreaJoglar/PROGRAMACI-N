package ejercicio_1;

public class Cuadrado extends Figura {

	protected int lado;
	
	/**
	 * Constructor de la clase cuadrado
	 * @param lado
	 */
	public Cuadrado(int lado) {
		this.lado = lado;
	}

	/**
	 * @return the lado
	 */
	public int getLado() {
		return lado;
	}

	/**
	 * @param lado the lado to set
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		double area = 0;
		area = lado * lado;
		return area;
	}

}
