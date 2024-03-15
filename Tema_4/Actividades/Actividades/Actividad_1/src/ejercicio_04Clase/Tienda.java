package ejercicio_04Clase;

import java.util.Arrays;

public class Tienda {
	
	private String nombre;
	private String propietario;
	private int numeroTributario;
	private Computador v [];
	private int numeroComputadores;
	
	/**
	 * 
	 * @param nombre
	 * @param propietario
	 * @param numeroTributario
	 */
	public Tienda(String nombre, String propietario, int numeroTributario, int tam) {//La variable tam la necesitamos para construir el atributo vector de Computadores
		this.nombre = nombre;
		this.propietario = propietario;
		this.numeroTributario = numeroTributario;
		v = new Computador [tam];
		this.numeroComputadores = 0;
	}
	
	/**
	 * Comprueba si la tienda esta llena
	 * @return boolean
	 */
	public boolean tiendaLlena() {
		if (this.numeroComputadores == v.length) return true;
		return false;
	}
	
	/**
	 * Comprueba si la tienda esta vacia
	 * @return boolean
	 */
	public boolean tiendaVacia() {
		if (this.numeroComputadores == 0) return true;
		return false;
	}
	
	/**
	 * Agrega ordenadores a la tienda
	 * @param c Computador
	 */
	public void addComputador (Computador c) {
		if (this.tiendaLlena()==false) {
			//añadimos en la primera posición vacía
			int posVacia = this.numeroComputadores;
			v[posVacia]=c;
			this.numeroComputadores++;
		}
		else {
			System.out.println("Error. La tienda está llena.");
		}
	}
	
	/**
	 * Imprime informacion del vector
	 */
	public void imprimir() {
		String texto ="Tienda [nombre=" + nombre + ", propietario=" + propietario + ", numeroTributario=" + numeroTributario
		+ ", numeroComputadores=" + numeroComputadores + "]\n";
		
		for (int i = 0; i < this.numeroComputadores; i++) {//es importante el limite numeroComputadores, para que recorra solo las posiciones del vector ocupadas por ordenadores y no caiga el sistema (nullpointer)
			Computador c = v[i];
			texto +="\t"+c.toString()+"\n";
		}
		System.out.println(texto);
	}

	/**
	 * Retorna la posicion del ordenador con marca igual al parametros
	 * @param marca String
	 * @return entero
	 */
	public int buscar (String marca) {
		for (int i = 0; i < this.numeroComputadores; i++) {
			Computador c=v[i];
			if (c.getMarca().compareTo(marca)==0) {
				return i;
			}
		}
		return -1; //indica error de posición. No encuentra ordenador.
	}
	
	
	/**
	 * Elimina ordenadores de la tienda a partir de su marca
	 * @param marca String
	 */
	public void eliminar (String marca) {
		int pos = buscar(marca);
		if (pos!=-1) {
			for (int i = pos; i < this.numeroComputadores-1; i++) {
				v[i]= v[i+1];
			}
			this.numeroComputadores--;
		}

	}
	
	

}
