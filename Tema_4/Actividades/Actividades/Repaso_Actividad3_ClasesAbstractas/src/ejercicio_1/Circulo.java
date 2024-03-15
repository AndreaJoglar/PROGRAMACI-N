package ejercicio_1;

public class Circulo extends Figura {

	public double radio;
	
	/**
	 * Constructor con parametros
	 * @param radio
	 */
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		double area = 0;
		area = Math.PI * (radio * radio);
		return area;
	}

}
