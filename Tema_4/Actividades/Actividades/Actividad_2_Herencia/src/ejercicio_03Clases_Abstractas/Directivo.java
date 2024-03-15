package ejercicio_03Clases_Abstractas;

public class Directivo extends Empleado {

	/**
	 * Constructor con parametro
	 * @param nombre String
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public void categoria() {
		System.out.println("Categoría: Directivo");
		
	}

	public void mostrarDatos () {
		System.out.println("Directivo "+ getNombre());
	}
}
