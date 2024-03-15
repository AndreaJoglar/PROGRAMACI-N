package ejercicio_03;

public class Direccion {
	private String calle;
	private String ciudad;
	private int cp;
	private String pais;
	
	/**
	 * Constructor con todos los parametros
	 * @param calle String
	 * @param ciudad String
	 * @param cp int
	 * @param pais String
	 */
	public Direccion(String calle, String ciudad, int cp, String pais) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.cp = cp;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad 
				+ ", cp=" + cp + ", pais=" + pais + "]";
	}
	
	
	
}
