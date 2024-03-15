package ejercicio_04;

public class Tienda {

	private String nombreTienda;
	private String propietario;
	private String idTributario;

	private Computador[] computadores;
	private int contComputadores;

	/**
	 * Constructor con parametros nombre de tienda, propietario, idTributario y
	 * tamanio
	 * 
	 * @param nombreTienda
	 * @param propietario
	 * @param idTributario
	 */
	public Tienda(String nombreTienda, String propietario, String idTributario, int tam) {
		this.nombreTienda = nombreTienda;
		this.propietario = propietario;
		this.idTributario = idTributario;
		this.computadores = new Computador[tam];
		this.contComputadores = 0;
	}

	/**
	 * @return the nombreTienda
	 */
	public String getNombreTienda() {
		return nombreTienda;
	}

	/**
	 * @param nombreTienda the nombreTienda to set
	 */
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	/**
	 * @return the propietario
	 */
	public String getPropietario() {
		return propietario;
	}

	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	/**
	 * @return the idTributario
	 */
	public String getIdTributario() {
		return idTributario;
	}

	/**
	 * @param idTributario the idTributario to set
	 */
	public void setIdTributario(String idTributario) {
		this.idTributario = idTributario;
	}

	/**
	 * @return the computadores
	 */
	public Computador[] getComputadores() {
		return computadores;
	}

	/**
	 * @param computadores the computadores to set
	 */
	public void setComputadores(Computador[] computadores) {
		this.computadores = computadores;
	}

	/**
	 * @return the contComputadores
	 */
	public int getContComputadores() {
		return contComputadores;
	}

	/**
	 * @param contComputadores the contComputadores to set
	 */
	public void setContComputadores(int contComputadores) {
		this.contComputadores = contComputadores;
	}

	/**
	 * Determina si la tienda esta llena de productos
	 * 
	 * @return boolean
	 */
	public boolean tiendaLlena() {
		if (this.contComputadores == this.computadores.length) {
			return true;
		}
		return false;
	}

	/**
	 * Determina si la tienda esta vacia
	 * 
	 * @return boolean
	 */
	public boolean tiendaVacia() {
		if (this.contComputadores == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Permite aniadir computadores a la tienda
	 * @param c Computador
	 */
	public void addComputador(Computador c) {
		if (tiendaLlena() == false) {
			int posVacia = this.contComputadores;
			computadores[posVacia] = c;
			this.contComputadores++;
		}
		else {
			System.out.println("ERROR. La tienda está llena.");
		}
	}
	
	/**
	 * Busca un ordenador en la tienda por su marca
	 * @param marca String
	 * @return entero
	 */
	public int buscar (String marca) {
		for (int i = 0; i < contComputadores; i++) {
			Computador c = computadores[i];
			if (c.getMarca().compareTo(marca) == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public void eliminar (String marca) {
		if (tiendaVacia() == false) {
			if (buscar(marca) != -1) {
				int posEliminar = buscar(marca);
				for (int i = posEliminar; i < contComputadores-1; i++) {
					computadores[i] = computadores[i+1];
				}
				contComputadores--;
			}	
		}
	}

	/**
	 * Imprime productos de la tienda
	 * 
	 * @return String
	 */
	public void imprimir() {
		String texto = "Tienda [nombreTienda=" + nombreTienda + ", propietario=" + propietario + ", idTributario="
				+ idTributario + "]\n";

		for (int i = 0; i < this.contComputadores; i++) {
			Computador c = this.computadores[i];
			texto += "\t" + c.toString() + "\n";
		}
		System.out.println(texto);
	}

}
