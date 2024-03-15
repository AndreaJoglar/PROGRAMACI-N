package ejercicio_07;

public class Reserva {

	// Atributos
	private String fechaReservaPista;
	private String fechaUsoPista;
	private double precio; //lo vamos a sacar del precio de la pista, entonces no lo ponemos en el constructor

	private Usuario[] usuarios; //siempre que tenemos un vector hacemos el añadir
	private int contUsuario;

	private Pista pista;

	
	/**
	 * Constructor con todos los parametros
	 * @param fechaReservaPista String
	 * @param fechaUsoPista     String
	 * @param usuarios vector de Usuario
	 * @param pistas            vector de Pista
	 */
	public Reserva(String fechaReservaPista, String fechaUsoPista, Pista pista) {
		this.fechaReservaPista = fechaReservaPista;
		this.fechaUsoPista = fechaUsoPista;
		this.pista = pista;
		this.precio = pista.getPrecio();

		this.usuarios = new Usuario[10];
		this.contUsuario = 0;
		
	}

	/**
	 * Metodo get del atributo fecha de reserva de pista
	 * @return String
	 */
	public String getFechaReservaPista() {
		return fechaReservaPista;
	}

	/**
	 * Metodo set del atributo fecha de reserva de pista
	 * @param fechaReservaPista String
	 */
	public void setFechaReservaPista(String fechaReservaPista) {
		this.fechaReservaPista = fechaReservaPista;
	}

	/**
	 * Metodo get del atributo fecha del uso de pista
	 * @return String
	 */
	public String getFechaUsoPista() {
		return fechaUsoPista;
	}

	/**
	 * Metodo set del atributo fecha de uso de pista
	 * @param fechaUsoPista
	 */
	public void setFechaUsoPista(String fechaUsoPista) {
		this.fechaUsoPista = fechaUsoPista;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public Usuario[] getUsuarios() {
		return usuarios;
	}



	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}



	public int getContUsuario() {
		return contUsuario;
	}



	public void setContUsuario(int contUsuario) {
		this.contUsuario = contUsuario;
	}



	public Pista getPista() {
		return pista;
	}



	public void setPista(Pista pista) {
		this.pista = pista;
	}



	@Override
	public String toString() {
		String texto = "Reserva [fechaReservaPista=" + fechaReservaPista + ", fechaUsoPista=" + fechaUsoPista
				+ ", pista = " + pista.toString() + ", precio=" + precio + "]\n";
		for (int i = 0; i < contUsuario; i++) {
			Usuario u = usuarios[i];
			texto+=u.toString() + "\n";
		}
		return texto;
	}

	//Va a ser agregación, porque los usuarios pueden existir aunque no exista la reserva
	/**
	 * Aniade usuarios a la reserva
	 * @param u Usuario
	 */
	public void addUsuario (Usuario u) {
		if (this.contUsuario < usuarios.length) {
			int pos = this.contUsuario;
			usuarios[pos] = u;
			this.contUsuario++;
		}
	}

}
