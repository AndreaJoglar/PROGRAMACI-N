package ejercicio_03;

public class Operario extends Empleado {

	/**
	 * Constructor con un parametro
	 * @param nombre String
	 */
	public Operario (String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " --> Operario";
	}
	
	
}
