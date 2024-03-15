package ejercicio_1;

public class LibroTextoUniovi extends LibroTexto {
	
	protected String facultad;

	/**
	 * Constructor de la clase Libro de texto Uniovi con parametros
	 * @param titulo String
	 * @param autor String
	 * @param precio real
	 * @param curso entero
	 * @param facultad String
	 */
	public LibroTextoUniovi(String titulo, String autor, double precio, int curso,
																String facultad) {
		super(titulo, autor, precio, curso);
		this.facultad = facultad;
	}

	/**
	 * @return the facultad
	 */
	public String getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return "LibroTextoUniovi [facultad=" + facultad + ", curso=" + curso 
				+ ", titulo=" + titulo + ", autor=" + autor
				+ ", precio=" + precio + "]";
	}
	
	
	
}
