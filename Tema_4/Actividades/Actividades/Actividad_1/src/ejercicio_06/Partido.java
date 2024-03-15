package ejercicio_06;

public class Partido {

	//Atributos
	private String resultado; // "1-0"
	private String campo;
	private String arbitro;
	private String incidencias;
	
	private Equipo local;
	private Equipo visitante;
	
	/**
	 * Constructor con todos los parametros
	 * @param resultado
	 * @param campo
	 * @param arbitro
	 * @param incidencias
	 * @param local
	 * @param visitante
	 */
	public Partido(String resultado, String campo, String arbitro, String incidencias, Equipo local, Equipo visitante) {
		this.resultado = resultado;
		this.campo = campo;
		this.arbitro = arbitro;
		this.incidencias = incidencias;
		this.local = local;
		this.visitante = visitante;
	}
	
	/**
	 * Constructor con todos los parametros
	 * @param resultado
	 * @param campo
	 * @param arbitro
	 * @param local
	 * @param visitante
	 */
	public Partido(String resultado, String campo, String arbitro, Equipo local, Equipo visitante) {
		this.resultado = resultado;
		this.campo = campo;
		this.arbitro = arbitro;
		this.local = local;
		this.visitante = visitante;
		this.incidencias = "";
	}
	
	

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}

	public String getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

	@Override
	public String toString() {
		String texto = "Partido [resultado=" + resultado + ", campo=" + campo + ", arbitro=" + arbitro + ", incidencias="
				+ incidencias + "\n";
		texto+=" local = " + local.toString()+"\n";
		texto+=" visitante = " + visitante.toString();
		return texto;
	}
	
	
	
	
	
}
