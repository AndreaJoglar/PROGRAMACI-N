package ejemplo_Actividad_Aula;

public class Electrodomestico {

	//Atributos
	private String id;
	private String nombre;
	private String fabricante;
	private double precio;
	private boolean enStock;
	
	/**
	 * Constructor con todos los parametros
	 * @param id String
	 * @param nombre String
	 * @param fabricante String
	 * @param precio real
	 * @param enStock boolean
	 */
	public Electrodomestico(String id, String nombre, String fabricante, double precio, boolean enStock) {
		this.id = id;
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.precio = precio;
		this.enStock = enStock;
	}

	/**
	 * Metodo get del atributo id
	 * @return String
	 */
	public String getId() {
		return id;
	}

	/**
	 * Metodo set del atributo id
	 * @param id String
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Metodo get del atributo nombre
	 * @return String
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
	 * @return String
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
	 * Metodo get del atributo en stock
	 * @return boolean
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
		return "Electrodomestico [id=" + id + ", nombre=" + nombre + ", fabricante=" 
								+ fabricante + ", precio=" + precio + ", enStock=" + enStock + "]";
	}
	
	
	
	
}
