package ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FestivalTest {

	@Test
	void testInscribirArtistaVectorVacio() {// comprueba que el festival está vacío al crearlo
		Festival festival = new Festival();
		assertTrue(festival.numeroArtistas() == 0);
	}

	@Test
	void testInscribirArtista2() {// comprueba que se inscriben correctamente artistas
		Festival festival = new Festival();
		Manager manager1 = new Manager("Carlos", "Bardial", "666111222",
										"funkto@gmail.com", "FunkTown Producciones");
		GrupoMusical gMusica1 = new GrupoMusical("Amaral", manager1, 22500,
													EstiloMusical.POP, true);

		boolean resultado = festival.inscribirArtista(gMusica1);
		assertTrue(resultado == true);
		assertTrue(festival.numeroArtistas() == 1);

		Manager manager2 = new Manager("Francesca", "Lombardi", "756221332",
										"latorre@gmail.com", "La Torre Productions");
		Manager manager3 = new Manager("Augusta", "Alhegro", "032111222",
										"alegria@gmail.com", "Prod Alegria");
		Manager manager4 = new Manager("Maurice", "Trouffeau", "142333111",
										"trionph@gmail.com", "Vic PD");
		Manager manager5 = new Manager("Hermann", "Kahlo", "345666777", 
										"hermann@gmail.com", "HeSse Jet");
		GrupoMusical gMusica2 = new GrupoMusical("Dover", manager1, 10000,
													EstiloMusical.ROCK, false);
		GrupoMusical gMusica3 = new GrupoMusical("Talco", manager2, 20800,
													EstiloMusical.PUNK, true);

		GrupoDanza gDanza1 = new GrupoDanza("Sambame", manager3, 5450,
												TipoDanza.TRADICIONAL, "Brasil");
		GrupoDanza gDanza2 = new GrupoDanza("DubHop", manager4, 3000,
												TipoDanza.URBANA, "Francia");
		GrupoDanza gDanza3 = new GrupoDanza("Black Swan", manager5, 26000,
												TipoDanza.CLASICA, "E.E.U.U.");

		resultado = festival.inscribirArtista(gMusica2);
		assertTrue(resultado == true);
		assertTrue(festival.numeroArtistas() == 2);
		assertFalse(festival.numeroArtistas() == 0);

		resultado = festival.inscribirArtista(gMusica3);

		assertTrue(resultado == true);
		assertTrue(festival.numeroArtistas() == 3);
		assertFalse(festival.numeroArtistas() == 2);

		resultado = festival.inscribirArtista(gDanza1);

		assertTrue(resultado == true);
		assertTrue(festival.numeroArtistas() == 4);
		assertFalse(festival.numeroArtistas() == 8);

		resultado = festival.inscribirArtista(gDanza2);

		assertTrue(resultado == true);
		assertTrue(festival.numeroArtistas() == 5);
		assertFalse(festival.numeroArtistas() == 23);

		resultado = festival.inscribirArtista(gDanza3);

		assertTrue(resultado == true);
		assertTrue(festival.numeroArtistas() == 6);
		assertFalse(festival.numeroArtistas() == 2);
	}

	@Test
	void testBorrarArtista() {
		Festival festival = new Festival();
		Manager manager1 = new Manager("Carlos", "Bardial", "666111222",
										"funkto@gmail.com", "FunkTown Producciones");
		GrupoMusical gMusica1 = new GrupoMusical("Amaral", manager1, 22500,
												EstiloMusical.POP, true);
		Manager manager2 = new Manager("Francesca", "Lombardi", "756221332", "latorre@gmail.com",
				"La Torre Productions");
		GrupoMusical gMusica2 = new GrupoMusical("Dover", manager2, 10000,
													EstiloMusical.ROCK, false);
		
		Manager manager3 = new Manager("Augusta", "Alhegro", "032111222",
										"alegria@gmail.com", "Prod Alegria");
		
		GrupoMusical gMusica3 = new GrupoMusical("Talco", manager3, 20800,
													EstiloMusical.PUNK, true);
		festival.inscribirArtista(gMusica1);
		festival.inscribirArtista(gMusica2);
		festival.inscribirArtista(gMusica3);
		
		String id1 = gMusica1.getIdArtista();
		
		boolean resultado = festival.borrarArtista(id1);
		assertTrue(resultado == true);
		assertTrue(festival.numeroArtistas() == 2);
		assertFalse(festival.numeroArtistas() == 5);
		
		String id2 = gMusica2.getIdArtista();
		
		resultado = festival.borrarArtista(id2);
		assertTrue(resultado == true);
		assertTrue(festival.numeroArtistas() == 1);
		assertFalse(festival.numeroArtistas() == 26);
		
		String id3 = gMusica3.getIdArtista();
		
		resultado = festival.borrarArtista(id3);
		assertTrue(resultado == true);
		assertTrue(festival.numeroArtistas() == 0);
		assertFalse(festival.numeroArtistas() == -7);
		}
	
	@Test 
	void testBuscarArtista() {
		Festival festival = new Festival();
		Manager manager1 = new Manager("Carlos", "Bardial", "666111222",
										"funkto@gmail.com", "FunkTown Producciones");
		GrupoMusical gMusica1 = new GrupoMusical("Amaral", manager1, 22500,
												EstiloMusical.POP, true);
		Manager manager2 = new Manager("Francesca", "Lombardi", "756221332", "latorre@gmail.com",
				"La Torre Productions");
		GrupoMusical gMusica2 = new GrupoMusical("Dover", manager2, 10000,
													EstiloMusical.ROCK, false);
		
		Manager manager3 = new Manager("Augusta", "Alhegro", "032111222",
										"alegria@gmail.com", "Prod Alegria");
		
		GrupoMusical gMusica3 = new GrupoMusical("Talco", manager3, 20800,
													EstiloMusical.PUNK, true);
		festival.inscribirArtista(gMusica1);
		festival.inscribirArtista(gMusica2);
		festival.inscribirArtista(gMusica3);
		
		String id1 = gMusica1.getIdArtista();
		
		Artista resultado = festival.buscarArtista(id1);
		assertEquals(resultado, gMusica1);
		
		Artista resultadoFalso = festival.buscarArtista("VR14T");
		assertEquals(resultadoFalso, null);
		
		resultadoFalso = festival.buscarArtista("");
		assertEquals(resultadoFalso, null);		
	}
	
	@Test void testActualizarCache() { 
		Festival festival = new Festival();
		Manager manager1 = new Manager("Carlos", "Bardial", "666111222",
										"funkto@gmail.com", "FunkTown Producciones");
		GrupoMusical gMusica1 = new GrupoMusical("Amaral", manager1, 22500,
												EstiloMusical.POP, true);
		
		festival.inscribirArtista(gMusica1);
		festival.actualizarNuevoCache(13000, gMusica1);
		
		double resultado = gMusica1.getCache();
		
		assertTrue(resultado == 13000);
		assertFalse(resultado == 5000);
		
		
	}
	
	

	/*
	 *  }
	 * 
	 * 
	 * 
	 * public static void cargarDatos (Festival festival) { Manager manager1 = new
	 * Manager("Carlos", "Bardial", "666111222", "funkto@gmail.com",
	 * "FunkTown Producciones"); Manager manager2 = new Manager("Francesca",
	 * "Lombardi", "756221332", "latorre@gmail.com", "La Torre Productions");
	 * Manager manager3 = new Manager("Augusta", "Alhegro", "032111222",
	 * "alegria@gmail.com", "Prod Alegria"); Manager manager4 = new
	 * Manager("Maurice", "Trouffeau", "142333111", "trionph@gmail.com", "Vic PD");
	 * Manager manager5 = new Manager("Hermann", "Kahlo", "345666777",
	 * "hermann@gmail.com", "HeSse Jet");
	 * 
	 * 
	 * GrupoMusical gMusica1 = new GrupoMusical("Amaral", manager1, 22500,
	 * EstiloMusical.POP, true); GrupoMusical gMusica2 = new GrupoMusical("Dover",
	 * manager1, 10000, EstiloMusical.ROCK, false); GrupoMusical gMusica3 = new
	 * GrupoMusical("Talco", manager2, 20800, EstiloMusical.PUNK, true);
	 * 
	 * GrupoDanza gDanza1 = new GrupoDanza("Sambame", manager3, 5450,
	 * TipoDanza.TRADICIONAL, "Brasil"); GrupoDanza gDanza2 = new
	 * GrupoDanza("DubHop", manager4, 3000, TipoDanza.URBANA, "Francia"); GrupoDanza
	 * gDanza3 = new GrupoDanza("Black Swan", manager5, 26000, TipoDanza.CLASICA,
	 * "E.E.U.U.");
	 * 
	 * festival.inscribirArtista(gMusica1); festival.inscribirArtista(gMusica2);
	 * festival.inscribirArtista(gMusica3); festival.inscribirArtista(gDanza1);
	 * festival.inscribirArtista(gDanza2); festival.inscribirArtista(gDanza3); }
	 */
}
