package ejercicio_03Clases_Abstractas;

public class Oficial extends Operario {

	/**
	 * Constructor con parametro
	 * @param nombre String
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public void categoria() {
		System.out.println("Categoría: Oficial");
		
	}


	
	
}
