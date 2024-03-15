package Ejer3Junit;

public class Profesor extends Persona {

	private String despacho;
	
	/**
	 * @param nif
	 * @param nombre
	 * @param apellidos
	 * @param dir
	 * @param despacho
	 */
	public Profesor(String nif, String nombre, String apellidos, Direccion dir, String despacho) {
		super(nif, nombre, apellidos, dir);
		this.despacho = despacho;
		}


	@Override
	public void identificate() {
		System.out.println("Profesor : "+despacho);
		System.out.println(this.toString());
		contVeces++;
	}


}
