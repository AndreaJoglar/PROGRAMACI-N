/**
 * Subclase GrupoMusical. Aplica metodos heredados e incluye metodos propios para determinar
 * si es necesario actualizar el presupuesto del grupo en funcion de si tiene tecnico propio
 * o no.
 */
package ejercicio;

/**
 * @author Andrea Fernandez Joglar
 * @version 1.2
 */
public class GrupoMusical extends Artista {

	private final String ID_MUSICA = "GM";
	
	private static int CONTADOR_ID_MUSICAL = 0;
	
	private String idMusica;
	private EstiloMusical estilo;
	private boolean tieneTecnicoSonido;
	
	/**
	 * Constructor de la clase Grupo Musical que recibe los parametros
	 * @param nombreArtista String
	 * @param manager Manager
	 * @param cache real
	 * @param estilo TipoMusical
	 * @param tieneTecnicoSonido boolean
	 */
	public GrupoMusical(String nombreArtista, Manager manager, double cache,
						EstiloMusical estilo, boolean tieneTecnicoSonido) {
		super(nombreArtista, manager, cache);
		CONTADOR_ID_MUSICAL++;
		this.idMusica = asignarIdentificador();
		this.estilo = estilo;
		this.tieneTecnicoSonido = tieneTecnicoSonido;
	}	
	
	/**
	 * Metodo get del atributo identificador Musica
	 * @return idMusica String
	 */
	public String getIdMusica() {
		return idMusica;
	}

	/**
	 * Metodo set del atributo identificador Musica
	 * @param idMusica String
	 */
	public void setIdMusica(String idMusica) {
		this.idMusica = idMusica;
	}

	/**
	 * Metodo get del atributo estilo
	 * @return estilo EstiloMusical
	 */
	public EstiloMusical getEstilo() {
		return estilo;
	}

	/**
	 * Metodo set del atributo estilo
	 * @param estilo EstiloMusical
	 */
	public void setEstilo(EstiloMusical estilo) {
		this.estilo = estilo;
	}

	/**
	 * Metodo get del atributo tiene tecnico de sonido
	 * @return tieneTecnicoSonido boolean
	 */
	public boolean isTieneTecnicoSonido() {
		return tieneTecnicoSonido;
	}

	/**
	 * Metodo set del atributo tiene tecnico de sonido
	 * @param tieneTecnicoSonido boolean
	 */
	public void setTieneTecnicoSonido(boolean tieneTecnicoSonido) {
		this.tieneTecnicoSonido = tieneTecnicoSonido;
	}

	/**
	 * Metodo que determina si el GrupoMusical necesita tecnico de sonido. Si tieneTecnicoSonido
	 * es true, se considera que NO necesita tecnico. Si es false, se considera que SI lo necesita
	 * @param necesitaTec boolean
	 * @return String
	 */
	public String necesitaTecnico (boolean necesitaTec) {
		String tecnico = "\n\tNecesita técnico de sonido: ";
		
		if (tieneTecnicoSonido) {
			tecnico = tecnico + "NO";
		}
		else {
			tecnico = tecnico + "SI";
		}
		return tecnico;
	}
	
	/**
	 * Metodo que incrementa el cache del grupo si se debe contratar un tecnico de sonido 
	 * (tieneTecnicoSonido == false).
	 * En ese caso, aumenta el precio final 500 euros para cubrir los gastos de la contratacion del
	 * tecnico
	 * @return real
	 */
	public double actualizarCache() {
		double cacheFinal = super.getCache();
		
		if (!this.tieneTecnicoSonido) {
			cacheFinal += 500;
		}
		
		return cacheFinal;
	}
	
	@Override
	public String asignarIdentificador() {
		String id = super.asignarIdentificador() + this.ID_MUSICA + CONTADOR_ID_MUSICAL;
		
		super.setIdArtista(id);
		
		return id;
	}

	@Override
	public void mostrarDisciplina() {
		System.out.println("****************************");
		System.out.println("Grupo Musical: " + this.idMusica 
							+ "\nEstilo Musical: " + this.estilo);
		System.out.println(this.toString() + necesitaTecnico(tieneTecnicoSonido));
		
		if(!tieneTecnicoSonido) {
			System.out.println("\tCaché final: " + actualizarCache() + "\n");
		}	

	}
}
