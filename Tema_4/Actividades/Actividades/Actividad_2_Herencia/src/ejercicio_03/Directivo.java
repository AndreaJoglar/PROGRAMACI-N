package ejercicio_03;

public class Directivo extends Empleado {

	/**
	 * Constructor con parametro
	 * @param nombre String
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " --> Directivo";
	}
	
	
	
	
	

}
