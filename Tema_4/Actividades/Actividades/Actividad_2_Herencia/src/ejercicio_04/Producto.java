package ejercicio_04;

public class Producto {
	
	protected String fechaCaducidad;
	protected String numeroLote;
	protected String fechaEnvasado;
	protected String paisOrigen;

	/**
	 * Constructor con todos los parametros
	 * @param fechaCaducidad String
	 * @param numeroLote String
	 * @param fechaEnvasado String
	 * @param paisOrigen String
	 */
	public Producto(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	/**
	 * Metodo get del atributo fechaCaducidad
	 * @return the fechaCaducidad
	 */
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	/**
	 * Metodo set del atributo fechaCaducidad
	 * @param fechaCaducidad the fechaCaducidad to set
	 */
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	/**
	 * Metodo get del atributo numero de lote
	 * @return the numeroLote
	 */
	public String getNumeroLote() {
		return numeroLote;
	}

	/**
	 * Metodo set del atributo numero de lote
	 * @param numeroLote the numeroLote to set
	 */
	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	/**
	 * Metodo get del atributo fecha envasado
	 * @return the fechaEnvasado
	 */
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	/**
	 * Metodo set del atributo fecha Envasado
	 * @param fechaEnvasado the fechaEnvasado to set
	 */
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	/**
	 * Metodo get del atributo pais de origen
	 * @return the paisOrigen
	 */
	public String getPaisOrigen() {
		return paisOrigen;
	}

	/**
	 * Metodo set del atributo pais de origen
	 * @param paisOrigen the paisOrigen to set
	 */
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + ", fechaEnvasado="
				+ fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}

	
	
	
	
	

}
