package actividad_aula;

/**
 * @author Andrea Fernandez Joglar
 * @version 1.2
 */

public class Habitacion {

	private String identificador;
	
	private int planta;
	
	private String tipo;
	
	private double precio;
	
	private boolean ocupado;
	
	private boolean tieneVistaExterior;
	
	private String numLocalizacion;
	
	/**
	 * Constructor con todos los parametros
	 * @param identificador String
	 * @param planta entero
	 * @param tipo String
	 * @param precio real
	 * @param ocupado boolean 
	 * @param tieneVistaExterior boolean
	 */
	public Habitacion(String identificador, int planta, String tipo, double precio, 
					  boolean ocupado, boolean tieneVistaExterior, String numLocalizacion) {
		
		this.identificador = identificador;
		
		this.planta = planta;
		
		this.tipo = tipo;
		
		this.precio = precio;
		
		this.ocupado = ocupado;
		
		this.tieneVistaExterior = tieneVistaExterior;
		
		this.numLocalizacion = generarNumLocalizacion();
	}
	

	/**
	 * Metodo get del atributo identificador
	 * @return identificador String
	 */
	public String getIdentificador() {
		
		return identificador;
	}

	/**
	 * Metodo set del atributo identificador
	 * @param identificador String
	 */
	public void setIdentificador(String identificador) {
		
		this.identificador = identificador;
	}

	/**
	 * Metodo get del atributo planta
	 * @return planta entero
	 */
	public int getPlanta() {
		
		return planta;
	}

	/**
	 * Metodo set del atributo planta
	 * @param planta entero
	 */
	public void setPlanta(int planta) {
		
		this.planta = planta;
	}

	/**
	 * Metodo get del atributo tipo
	 * @return tipo String
	 */
	public String getTipo() {
		
		return tipo;
	}

	/**
	 * Metodo set del atributo tipo
	 * @param tipo String
	 */
	public void setTipo(String tipo) {
		
		this.tipo = tipo;
	}

	/**
	 * Metodo get del atributo precio
	 * @return precio real
	 */
	public double getPrecio() {
		
		return precio;
	}

	/**
	 * Metodo set del atributo precio
	 * @param precio real
	 */
	public void setPrecio(double precio) {
		
		this.precio = precio;
	}

	/**
	 * Metodo get del atributo ocupado
	 * @return ocupado boolean
	 */
	public boolean isOcupado() {
		
		return ocupado;
	}

	/**
	 * Metodo set del atributo ocupado
	 * @param ocupado boolean
	 */
	public void setOcupado(boolean ocupado) {
		
		this.ocupado = ocupado;
	}

	/**
	 * Metodo get del atributo tiene vista exterior
	 * @return tieneVistaExterior boolean
	 */
	public boolean isTieneVistaExterior() {
		
		return tieneVistaExterior;
	}

	/**
	 * Metodo set del atributo tiene vista exterior
	 * @param tieneVistaExterior boolean
	 */
	public void setTieneVistaExterior(boolean tieneVistaExterior) {
		
		this.tieneVistaExterior = tieneVistaExterior;
	}

	/**
	 * Metodo get del atributo numero de localizacion
	 * @return numLocalizacion String
	 */
	public String getNumLocalizacion() {
		
		return numLocalizacion;
	}

	/**
	 * Metodo set del atributo numero de localizacion
	 * @param numLocalizacion String
	 */
	public void setNumLocalizacion(String numLocalizacion) {
		
		this.numLocalizacion = numLocalizacion;
	}

	@Override
	public String toString() {
		
		return "Habitacion [identificador=" + identificador + ", planta=" + planta 
				+ ", tipo=" + tipo + ", precio=" + precio + ", ocupado=" + ocupado 
				+ ", tieneVistaExterior=" + tieneVistaExterior 
				+ ", numLocalizacion=" + numLocalizacion + "]";
	}
	
	/**
	 * Genera el numero de localizacion
	 * @return String
	 */
	public String generarNumLocalizacion() {
		
		this.numLocalizacion = "";
		
		if (	   this.tipo.charAt(0) == 's' 
				|| this.tipo.charAt(0) == 'S') {
			this.numLocalizacion += 'S';
		}
		else {
			if (	   this.tipo.charAt(0) == 'd' 
					|| this.tipo.charAt(0) == 'D') {
				this.numLocalizacion += 'D';
			}
			else {
				if (       this.tipo.charAt(0) == 'm' 
						|| this.tipo.charAt(0) == 'M') {
					this.numLocalizacion += 'M';
				}
				else {
					if (       this.tipo.charAt(0) == 'e' 
							|| this.tipo.charAt(0) == 'E') {
						this.numLocalizacion += 'E';
					}
				}
			}
		}
		
		String planta = this.planta + "";
		
		this.numLocalizacion += planta;
		
		this.numLocalizacion += identificador;
		
		return this.numLocalizacion;
	}
}
