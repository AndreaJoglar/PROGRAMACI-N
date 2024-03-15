package ejercicio_1;

public class LibroTexto extends Libro {
	
	protected int curso;

	/**
	 * Constructor de la clase Libro de Texto con parametros
	 * @param titulo String
	 * @param autor String
	 * @param precio real
	 * @param curso entero
	 */
	public LibroTexto(String titulo, String autor, double precio, int curso) {
		super(titulo, autor, precio);
		this.curso = curso;
	}

	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "LibroTexto [curso=" + curso + ", titulo=" + titulo 
				+ ", autor=" + autor + ", precio=" + precio + "]";
	}

	
	
	
	

}
