package actividad_aula;

/**
 * @author Andrea Fernandez Joglar
 * @version 1.2
 */

public class Hotel {

	private Habitacion[] habitaciones;
	
	private int contHabitacion;

	/**
	 * Constructor por defecto de la clase Hotel
	 */
	public Hotel() {
		
		this.habitaciones = new Habitacion[10];
		
		this.contHabitacion = 0;
	}

	/**
	 * Metodo get del atributo habitaciones
	 * @return habitaciones vector de Habitacion
	 */
	public Habitacion[] getHabitaciones() {
		
		return habitaciones;
	}

	/**
	 * Metodo set del atributo habitaciones
	 * @param habitaciones vector de Habitacion
	 */
	public void setHabitaciones(Habitacion[] habitaciones) {
		
		this.habitaciones = habitaciones;
	}

	/**
	 * Metodo get del atributo contador de habitacion
	 * @return contHabitacion entero
	 */
	public int getContHabitacion() {
		
		return contHabitacion;
	}

	/**
	 * Metodo set del atributo contador de habitacion
	 * @param contHabitacion entero
	 */
	public void setContHabitacion(int contHabitacion) {
		
		this.contHabitacion = contHabitacion;
	}

	/**
	 * Permite aniadir una habitacion al hotel
	 * @param h Habitacion
	 */
	public void nuevaHabitacion(Habitacion h) {
		
		if (this.contHabitacion < this.habitaciones.length) {
			habitaciones[contHabitacion] = h;
			contHabitacion++;
		} else {
			System.out.println("No hay huecos libres.\n");
		}
	}

	/**
	 * Permite listar las habitaciones del hotel
	 */
	public void listarHabitaciones() {
		
		System.out.println("Habitaciones del hotel:\n");

		for (int i = 0; i < contHabitacion; i++) {
			Habitacion h = habitaciones[i];
			System.out.println("\t" + h.toString() + "\n");
		}
	}

	/**
	 * Busca habitaciones a partir de su identificador
	 * @param identificador String
	 * @return entero
	 */
	public int buscarIdentificador(String identificador) {
		
		int posicion = -1;
		
		for (int i = 0; i < this.contHabitacion; i++) {
			Habitacion h = habitaciones[i];
			if (h.getIdentificador().compareTo(identificador) == 0) {
				posicion = i;
			}
		}
		return posicion;
	}

	/**
	 * Permite borrar habitaciones
	 * @param identificador String
	 */
	public void borrarHabitacion(String identificador) {
		
		int pos = buscarIdentificador(identificador);
		
		if ((pos != -1) && (!habitaciones[pos].isOcupado())) {
			for (int i = pos; i < this.contHabitacion - 1; i++) {
				habitaciones[i] = habitaciones[i + 1];
			}
			contHabitacion--;
		} else {
			System.out.println("No se puede eliminar la habitación.\n");
		}
	}

	/**
	 * Muestra por pantalla las habitaciones disponibles
	 */
	public void habitacionesDisponibles() {
		
		System.out.println("Habitaciones disponibles: \n");

		for (int i = 0; i < this.contHabitacion; i++) {
			Habitacion h = habitaciones[i];
			if (!h.isOcupado()) {
				System.out.println("\t" + h.toString() + "\n");
			}
		}
	}

	/**
	 * Busca el precio de una habitacion a partir de su identificador
	 * @param identificador String
	 */
	public void precioHabitacion(String identificador) {
		
		int pos = buscarIdentificador(identificador);
		
		if (pos != -1) {
			System.out.println("\nPrecio de la habitacion: " 
							   + habitaciones[pos].getPrecio() + "\n");
		} else {
			System.out.println("ERROR. No se encuentra la habitacion.");
		}
	}

	/**
	 * Realiza una reserva de la habitacion
	 * @param identificador String
	 */
	public void hacerReserva(String identificador) {
		
		int pos = buscarIdentificador(identificador);
		
		if (pos != -1) {
			if (!habitaciones[pos].isOcupado()) {
				habitaciones[pos].setOcupado(true);
			} else {
				System.out.println("ERROR. La habitación no está disponible.\n");
			}
		} else {
			System.out.println("ERROR. La habitación no se encuentra en el registro.\n");
		}
	}

	/**
	 * Muestra por pantalla las habitaciones reservadas 
	 */
	public void habitacionesReservadas() {
		
		System.out.println("Habitaciones reservadas: \n");

		for (int i = 0; i < this.contHabitacion; i++) {
			Habitacion h = habitaciones[i];
			if (h.isOcupado()) {
				System.out.println("\t" + h.toString() + "\n");
			}
		}
	}

}
