package ejercicio_03;

public class Oficial extends Operario {

	/**
	 * Constructor con parametro
	 * @param nombre String
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " --> Oficial";
	}

	
	
}
