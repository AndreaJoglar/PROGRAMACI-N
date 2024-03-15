package ejercicio_3;

public class Direccion {

	protected String calle;
	protected String ciudad;
	protected int cp;
	protected String pais;
	
	/**
	 * Constructor predeterminado de la clase direccion
	 */
	public Direccion() {
	}

	/**
	 * Constructor con parametros
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

	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the cp
	 */
	public int getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(int cp) {
		this.cp = cp;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad 
				+ ", cp=" + cp + ", pais=" + pais + "]";
	}
	
	
	
	
	
}
