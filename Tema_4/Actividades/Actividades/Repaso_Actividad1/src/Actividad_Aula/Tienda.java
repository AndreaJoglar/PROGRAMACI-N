package Actividad_Aula;

public class Tienda {

	private Electrodomestico [] electrodomesticos;
	private int numElectrodomestico;
	
	/**
	 * Constructor de la clase Tienda
	 */
	public Tienda() {
		this.electrodomesticos = new Electrodomestico [10];
		this.numElectrodomestico = 0;
	}
	
	/**
	 * Permite agregar electrodomesticos a la tienda
	 * @param e Electrodomestico
	 */
	public void nuevoElectrodomestico (Electrodomestico e) {
		if (this.numElectrodomestico < this.electrodomesticos.length) {
			electrodomesticos[numElectrodomestico] = e;
			this.numElectrodomestico++;
		}
		else {
			System.out.println("Tienda llena. No se pueden añadir más electrodomésticos.");
		}
	}
	
	/**
	 * Muestra los electrodomesticos de la tienda
	 */
	public void listarElectrodomestico () {
		System.out.println("\nElectrodomesticos de la tienda: ");
		
		for (int i = 0; i < this.numElectrodomestico; i++) {
			Electrodomestico e = electrodomesticos[i];
			System.out.println("\t" + e.toString());
		}
	}
	
	/**
	 * Borra un electrodomestico de la tienda
	 * @param identificador String
	 */
	public void borrarElectrodomestico (String identificador) {
		for (int i = 0; i < numElectrodomestico; i++) {
			Electrodomestico e = electrodomesticos[i];
			if ((e.getIdentificador() == identificador) && (e.isEnStock() == false)) {
				for (int j = i; j < numElectrodomestico-1; j++) {
					electrodomesticos[j] = electrodomesticos[j+1];
				}
				numElectrodomestico--;
			}
		}
	}
	
	/**
	 * Muestra por pantalla el stock de la tienda
	 */
	public void stockTienda () {
		System.out.println("\nProductos en stock: ");
		for (int i = 0; i < numElectrodomestico; i++) {
			Electrodomestico e = electrodomesticos[i];
			if (e.isEnStock() == true) {
				System.out.println("\t" + e.toString());
			}
		}
	}
	
	public void precioProducto(String identificador) {
		for (int i = 0; i < numElectrodomestico; i++) {
			Electrodomestico e = electrodomesticos[i];
			if (e.getIdentificador() == identificador) {
				System.out.println("Precio del producto: \n" + e.getPrecio()+ " €");
			}
		}
	}
	
}
