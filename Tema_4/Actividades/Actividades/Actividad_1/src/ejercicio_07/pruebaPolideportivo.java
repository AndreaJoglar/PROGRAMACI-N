package ejercicio_07;

public class pruebaPolideportivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polideportivo poli = new Polideportivo("poli1", "dir1", 100);
		
		poli.addPista(1, TipoPista.TENIS, true, 30, "20240110");
		poli.addPista(2, TipoPista.FUTBOL, false, 50, "20240111");
		poli.addPista(3, TipoPista.PADEL, true, 100, "20240112");
		poli.addPista(4, TipoPista.PATINAJE, false, 150, "20240113");
		
		System.out.println(poli.toString());
		
		Usuario u1 = new Usuario("Pepa", "Sánchez", "pepasan@gmail.com", "666000111", "93821234T", "19950612");
		Usuario u2 = new Usuario("Miguel", "Rosón", "miguelon@gmail.com", "666111222", "93821234T", "19950612");
		Usuario u3 = new Usuario("Lara", "Sánchez", "larita@gmail.com", "666000333", "93821234T", "19950612");
		
		Pista p0 = poli.getPista(0);
		
		Reserva r1 = new Reserva("20240110", "20240120", p0);
		r1.addUsuario(u1);
		r1.addUsuario(u2);
		
		System.out.println(r1.toString());
		
		/*
		//Imprimimos una sola pista en la posición 0 del polideportivo
		Pista p1 = poli.getPistas()[0];
		System.out.println(p1.toString());
		
		System.out.println("*************");
		//Imprimimos todo el contenido del polideportivo
		System.out.println(poli.toString());
		
		/*
		Reserva r1 = new Reserva("20240110", "20240120", p1);
		
		Usuario u1 = new Usuario("Pepa", "Sánchez", "pepasan@gmail.com", "666000111", "93821234T", "19950612");
		*/
	}

}
