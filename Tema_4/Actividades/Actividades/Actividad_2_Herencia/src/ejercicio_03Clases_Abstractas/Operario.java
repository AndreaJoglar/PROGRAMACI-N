package ejercicio_03Clases_Abstractas;

public abstract class Operario extends Empleado {

	//Como no implementa el método categoría de Empleado, tiene que ser abstracto
	/**
	 * Constructor con un parametro
	 * @param nombre String
	 */
	public Operario (String nombre) {
		super(nombre);
	}
	
	
}
