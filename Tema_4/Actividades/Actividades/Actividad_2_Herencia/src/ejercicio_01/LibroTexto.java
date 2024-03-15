package ejercicio_01;

public class LibroTexto extends Libro{

	//Atributo propio de la subclase
	protected int curso;
	
	
	//Constructor de la subclase
	public LibroTexto(String titulo, String autor, int curso) {
		super(titulo, autor);
		this.curso = curso;
	}

	/**
	 * Metodo get del atributo curso
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Metodo set del atributo curso
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}



	@Override
	public String toString() {
		return "LibroTexto [curso=" + curso + ", titulo=" + titulo + ", autor=" + autor 
							+ ", precio=" + precio + "]";
	}

	
	
	
}
