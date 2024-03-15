package ejercicio_03;

public class Tecnico extends Operario {

	/**
	 * Constructor con parametro
	 * @param nombre String
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " --> Técnico";
	}
	
	

}
