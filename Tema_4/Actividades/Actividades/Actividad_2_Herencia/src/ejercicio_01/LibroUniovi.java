package ejercicio_01;

public class LibroUniovi extends LibroTexto {
	
	private String facultad;

	public LibroUniovi(String titulo, String autor, int curso, String facultad) {
		super(titulo, autor, curso);
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
		return "LibroUniovi [facultad=" + facultad + ", curso=" + curso + ", titulo=" + titulo + ", autor=" + autor
				+ ", precio=" + precio + "]";
	}


	
	
	

}
