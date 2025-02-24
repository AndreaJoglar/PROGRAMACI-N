package ejercicio;

public class Producto {
	protected final String ID_PRODUCTO = "P";
	
	protected static int CONT_ID_PRODUCTO = 0;
	
	protected String idProducto;
	protected String nombre;
	protected String fabricante;
	protected double precio;
	protected boolean enStock;
	
	/**
	 * @param nombre
	 * @param fabricante
	 * @param precio
	 * @param enStock
	 */
	public Producto(String nombre, String fabricante, double precio, boolean enStock) {
		CONT_ID_PRODUCTO++;
		this.idProducto = asignarIdentificador();
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.precio = precio;
		this.enStock = enStock;
	}
	

	/**
	 * @return the idProducto
	 */
	public String getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the enStock
	 */
	public boolean isEnStock() {
		return enStock;
	}

	/**
	 * @param enStock the enStock to set
	 */
	public void setEnStock(boolean enStock) {
		this.enStock = enStock;
	}

	private String asignarIdentificador() {
		String id = ID_PRODUCTO + CONT_ID_PRODUCTO;
		return id;
	}


	@Override
	public String toString() {
		return "Producto: \n\tidProducto: " + idProducto + "\n\tNombre: " + nombre 
				+ "\n\tFabricante: " + fabricante + "\n\tPrecio: " + precio 
				+ "\n\tEn stock=" + enStock + "\n";
	}
	
	
	
	
}
