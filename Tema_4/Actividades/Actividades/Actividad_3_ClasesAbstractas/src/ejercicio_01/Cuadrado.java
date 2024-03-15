package ejercicio_01;

public class Cuadrado extends Figura {

	private int lado;
	
	/**
	 * Constructor con parametro lado
	 * @param lado entero
	 */
	public Cuadrado (int lado) {
		this.lado = lado;
	}
	
	@Override
	public double area() {
		return lado * lado;

	}

}
