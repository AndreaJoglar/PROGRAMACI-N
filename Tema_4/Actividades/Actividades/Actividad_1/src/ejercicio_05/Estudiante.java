package ejercicio_05;

public class Estudiante {
	
	private String nombre;
	private String apellidos;
	private int codigo;
	private int numeroSemestre;
	private double notaFinal;
	
	
	/**
	 * Constructor con todos los elementos
	 * @param nombre String
	 * @param apellidos String
	 * @param codigo entero
	 * @param numeroSemestre entero
	 * @param notaFinal real
	 */
	public Estudiante(String nombre, String apellidos, int codigo, int numeroSemestre, double notaFinal) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.codigo = codigo;
		this.numeroSemestre = numeroSemestre;
		this.notaFinal = notaFinal;
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
	 * Metodo get del atributo apellidos
	 * @return String
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo set del atributo apellidos
	 * @param apellidos String
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo get del atributo codigo
	 * @return entero
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Metodo set del atributo codigo
	 * @param codigo entero
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Metodo get del atributo numero de semestre
	 * @return entero
	 */
	public int getNumeroSemestre() {
		return numeroSemestre;
	}

	/**
	 * Metodo set del atributo numero de semestre
	 * @param numeroSemestre entero
	 */
	public void setNumeroSemestre(int numeroSemestre) {
		this.numeroSemestre = numeroSemestre;
	}

	/**
	 * Metodo get del atributo nota final
	 * @return real
	 */
	public double getNotaFinal() {
		return notaFinal;
	}

	/**
	 * Metodo set del atributo nota final
	 * @param notaFinal real
	 */
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", codigo=" + codigo + ", numeroSemestre="
				+ numeroSemestre + ", notaFinal=" + notaFinal + "]";
	}
	
	

	
	
}
