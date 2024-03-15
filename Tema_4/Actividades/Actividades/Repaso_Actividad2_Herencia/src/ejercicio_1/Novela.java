package ejercicio_1;

public class Novela extends Libro {
	
	protected TipoNovela tipo;

	/**
	 * Constructor de la clase tipo de novela con parametros
	 * @param titulo String
	 * @param autor String
	 * @param precio real
	 * @param tipo TipoNovela
	 */
	public Novela(String titulo, String autor, double precio, TipoNovela tipo) {
		super(titulo, autor, precio);
		this.tipo = tipo;
	}

	/**
	 * @return the tipo
	 */
	public TipoNovela getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoNovela tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Novela [tipo=" + tipo + ", titulo=" + titulo + ", autor=" + autor +
						", precio=" + precio + "]";
	}
	
	
	
	
}
