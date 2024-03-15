/**
 * Clase Festival. Incluye los metodos que permiten inscribir artistas al festival, listarlos,
 * buscar la posicion en la que se encuentra un artista, retornar el artista buscado y borrar
 * el artista de la base de datos del festival
 */
package ejercicio;

import java.util.Scanner;

/**
 * @author Andrea Fernandez Joglar
 * @version 1.2
 */
public class Festival {
	static Scanner teclado = new Scanner(System.in);

	private Artista [] artistas;


	/**
	 * Constructor por defecto
	 */
	public Festival() {
		this.artistas = null;
	}
	
	/**
	 * Metodo usado en JUnit para comprobar que se introducen correctamente artistas en el vector
	 * @return entero
	 */
	public int numeroArtistas() {
		int numArtistas = -1;
		if (artistas == null) {
			numArtistas = 0;
		}
		else {
			numArtistas = artistas.length;
		}
		return numArtistas;
	}
	
	/**
	 * Metodo para inscribir artistas en el festival
	 * @param a Artista
	 * @return boolean
	 */
	public boolean inscribirArtista (Artista a) {
		boolean resultado = false;
		
		if (artistas == null) {
			artistas = new Artista [1];
			artistas[0] = a;
			resultado = true;
		}
		else {
			if (buscarArtista(a.getIdArtista()) != null) {
				resultado = false;
			}
			else {
				int nuevoTamanio = artistas.length + 1;
				Artista [] nuevoArtistas = new Artista [nuevoTamanio];
				
				for (int i = 0; i < artistas.length; i++) {
					nuevoArtistas[i] = artistas[i];
				}
				int pos = nuevoTamanio - 1;
				nuevoArtistas[pos] = a;
				artistas = nuevoArtistas;
				resultado = true;
			}
		}
		return resultado;
	}
	
	/**
	 * Metodo para mostrar los artistas que participan en el Festival
	 */
	public void listarFestival () {
		for (int i = 0; i < artistas.length; i++) {
			artistas[i].mostrarDisciplina();
		}
	}
	
	/**
	 * Metodo para buscar artistas dentro del festival a partir de su identificador
	 * @param id String
	 * @return Artista
	 */
	public Artista buscarArtista (String id) {
		Artista art1 = null;
		for (int i = 0; i < artistas.length; i++) {
			Artista a = artistas[i];
			if (a.getIdArtista().compareTo(id) == 0) {
				art1 = a;
			}
		}
		return art1;
	}
	
	/**
	 * Metodo que busca la posición en la que se encuentra un artista
	 * a partir de su id
	 * @param id String
	 * @return entero
	 */
	public int buscarPosArtista (String id) {
		int pos = -1;
		
		for (int i = 0; i < artistas.length; i++) {
			if(artistas[i].getIdArtista().compareTo(id) == 0) {
				pos = i;
			}
		}
		return pos;
	}
	
	/**
	 * Metodo para borrar un artista previamente inscrito en el festival
	 * @param id String 
	 * @return boolean
	 */
	public boolean borrarArtista (String id) {
		boolean encontrado = false;
		
		int posicion = buscarPosArtista(id);
		if (posicion == -1) {
			encontrado = false;
		}
		else {
			if(posicion != -1) {
				int nuevoTamanio = artistas.length - 1;
				
				Artista [] vNuevo = new Artista[nuevoTamanio];
				
				for (int i = 0; i < posicion; i++) {
					vNuevo[i] = artistas[i];
				}
				
				for (int i = posicion + 1; i < artistas.length; i++) {
					vNuevo[i-1] = artistas[i];
				}
				
				artistas = vNuevo;
				encontrado = true;
			}
		}
		
		return encontrado;
	}

	/**
	 * Metodo para actualizar el cache de un artista
	 * @param cache real
	 * @param a Artista
	 * @return real
	 */
	public double actualizarNuevoCache(double cache, Artista a) {
		a.setCache(cache);
		return a.getCache();
	}
	
}
