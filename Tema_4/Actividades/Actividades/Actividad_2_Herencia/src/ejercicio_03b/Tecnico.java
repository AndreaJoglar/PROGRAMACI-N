package ejercicio_03b;

public class Tecnico extends Operario {

	/**
	 * Constructor con parametro
	 * @param nombre String
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	public String datos() {
		return super.datos() + " --> Técnico";
	}
	
	

}
