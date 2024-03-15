package ejercicio_04;

public class Computador {

	private String marca;
	private int cantidadMemoria;
	private String sistemaOperativo;
	private double precio;
	
	/**
	 * Constructor con todos los parametros
	 * @param marca String
	 * @param cantidadMemoria entero
	 * @param sistemaOperativo String
	 * @param precio real
	 */
	public Computador(String marca, int cantidadMemoria, String sistemaOperativo, double precio) {
		this.marca = marca;
		this.cantidadMemoria = cantidadMemoria;
		this.sistemaOperativo = sistemaOperativo;
		this.precio = precio;
	}

	/**
	 * Metodo get del atributo marca
	 * @return marca String
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Metodo set del atributo marca
	 * @param marca String
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Metodo get del atributo cantidad de memoria
	 * @return cantidadMemoria entero
	 */
	public int getCantidadMemoria() {
		return cantidadMemoria;
	}

	/**
	 * Metodo set del atributo cantidad de memoria
	 * @param cantidadMemoria entero
	 */
	public void setCantidadMemoria(int cantidadMemoria) {
		this.cantidadMemoria = cantidadMemoria;
	}

	/**
	 * Metodo get del atributo sistema operativo
	 * @return sistemaOperativo String
	 */
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	/**
	 * Metodo set del atributo sistema operativo
	 * @param sistemaOperativo String
	 */
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
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

	@Override
	public String toString() {
		return "Computador [marca=" + marca + ", cantidadMemoria=" + cantidadMemoria + ", sistemaOperativo="
				+ sistemaOperativo + ", precio=" + precio + "]";
	}
	
	
	
}
