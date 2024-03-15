package ejercicio_01;

public class Novela extends Libro {
	
	protected TipoNovela tipo;

	/**
	 * Constructor con los parametros
	 * @param titulo String 
	 * @param autor String
	 * @param tipo TipoNovela
	 */
	public Novela(String titulo, String autor, TipoNovela tipo) {
		super(titulo, autor);
		this.tipo = tipo;
	}

	/**
	 * Metodo get del atributo tipo
	 * @return the tipo TipoNovel
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
		return "Novela [tipo=" + tipo + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	

}
