package ejercicio_03b;

public class Directivo extends Empleado {

	/**
	 * Constructor con parametro
	 * @param nombre String
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	public String datos() {
		return super.datos() + " --> Directivo";
	}
	
	
	
	
	

}
