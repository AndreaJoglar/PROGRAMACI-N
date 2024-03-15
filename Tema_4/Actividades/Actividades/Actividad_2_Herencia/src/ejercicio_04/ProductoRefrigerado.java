package ejercicio_04;

public class ProductoRefrigerado extends Producto{

	protected String codigoSupervision;
	protected String temperaturaRecomendada;
	
	/**
	 * Constructor con parametros
	 * @param fechaCaducidad String
	 * @param numeroLote String
	 * @param fechaEnvasado String
	 * @param paisOrigen String
	 * @param codigoSupervision String
	 * @param temperaturaRecomendada String
	 */
	public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,
			String codigoSupervision, String temperaturaRecomendada) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
		this.codigoSupervision = codigoSupervision;
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	/**
	 * Metodo get del atributo codigo de supervision alimentaria
	 * @return the codigoSupervision String
	 */
	public String getCodigoSupervision() {
		return codigoSupervision;
	}

	/**
	 * Metodo set del atributo codigo de supervision alimentaria
	 * @param codigoSupervision the codigoSupervision to set String
	 */
	public void setCodigoSupervision(String codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
	}

	/**
	 * Metodo get del atributo temperatura recomendada
	 * @return the temperaturaRecomendada String
	 */
	public String getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	/**
	 * Metodo set del atributo temperatura recomendada
	 * @param temperaturaRecomendada the temperaturaRecomendada to set String
	 */
	public void setTemperaturaRecomendada(String temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	@Override
	public String toString() {
		return super.toString() + "ProductoRefrigerado [codigoSupervision=" 
								+ codigoSupervision + ", temperaturaRecomendada="
								+ temperaturaRecomendada + "]";
	}
	
	
	
	
	
	
	
	
}
