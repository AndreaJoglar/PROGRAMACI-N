package Actividad_Aula;

public class Electrodomestico {

	private String identificador;
	private String nombre;
	private String fabricante;
	private double precio;
	private boolean enStock;
	
	/**
	 * Constructor con todos los parametros
	 * @param identificador String
	 * @param nombre String
	 * @param fabricante String
	 * @param precio real
	 * @param enStock boolean
	 */
	public Electrodomestico(String identificador, String nombre, String fabricante, double precio, boolean enStock) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.precio = precio;
		this.enStock = enStock;
	}

	/**
	 * Metodo get del atributo identificador
	 * @return identificador String
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * Metodo set del atributo identificador
	 * @param identificador String
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	/**
	 * Metodo get del atributo nombre
	 * @return nombre String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del atributo nombre
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del atributo fabricante
	 * @return fabricante String
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * Metodo set del atributo fabricante
	 * @param fabricante String
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * Metodo get del atributo precio
	 * @return precio real
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
	 * Metodo get del atributo en stock
	 * @return enStock boolean
	 */
	public boolean isEnStock() {
		return enStock;
	}

	/**
	 * Metodo set del atributo en stock
	 * @param enStock boolean
	 */
	public void setEnStock(boolean enStock) {
		this.enStock = enStock;
	}

	@Override
	public String toString() {
		return "Electrodomestico [identificador=" + identificador + ", nombre=" + nombre + ", fabricante=" + fabricante
				+ ", precio=" + precio + ", enStock=" + enStock + "]";
	}
	
	
	
	
	
	
	
}
