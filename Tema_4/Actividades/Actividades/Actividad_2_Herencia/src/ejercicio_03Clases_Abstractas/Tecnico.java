package ejercicio_03Clases_Abstractas;

public class Tecnico extends Operario {

	/**
	 * Constructor con parametro
	 * @param nombre String
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public void categoria() {
		System.out.println("Categoría: Técnico");		
	}

	public void mostrarDatos () {
		System.out.println("Técnico "+ getNombre());
	}
	
	

}
