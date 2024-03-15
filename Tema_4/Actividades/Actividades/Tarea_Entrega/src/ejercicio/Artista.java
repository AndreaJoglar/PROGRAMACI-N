/**
 * Clase abstracta Artista. Implementa el metodo asignarIdentificador de la interface Agrupacion.
 */
package ejercicio;

/**
 * @author Andrea Fernandez Joglar
 * @version 1.2
 */
public abstract class Artista implements I_Agrupacion {
	
	private static int CONTADOR_ARTISTA = 0;
	
	private final String ID_ARTISTA = "ART";
	
	private String idArtista;
	private String nombreArtista;
	private Manager manager;
	private double cache;
	
	/**
	 * Constructor de la clase Artista que recibe los parametros
	 * @param nombreArtista String
	 * @param manager Manager
	 * @param cache real
	 */
	public Artista(String nombreArtista, Manager manager, double cache) {
		CONTADOR_ARTISTA++;
		this.idArtista = asignarIdentificador();
		this.nombreArtista = nombreArtista;
		this.manager = manager;
		this.cache = cache;
	}
	
	/**
	 * Metodo get del atributo id de la clase Artista
	 * @return idArtista String
	 */
	public String getIdArtista() {
		return idArtista;
	}

	/**
	 * Metodo set del atributo id de la clase Artista
	 * @param idArtista String
	 */
	public void setIdArtista(String idArtista) {
		this.idArtista = idArtista;
	}

	/**
	 * Metodo get del atributo cache del Artsta
	 * @return cache real
	 */
	public double getCache() {
		return cache;
	}

	/**
	 * Metodo set del atributo cache del Artista
	 * @param cache real
	 */
	public void setCache(double cache) {
		this.cache = cache;
	}

	/**
	 * Metodo get del atributo nombreArtista
	 * @return nombreArtista String
	 */
	public String getNombreArtista() {
		return nombreArtista;
	}

	/**
	 * Metodo set del atributo nombreArtista
	 * @param nombreArtista String
	 */
	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	/**
	 * Metodo get del atributo manager
	 * @return manager Manager
	 */
	public Manager getManager() {
		return manager;
	}

	/**
	 * Metodo set del atributo manager
	 * @param manager Manager
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String asignarIdentificador() {
		String id = ID_ARTISTA + CONTADOR_ARTISTA;
		
		return id;
	}

	@Override
	public String toString() {
		
		return "Artista: " + nombreArtista 
				+ "\n\t" + manager.toString() + "\n\tCaché: " + cache;
	}

	
	
	
	
	
}
