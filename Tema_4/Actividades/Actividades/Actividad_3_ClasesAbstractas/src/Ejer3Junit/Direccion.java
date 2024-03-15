package Ejer3Junit;

public class Direccion {
	private String calle;
	private String ciudad;
	private int cp;
	private String pais;
	/**
	 * @param calle
	 * @param ciudad
	 * @param cp
	 * @param pais
	 */
	public Direccion(String calle, String ciudad, int cp, String pais) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.cp = cp;
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", cp=" + cp + ", pais=" + pais + "]";
	}
	
	
}
