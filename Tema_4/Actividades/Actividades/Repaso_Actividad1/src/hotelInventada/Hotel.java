package hotelInventada;

public class Hotel {

	private Habitacion [] habitaciones;
	private int numHabitaciones;
	
	/**
	 * Constructor por defecto
	 */
	public Hotel() {
		this.habitaciones = new Habitacion [10];
		this.numHabitaciones = 0;
	}
	
	/*
	 * private int idHabitacion;
	private String nombre;
	private TipoHabitacion tipo;
	private String pisoUbicacion;
	private double precioNoche;
	private boolean estaDisponible;
	 */
	public void addHabitacion (int idHabitacion, String nombre, TipoHabitacion tipo, String pisoUbicacion,
																double precioNoche, boolean estaDisponible) {
		
		if (this.numHabitaciones < this.habitaciones.length) {
			Habitacion h = new Habitacion(idHabitacion, nombre, tipo, pisoUbicacion, precioNoche, estaDisponible);
			habitaciones[numHabitaciones] = h;
			this.numHabitaciones++;
		}
		else {
			System.out.println("No hay espacio para más habitaciones.");
		}
	}
	
	/**
	 * Muestra las habitaciones del hotel por pantalla
	 */
	public void listarHotel () {
		System.out.println("\nHabitaciones del hotel: ");
		
		for (int i = 0; i < this.numHabitaciones; i++) {
			Habitacion h = habitaciones[i];
			System.out.println("\t" + h.toString());
		}
	}
	
	/**
	 * Busca una habitacion por su id
	 * @param idHabitacion entero
	 * @return boolean
	 */
	public int buscarHabitacion (int idHabitacion) {
		for (int i = 0; i < this.numHabitaciones ; i++) {
			Habitacion h = habitaciones[i];
			if(h.getIdHabitacion() == idHabitacion) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Reserva la habitación de la lista de disponibilidad.
	 * @param idHabitacion entero
	 */
	public void reservarHabitacion (int idHabitacion) {
		int pos = buscarHabitacion(idHabitacion);
		if (buscarHabitacion(idHabitacion) != -1) {
			habitaciones[pos].setEstaDisponible(false);
		}
	}
	
	
}
