package ejercicio;

public class Producto {

	private static int contProducto = 0;
	
	private int numeroId;
	private int caducidad;
	private String tipoProducto;
	private boolean apilable;
	
	/**
	 * Constructor con parametros de la clase Producto
	 * @param numeroId entero
	 * @param caducidad entero
	 * @param tipoProducto String
	 * @param apilable boolean
	 */
	public Producto(int numeroId, int caducidad, String tipoProducto, boolean apilable) {
		contProducto++;
		this.numeroId = contProducto;
		this.caducidad = caducidad;
		this.tipoProducto = tipoProducto;
		this.apilable = apilable;
	}
	
	/**
	 * Metodo get del atributo numeroId
	 * @return numeroId entero
	 */
	public int getNumeroId() {
		return numeroId;
	}

	/**
	 * Metodo set del atributo numeroId
	 * @param numeroId entero
	 */
	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}

	/**
	 * Metodo get del atributo caducidad
	 * @return  caducidad entero
	 */
	public int getCaducidad() {
		return caducidad;
	}

	/**
	 * Metodo set del atributo caducidad
	 * @param caducidad entero
	 */
	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}

	/**
	 * Metodo get del atributo tipoProducto
	 * @return tipoProducto String
	 */
	public String getTipoProducto() {
		return tipoProducto;
	}

	/**
	 * Metodo set del tipoProducto
	 * @param tipoProducto String
	 */
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	/**
	 * Metodo get del atributo es apilable
	 * @return apilable boolean
	 */
	public boolean isApilable() {
		return apilable;
	}

	/**
	 * Metodo set del atributo esApilable
	 * @param apilable the apilable to set
	 */
	public void setApilable(boolean apilable) {
		this.apilable = apilable;
	}

	/**
	 * Metodo para determinar la planta del producto. El 0 indica que el
	 * producto es NO PERECEDERO
	 * @param p Producto
	 * @return entero
	 */
	public int obtenerPlanta (Producto p) {
		int planta = 0;
		
		if (p.getCaducidad() <= 1 && p.getCaducidad() > 0) {
			planta = 1;
		} 
		else {
			if (p.isApilable()) {
				if (p.getCaducidad() > 1) {
					planta = 2;
				}
				else {
					if (p.getCaducidad() == 0) { // 0 = no perecedero
						planta = 3;
					}
				}
			}
			else {
				planta = 4;
			}
		}
		
		return planta;
	}
	
	
	
	@Override
	public String toString() {
		return "\tProducto [numeroId=" + numeroId + ", caducidad=" + caducidad 
				+ ", tipoProducto=" + tipoProducto
				+ ", apilable=" + apilable + "]\n";
	}
	
	
	
}
