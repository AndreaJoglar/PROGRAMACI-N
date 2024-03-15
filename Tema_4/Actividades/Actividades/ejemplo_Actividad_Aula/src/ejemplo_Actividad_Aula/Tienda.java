package ejemplo_Actividad_Aula;

import java.util.Arrays;

public class Tienda {

	// Atributos
	private Electrodomestico[] electrodomesticos;
	private int contElementos;

	/**
	 * Constructor que no recibe parametros
	 */
	public Tienda() {
		this.electrodomesticos = new Electrodomestico[10];
		this.contElementos = 0;
	}

	/**
	 * Metodo get del vector Electrodomestico
	 * 
	 * @return electrodomesticos vector de Electrodomestico
	 */
	public Electrodomestico[] getElectrodomesticos() {
		return electrodomesticos;
	}

	/**
	 * Metodo set del vector Electrodomestico
	 * 
	 * @param electrodomesticos vector Electrodomestico
	 */
	public void setElectrodomesticos(Electrodomestico[] electrodomesticos) {
		this.electrodomesticos = electrodomesticos;
	}

	/**
	 * Metodo get del atributo contador de elementos
	 * 
	 * @return entero
	 */
	public int getContElementos() {
		return contElementos;
	}

	/**
	 * Metodo set del atributo contador de elementos
	 * 
	 * @param entero
	 */
	public void setContElementos(int contElementos) {
		this.contElementos = contElementos;
	}

	/**
	 * Metodo para agregar un nuevo electrodomestico a la tienda
	 * 
	 * @param e Electrodomestico
	 */
	public void nuevoElectrodomestico(Electrodomestico e) {
		if (contElementos < electrodomesticos.length) {
			electrodomesticos[contElementos] = e;
			contElementos++;
		} else {
			System.out.println("ERROR. No hay hueco.");
		}
	}

	/**
	 * Busca un electrodomestico en la tienda a partir de su id
	 * 
	 * @param id String
	 * @return entero
	 */
	public int buscarId(String id) {
		
		for (int i = 0; i < this.contElementos; i++) {
			Electrodomestico e = electrodomesticos[i];
			if (e.getId().compareTo(id) == 0) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Elimina un electrodomestico de la tienda a partir de su id
	 * 
	 * @param id String
	 */
	public void borrarElectrodomestico(String id) {
		int pos = buscarId(id);

		if ((pos != -1) && electrodomesticos[pos].isEnStock() == false) {
			for (int i = pos; i < this.contElementos - 1; i++) {
				electrodomesticos[i] = electrodomesticos[i + 1];
			}
			this.contElementos--;
		}

	}

	/**
	 * Muestra los electrodomesticos con stock en la tienda
	 */
	public void stockTienda() {
		String texto = "Electrodomésticos con stock:\n";

		for (int i = 0; i < this.contElementos; i++) {
			Electrodomestico e = electrodomesticos[i];
			if (e.isEnStock() == true) {
				texto += "\t" + e.toString() + "\n";
			}
		}
		
		System.out.println(texto);
	}
	
	public void precioElectrodomestico (String id) {
		int pos = buscarId(id);
		if (pos != -1) {
			System.out.println("Precio del electrodomestico = " + electrodomesticos[pos].getPrecio());
		}
	}

	@Override
	public String toString() {
		String texto = "Productos de la tienda:\n";

		for (int i = 0; i < contElementos; i++) {
			Electrodomestico e = electrodomesticos[i];
			texto += "\t" + e.toString() + "\n";
		}

		return texto;
	}

}
