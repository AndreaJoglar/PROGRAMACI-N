/**
 * 
 */
package ejercicio_01;

/**
 * 
 */
public class Circulo extends Figura {

	private double radio;
	
	/**
	 * 
	 */
	public Circulo(double radio) {
		// TODO Auto-generated constructor stub
		this.radio = radio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * (radio * radio);
	}

}
