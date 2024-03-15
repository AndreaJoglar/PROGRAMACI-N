package hotelInventada;

public class Habitacion {
	
	private int idHabitacion;
	private String nombre;
	private TipoHabitacion tipo;
	private String pisoUbicacion;
	private double precioNoche;
	private boolean estaDisponible;
	
	/**
	 * Constructor con todos los parametros
	 * @param idHabitacion entero
	 * @param nombre String
	 * @param tipo TipoHabitacion
	 * @param pisoUbicacion String
	 * @param precioNoche real
	 */
	public Habitacion(int idHabitacion, String nombre, TipoHabitacion tipo, String pisoUbicacion, 
							double precioNoche, boolean estaDisponible) {
		this.idHabitacion = idHabitacion;
		this.nombre = nombre;
		this.tipo = tipo;
		this.pisoUbicacion = pisoUbicacion;
		this.precioNoche = precioNoche;
		this.estaDisponible = estaDisponible;
	}

	/**
	 * @return the idHabitacion
	 */
	public int getIdHabitacion() {
		return idHabitacion;
	}

	/**
	 * @param idHabitacion the idHabitacion to set
	 */
	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
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
	 * @return the tipo
	 */
	public TipoHabitacion getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoHabitacion tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the pisoUbicacion
	 */
	public String getPisoUbicacion() {
		return pisoUbicacion;
	}

	/**
	 * @param pisoUbicacion the pisoUbicacion to set
	 */
	public void setPisoUbicacion(String pisoUbicacion) {
		this.pisoUbicacion = pisoUbicacion;
	}

	/**
	 * @return the precioNoche
	 */
	public double getPrecioNoche() {
		return precioNoche;
	}

	/**
	 * @param precioNoche the precioNoche to set
	 */
	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}

	/**
	 * @return the estaDisponible
	 */
	public boolean isEstaDisponible() {
		return estaDisponible;
	}

	/**
	 * @param estaDisponible the estaDisponible to set
	 */
	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	@Override
	public String toString() {
		return "Habitacion [idHabitacion=" + idHabitacion + ", nombre=" + nombre + ", tipo=" + tipo + ", pisoUbicacion="
				+ pisoUbicacion + ", precioNoche=" + precioNoche + ", estaDisponible=" + estaDisponible + "]";
	}
	
	
	
	
	
	

}
