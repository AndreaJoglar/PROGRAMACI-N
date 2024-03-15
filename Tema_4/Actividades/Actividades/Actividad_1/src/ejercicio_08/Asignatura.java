package ejercicio_08;

public class Asignatura {

	//Atributos
	private String nombre;
	private int numHoras;
	
	private Profesor profesor;
	
	//sobrecarga dos constructores con el mismo nombre y distintos parámetros

	/**
	 * @param nombre
	 * @param numHoras
	 * @param profesor
	 */
	public Asignatura(String nombre, int numHoras, Profesor profesor) {
		this.nombre = nombre;
		this.numHoras = numHoras;
		this.profesor = profesor;
	}

	/**
	 * @param nombre
	 * @param numHoras
	 */
	public Asignatura(String nombre, int numHoras) {
		this.nombre = nombre;
		this.numHoras = numHoras;
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
	 * @return the numHoras
	 */
	public int getNumHoras() {
		return numHoras;
	}

	/**
	 * @param numHoras the numHoras to set
	 */
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	/**
	 * @return the profesor
	 */
	public Profesor getProfesor() {
		return profesor;
	}

	/**
	 * @param profesor the profesor to set
	 */
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		String texto = "Asignatura [nombre=" + nombre + ", numHoras=" + numHoras + "]\n";
		if (profesor != null) {
			texto+= "\t"+profesor.getNombre()+"\n";
		}
		else {
			System.out.println("\tSin profesor \n");
		}
		return texto;
		
	}
	
	
	
}
