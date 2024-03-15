package ejercicio_04;

public class Ordenador {

	//Atributos
	private String marca;
	private int memoria;
	private String sistemaOperativo;
	private double precio;
	
	
	/**
	 * Constructor con todos los parametros
	 * @param marca String	
	 * @param memoria entero
	 * @param sistemaOperativo String
	 * @param precio real
	 */
	public Ordenador(String marca, int memoria, String sistemaOperativo, double precio) {
		this.marca = marca;
		this.memoria = memoria;
		this.sistemaOperativo = sistemaOperativo;
		this.precio = precio;
	}

	/**
	 * Metodo get del atributo marca
	 * @return String
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * Metodo get del atributo memoria
	 * @return entero
	 */
	public int getMemoria() {
		return memoria;
	}
	
	/**
	 * Metodo set del atributo memoria
	 * @param memoria entero
	 */
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	/**
	 * Metodo get del atributo sistema operativo
	 * @return String
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

	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", memoria=" + memoria + ", sistemaOperativo=" + sistemaOperativo
				+ ", precio=" + precio + "]";
	}
	
}
