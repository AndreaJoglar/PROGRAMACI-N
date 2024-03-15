package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperacionesMatematicasTest {

	@Test
	void potenciaTest() {
		int esperado = 0; //introducimos el valor esperado
		int resultado = OperacionesMatematicas.potencia(0, 2); //indicamos qué queremos comprobar
		assertEquals(esperado, resultado); //compara que le resultado esperado y el obtenido es el mismo
	}
	
	@Test
	void potenciaTest2() {
		int esperado = 1; //introducimos el valor esperado
		int resultado = OperacionesMatematicas.potencia(2, 0); //indicamos qué queremos comprobar
		assertEquals(esperado, resultado); //compara que le resultado esperado y el obtenido es el mismo
	}
	
	@Test
	void potenciaTest3() {
		int esperado = 8; //introducimos el valor esperado
		int resultado = OperacionesMatematicas.potencia(2, 3); //indicamos qué queremos comprobar
		assertEquals(esperado, resultado); //compara que le resultado esperado y el obtenido es el mismo
	}

}
