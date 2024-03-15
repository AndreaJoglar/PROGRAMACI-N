package ejercicio;

public class Producto {
	protected int numeroId;
	protected int caducidad; //meses de almacenaje del producto
	protected String tipoProducto; //CD, TV, etc.
	protected boolean esApilable; //determina si el producto se puede almacenar
	
	/**
	 * Constructor con todos los parametros
	 * @param numeroId int
	 * @param caducidad int
	 * @param tipoProducto String
	 * @param esApilable boolean
	 */
	public Producto(int numeroId, int caducidad, String tipoProducto, boolean esApilable) {
		this.numeroId = numeroId;
		this.caducidad = caducidad;
		this.tipoProducto = tipoProducto;
		this.esApilable = esApilable;
	}

	/**
	 * Metodo get del atributo numero de id
	 * @return numeroId entero
	 */
	public int getNumeroId() {
		return numeroId;
	}

	/**
	 * Metodo set del atributo numero de id
	 * @param numeroId entero
	 */
	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}

	/**
	 * Metodo get del atributo caducidad
	 * @return caducidad entero
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
	 * Metodo get del atributo tipo de producto
	 * @return tipoProducto String
	 */
	public String getTipoProducto() {
		return tipoProducto;
	}

	/**
	 * Metodo set del atributo tipo de producto
	 * @param tipoProducto String
	 */
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	/**
	 * Metodo get del atributo es apilable
	 * @return esApilable boolean
	 */
	public boolean isEsApilable() {
		return esApilable;
	}

	/**
	 * Metpdp set del atributo es apilable
	 * @param esApilable boolean
	 */
	public void setEsApilable(boolean esApilable) {
		this.esApilable = esApilable;
	}

	/**
	 * Metodo para obtener la planta de almacenamiento de cada producto
	 * @return entero
	 */
	public int obtenerPlanta () {
		int planta = 0;
		
		if ((this.caducidad >= 0 || this.caducidad <= 1) && (!this.esApilable)) {
			planta = 1;	
		}
		else {
			if ((this.caducidad > 1) && (this.esApilable)) {
				planta = 2;
			}
			else {
				if ((this.caducidad == -1) && (this.esApilable)) {
					planta = 3;
				}
				else {
					planta = 4;
				}
			}
		}
		return planta;
	}
	
	
	@Override
	public String toString() {
		return "Producto [numeroId=" + numeroId + ", caducidad=" + caducidad 
				+ ", tipoProducto=" + tipoProducto
				+ ", esApilable=" + esApilable + "]";
	}
	
	
	

}
