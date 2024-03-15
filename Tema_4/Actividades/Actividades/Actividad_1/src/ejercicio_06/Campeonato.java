package ejercicio_06;

import java.util.Arrays;

public class Campeonato {

	//Atributos
	private Partido partidos [];
	private int contPartidos;
	
	public Campeonato () {
		partidos = new Partido [10];
		contPartidos = 0;
	}
	
	
	//Como es composición, hacemos el partido en la clase Campeonato
	/**
	 * Constructor de campeonato
	 * @param resultado
	 * @param campos
	 * @param arbitro
	 * @param incidencias
	 * @param local
	 * @param visitante
	 */
	public void addPartido (String resultado, String campos, String arbitro, String incidencias, Equipo local, Equipo visitante) {
		if (contPartidos<partidos.length) {
			Partido nuevo = new Partido (resultado, campos, arbitro, local, visitante);
			int pos = contPartidos;
			partidos[pos] = nuevo;
			contPartidos++;
		}	
	}


	@Override
	public String toString() {
		return "Campeonato [partidos=" + Arrays.toString(partidos) + ", contPartidos=" + contPartidos + "]";
	}
	
	
}
