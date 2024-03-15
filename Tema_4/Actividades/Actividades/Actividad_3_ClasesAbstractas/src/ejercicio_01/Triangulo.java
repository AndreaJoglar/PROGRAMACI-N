/**
 * 
 */
package ejercicio_01;

/**
 * 
 */
public class Triangulo extends Figura {

	private int base;
	private int altura;
	
	/**
	 * 
	 */
	public Triangulo(int base, int altura) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base * altura)/2.0;
	}

}
