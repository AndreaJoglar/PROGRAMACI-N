package ejercicio_01;

public class Libro {

	//protected: para que las clases derivadas tengan acceso a los atributos
	protected String titulo;
	protected String autor;
	protected double precio;
	
	/**
	 * Constructor con todos los parametros
	 * @param titulo String
	 * @param autor String
	 */
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = 0;
	}

	/**
	 * Metodo get del atributo titulo
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Metodo get del atributo autor
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Metodo get del atributo precio
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	//Solo nos va a interesar poder cambiar el precio, por ejemplo
	/**
	 * Metodo set del atributo precio
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	/**
	 * Si iva = 12 % => recibimos 12
	 * @param iva entero
	 * @return real
	 */
	public double precioConIva (int iva) {
		double precioFinal = precio + (precio * iva/100);
		return precioFinal;
	}
	
	
	
}
