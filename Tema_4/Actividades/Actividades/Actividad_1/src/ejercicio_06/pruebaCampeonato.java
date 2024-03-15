package ejercicio_06;

public class pruebaCampeonato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Participante p1 = new Participante("P1", "Apellido1", 20, "Direccion1","1111" );
		 *Participante p2 = new Participante("P2", "Apellido2", 20, "Direccion1","1111" );
		 *Participante p3 = new Participante("P3", "Apellido3", 20, "Direccion1","1111" );
		 *Participante p4 = new Participante("P4", "Apellido4", 20, "Direccion1","1111" );
		 *Participante p5 = new Participante("P5", "Apellido5", 20, "Direccion1","1111" );
		 *Participante p6 = new Participante("P6", "Apellido6", 20, "Direccion1","1111" );
		 *Participante p7 = new Participante("P7", "Apellido7", 20, "Direccion1","1111" );
		 *Participante p8 = new Participante("P8", "Apellido8", 20, "Direccion1","1111" );
		 *Participante p9 = new Participante("P9", "Apellido9", 20, "Direccion1","1111" );
		 *Participante p10 = new Participante("P10", "Apellido10", 20, "Direccion1","1111" );
		 */
		
		Equipo e = new Equipo("Sporting", "Central Lechera", "rojo", "blanco", "Primera");
		
		//Podemos usar un bucle para crear más rápido, pero es preferible hacerlo uno a uno.
		for (int i = 1; i <= 10; i++) {
			String nombre = "p"+i;
			String apellidos = "ape"+i;
			int edad = 18+i;
			String direccion = "Direccion"+i;
			String telefono = "00000"+i;
			
			Participante p = new Participante(nombre, apellidos, edad, direccion, telefono);
			e.addParticipante(p);
		}
		
		System.out.println(e.toString());
		
		Equipo e2 = new Equipo("Oviedo", "Alimerka", "azul", "blanco", "Primera");
		//añadir participante. Como es agregación, hacemos el new en el main
		Participante j1 = new Participante("P1", "Apellido1", 20, "Direccion1","1111" );
		Participante j2 = new Participante("P2", "Apellido2", 20, "Direccion1","1111" );
		Participante j3 = new Participante("P3", "Apellido3", 20, "Direccion1","1111" );
		Participante j4 = new Participante("P4", "Apellido4", 20, "Direccion1","1111" );
		Participante j5 = new Participante("P5", "Apellido5", 20, "Direccion1","1111" );
		Participante j6 = new Participante("P6", "Apellido6", 20, "Direccion1","1111" );
		Participante j7 = new Participante("P7", "Apellido7", 20, "Direccion1","1111" );
		Participante j8 = new Participante("P8", "Apellido8", 20, "Direccion1","1111" );
		Participante j9 = new Participante("P9", "Apellido9", 20, "Direccion1","1111" );
		Participante j10 = new Participante("P10", "Apellido10", 20, "Direccion1","1111" );
		
		e2.addParticipante(j1);
		e2.addParticipante(j2);
		e2.addParticipante(j3);
		e2.addParticipante(j4);
		e2.addParticipante(j5);
		e2.addParticipante(j6);
		e2.addParticipante(j7);
		e2.addParticipante(j8);
		e2.addParticipante(j9);
		e2.addParticipante(j10);
		
		System.out.println();
		System.out.println(e2.toString());
		
		//Creamos el partido para probar
		System.out.println("\nPartido\n");
		Partido p = new Partido("1-0", "camp", "paco", e, e2);
		System.out.println(p.toString());
		
		
		Campeonato c1 = new Campeonato();
		c1.addPartido("1-0", "camp1","Paco","", e, e2);
		
		
		
		
		
		
		
	}

}
