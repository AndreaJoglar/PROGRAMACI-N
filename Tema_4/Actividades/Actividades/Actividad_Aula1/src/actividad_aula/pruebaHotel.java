package actividad_aula;

/**
 * @author Andrea Fernandez Joglar
 * @version 1.2
 */

public class pruebaHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hotel h1 = new Hotel();
		
		Habitacion hab1 = new Habitacion("1", 1, "S", 50, false, false, null);
		
		Habitacion hab2 = new Habitacion("2", 2, "D", 70, true, false, null);
		
		Habitacion hab3 = new Habitacion("3", 3, "M", 60, false, true, null);
		
		Habitacion hab4 = new Habitacion("4", 4, "M", 60, true, true, null);
		
		Habitacion hab5 = new Habitacion("5", 4, "M", 60, true, true, null);
		
		Habitacion hab6 = new Habitacion("6", 4, "M", 60, false, true, null);
		
		Habitacion hab7 = new Habitacion("7", 4, "M", 60, true, true, null);
		
		Habitacion hab8 = new Habitacion("8", 4, "M", 60, true, true, null);
		
		Habitacion hab9 = new Habitacion("9", 4, "M", 60, false, true, null);
		
		Habitacion hab10 = new Habitacion("10", 4, "M", 60, true, true, null);
		
		Habitacion hab11 = new Habitacion("11", 4, "M", 60, true, true, null);
		
		//Añadimos habitaciones con el método nuevaHabitación
		h1.nuevaHabitacion(hab1);
		
		h1.nuevaHabitacion(hab2);
		
		h1.nuevaHabitacion(hab3);
		
		h1.nuevaHabitacion(hab4);
		
		h1.nuevaHabitacion(hab5);
		
		h1.nuevaHabitacion(hab6);
		
		h1.nuevaHabitacion(hab7);
		
		h1.nuevaHabitacion(hab8);
		
		h1.nuevaHabitacion(hab9);
		
		h1.nuevaHabitacion(hab10);
		
		//Mostramos las habitaciones del hotel para comprobar que funciona el método
		h1.listarHabitaciones();
		
		//Comprobamos que no se puede añadir otra habitación
		h1.nuevaHabitacion(hab11); 
		
		h1.listarHabitaciones();
		
		//Probamos el método borrarHabitacion
		h1.borrarHabitacion("3");
		
		//Comprobamos que se elimina la habitación
		h1.listarHabitaciones(); 
		
		//Comprobamos las habitaciones disponibles
		h1.habitacionesDisponibles();
		
		//Obtenemos el precio de una habitación a partir de su identificador
		h1.precioHabitacion("2");
		
		//Comprobamos el método para hacer una reserva
		h1.hacerReserva("1");
		
		//Debe mostrar que la habitación no está en el registro
		h1.hacerReserva("13");
		
		//Debe mostrar que la habitación no está disponible
		h1.hacerReserva("2");
		
		//Comprobamos que funciona
		h1.listarHabitaciones();
		
		h1.habitacionesReservadas();
			
	}

}
