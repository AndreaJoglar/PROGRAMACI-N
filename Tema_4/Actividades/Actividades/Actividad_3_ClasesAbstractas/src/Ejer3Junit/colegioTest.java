package Ejer3Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class colegioTest {

	@Test
	void testInsertarPersona() {
		Colegio colegio = new Colegio();
		assertTrue(colegio.numPersona() == 0);
		
		Direccion dir1=new Direccion("Calle1","ciudad1",33204,"españa");
		Alumno a1=new Alumno("1111", "alum1", "XXX", dir1);
		
		boolean resul = colegio.insertarPersona(a1);
		assertTrue(resul == true);
		assertTrue(colegio.numPersona() == 1);
		assertTrue(colegio.buscarPersona(a1.getNif()) != null);
		
		
		Alumno a2=new Alumno("2222", "alum2", "XXX", dir1);
		Alumno a3=new Alumno("3333", "alum3", "XXX", dir1);
		
		Profesor p1=new Profesor("111p", "prof1", "XXX", dir1, "Desp1");
		Profesor p2=new Profesor("222p", "prof2", "XXX", dir1, "Desp2");
		
		resul = colegio.insertarPersona(a2);
		assertTrue(resul == true);
		assertTrue(colegio.numPersona() == 2);
		
		resul = colegio.insertarPersona(a3);
		assertTrue(resul == true);
		assertTrue(colegio.numPersona() == 3);
		
		resul = colegio.insertarPersona(p1);
		assertTrue(resul == true);
		assertTrue(colegio.numPersona() == 4);
		
		resul = colegio.insertarPersona(p2);
		assertTrue(resul == true);
		assertTrue(colegio.numPersona() == 5);
		
		//incorrectas
		Alumno a4=new Alumno("3333", "alum4", "XXX", dir1);
		resul = colegio.insertarPersona(a4);
		assertTrue(resul == false);
		assertTrue(colegio.numPersona() == 5);
	}

	

	@Test
	void testBuscarPersona() {
		Colegio colegio = new Colegio();
		cargarDatos(colegio);
		
		Persona p = colegio.buscarPersona("3333");
		assertTrue(p != null);
		
		Persona p1 = colegio.buscarPersona("XXXX");
		assertTrue(p1 == null);
		
	}
	
	private static void cargarDatos(Colegio colegio) {
		Direccion dir1=new Direccion("Calle1","ciudad1",33204,"españa");
		Alumno a1=new Alumno("1111", "alum1", "XXX", dir1);
		Alumno a2=new Alumno("2222", "alum2", "XXX", dir1);
		Alumno a3=new Alumno("3333", "alum3", "XXX", dir1);
		
		Profesor p1=new Profesor("111p", "prof1", "XXX", dir1, "Desp1");
		Profesor p2=new Profesor("222p", "prof2", "XXX", dir1, "Desp2");
		
		colegio.insertarPersona(a1);
		colegio.insertarPersona(a2);
		colegio.insertarPersona(a3);
		
		colegio.insertarPersona(p1);
		colegio.insertarPersona(p2);
	}

}
