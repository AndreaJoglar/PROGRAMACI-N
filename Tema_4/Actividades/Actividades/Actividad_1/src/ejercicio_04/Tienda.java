package ejercicio_04;

import java.util.Arrays;

public class Tienda {
	
	//Atributo 
	private String nombre;
	private String propietario;
	private String idTienda;
	private Ordenador [] vOrdenador;
	private int numOrdenadores;
	
	
	/**
	 * Constructor que recibe todos los parametros
	 * @param nombre String
	 * @param propietario String
	 * @param idTienda String
	 * @param vOrdenador vector de ordenadores
	 */
	public Tienda(String nombre, String propietario, String idTienda, Ordenador[] vOrdenador, int numOrdenadores) {
		this.nombre = nombre;
		this.propietario = propietario;
		this.idTienda = idTienda;
		this.vOrdenador = new Ordenador [5];
		this.numOrdenadores = 0;
	}

	/**
	 * Metodo get del atributo ordenador
	 * @return vector de Ordenador
	 */
	public Ordenador[] getvOrdenador() {
		return vOrdenador;
	}
	
	/**
	 * Metodo set del atributo ordenador
	 * @param listaOrdenador vector de Ordenador
	 */
	public void setListaOrdenador(Ordenador[] listaOrdenador) {
		this.vOrdenador = listaOrdenador;
	}
	
	/**
	 * Metodo get del atributo nombre
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo get del atributo propietario
	 * @return String
	 */
	public String getPropietario() {
		return propietario;
	}
	
	/**
	 * Metodo get del atributo tienda
	 * @return String
	 */
	public String getIdTienda() {
		return idTienda;
	}
	
	/**
	 * Metodo get del atributo numero de ordenadores
	 * @return entero
	 */
	public int getNumOrdenadores() {
		return numOrdenadores;
	}

	/**
	 * Metodo set del atributo numero de ordenadores
	 * @param numOrdenadores
	 */
	public void setNumOrdenadores(int numOrdenadores) {
		this.numOrdenadores = numOrdenadores;
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", propietario=" + propietario + ", idTienda=" + idTienda + ", vOrdenador="
				+ Arrays.toString(vOrdenador) + "]";
	}
	
	/**
	 * Metodo para determinar si la tienda esta llena
	 * @return boolean
	 */
	public boolean tiendaLlena() {
		if (numOrdenadores ==vOrdenador.length) return true;
		return false;
	}
	
	
	/**
	 * Metodo que añade ordenadores a la tienda
	 * @param c Ordenador
	 */
	public void addOrdenador (Ordenador c) {
		if (tiendaLlena()) {
			System.out.println("No se puenden añadir ordenadores.");
		}
		else {
			vOrdenador[numOrdenadores]=c;
			numOrdenadores++;
		}
	}
	/*
	public int buscarMarca (String marca) {
		for (int i = 0; i < vOrdenador.length; i++) {
			if (vOrdenador[i])
		}
		
	*/
		
		
	
	
	
}
