package hotelInventada;

public class pruebaHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hotel h1 = new Hotel();
		
		h1.addHabitacion(1, "Cerezo", TipoHabitacion.DOBLE, "primera", 100, true);
		h1.addHabitacion(2, "Roble", TipoHabitacion.INDIVIDUAL, "segunda", 50.50, false);
		
		h1.listarHotel();
		
		h1.reservarHabitacion(1);
		
		h1.listarHotel();
		
	}

}
