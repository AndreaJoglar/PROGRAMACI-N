package ejercicio_06;

public class Equipo {
	
	//Atributos
	private String nombre;
	private String patrocinador;
	private String colorCamiseta1;
	private String colorCamiseta2;
	private String categoria;
	
	private Participante participantes [];
	private int contParticipantes;
	
	
	/**
	 * @param nombre
	 * @param patrocinador
	 * @param colorCamiseta1
	 * @param colorCamiseta2
	 * @param categoria
	 */
	public Equipo(String nombre, String patrocinador, String colorCamiseta1, String colorCamiseta2, String categoria) {
		this.nombre = nombre;
		this.patrocinador = patrocinador;
		this.colorCamiseta1 = colorCamiseta1;
		this.colorCamiseta2 = colorCamiseta2;
		this.categoria = categoria;
		
		this.participantes = new Participante [10]; //no ponemos set tampoco al vector
		this.contParticipantes = 0; //no es necesario el set, para que no se modifique el contador
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
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPatrocinador() {
		return patrocinador;
	}


	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}


	public String getColorCamiseta1() {
		return colorCamiseta1;
	}


	public void setColorCamiseta1(String colorCamiseta1) {
		this.colorCamiseta1 = colorCamiseta1;
	}


	public String getColorCamiseta2() {
		return colorCamiseta2;
	}


	public void setColorCamiseta2(String colorCamiseta2) {
		this.colorCamiseta2 = colorCamiseta2;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Participante[] getParticipantes() {
		return participantes;
	}


	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}


	public int getContParticipantes() {
		return contParticipantes;
	}
	
	@Override
	public String toString() {	
		String texto = "****************************\n";
		texto = "Equipo [nombre=" + nombre + ", patrocinador=" + patrocinador + ", colorCamiseta1=" + colorCamiseta1
				+ ", colorCamiseta2=" + colorCamiseta2 + ", categoria=" + categoria + "]\n";
		
		for (int i = 0; i < contParticipantes; i++) {
			Participante p = participantes[i];
			texto +=p.toString();
		}
		return texto;
				
	}
	

	/**
	 * Permite agregar un participante al equipo
	 * @param p Participante
	 */
	public void addParticipante (Participante p) {
		if (this.contParticipantes < participantes.length) {
			int pos = this.contParticipantes;
			participantes[pos] = p;
			this.contParticipantes++;
		}
	}
	
}
