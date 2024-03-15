package ejercicio_07;

public class Pista {

	//Atributos
	private int codigo;
	//enumerados: no tienen tipo, ni métodos...
	private TipoPista tipo;
	private boolean estaOperativa;
	private double precio;
	private String fechaUltimaReserva;
	
	/**
	 * Constructor con los parametros
	 * @param codigo entero
	 * @param tipo enumeracion TipoPista
	 * @param estaOperativa boolean
	 * @param precio real
	 * @param fechaUltimaReserva String
	 */
	public Pista(int codigo, TipoPista tipo, boolean estaOperativa, double precio, String fechaUltimaReserva) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.estaOperativa = estaOperativa;
		this.precio = precio;
		this.fechaUltimaReserva = fechaUltimaReserva;
	}
	
	/**
	 * Metodo get del atributo codigo
	 * @return String
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Metodo set del atributo codigo
	 * @param codigo String
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Metodo get del atributo enumeracion TipoPista
	 * @return String
	 */
	public TipoPista getTipo() {
		return tipo;
	}
	
	/**
	 * Metodo set del atributo enumeracion TipoPista
	 * @param tipo String
	 */
	public void setTipo(TipoPista tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * Metodo get del atributo estaOperativa
	 * @return boolean
	 */
	public boolean isEstaOperativa() {
		return estaOperativa;
	}
	
	/**
	 * Metodo set del atributo estaOperativa
	 * @param estaOperativa boolean
	 */
	public void setEstaOperativa(boolean estaOperativa) {
		this.estaOperativa = estaOperativa;
	}
	
	/**
	 * Metodo get del atributo precio
	 * @return real
	 */
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * Metodo set del atributo precio
	 * @param precio real
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * Metodo get del atributo fechaUltimaReserva
	 * @return String
	 */
	public String getFechaUltimaReserva() {
		return fechaUltimaReserva;
	}
	
	/**
	 * Metodo set del atributo fechaUltimaReserva
	 * @param fechaUltimaReserva String
	 */
	public void setFechaUltimaReserva(String fechaUltimaReserva) {
		this.fechaUltimaReserva = fechaUltimaReserva;
	}
	
	@Override
	public String toString() {
		return "Pista [codigo=" + codigo + ", tipo=" + tipo + ", estaOperativa=" + estaOperativa + ", precio=" + precio
				+ ", fechaUltimaReserva=" + fechaUltimaReserva + "]";
	}
	
	
	
	
}
