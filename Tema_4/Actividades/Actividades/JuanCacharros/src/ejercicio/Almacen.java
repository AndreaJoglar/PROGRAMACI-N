package ejercicio;

import java.util.Arrays;

public class Almacen {

	private Producto [] productos;

	/**
	 * Constructor con parametros
	 * @param productos
	 */
	public Almacen() {
		this.productos = new Producto [200];
	}
	
	
	
	/**
	 * Metodo para llenar el almacen con productos aleatorios
	 */
	public void llenarAlmacen() {
		Producto almacen [] = this.productos;
		
		int contLeche = 0;
		int contHuevos = 0;
		int contDvd = 0;
		int contCd = 0;
		int contImpresora = 0;
		int contTv = 0;
		
		for (int i = 0; i < almacen.length; i++) {
			int productoAleatorio = (int) (Math.random()*9);
			
			if (productoAleatorio == 0) {
				if (contLeche < 50) {
					almacen[i] = new Producto(i, (int) (Math.random()*12 + 1), "Leche de soja", true);
					contLeche++;
				}
				else {
					i--;
				}
			
			}
			else if (productoAleatorio == 1) {
				if (contHuevos < 50) {
					almacen[i] = new Producto(i, (int) (Math.random()*12 + 1), "Huevos avestruz", false);
					contHuevos++;
				}
				else {
					i--;
				}
				
			}
			else if (productoAleatorio == 2) {
				if (contDvd < 50) {
					almacen[i] = new Producto(i, 0, "DVD", true);
					contDvd++;
				}
				else {
					i--;
				}
				
			}
			else if (productoAleatorio == 3) {
				if (contDvd < 50) {
					almacen[i] = new Producto(i, 0, "DVD", false);
					contDvd++;
				}
				else {
					i--;
				}
				
			}
			else if (productoAleatorio == 4) {
				if (contCd < 50) {
					almacen[i] = new Producto(i, 0, "CD", true);
					contCd++;
				}
				else {
					i--;
				}
				
			}
			else if (productoAleatorio == 5) {
				if (contCd < 50) {
					almacen[i] = new Producto(i, 0, "CD", false);
					contCd++;
				}
				else {
					i--;
				}
				
			}
			else if (productoAleatorio == 6) {
				if (contImpresora < 50) {
					almacen[i] = new Producto(i, 0, "Impresora", true);
					contImpresora++;
				}
				else {
					i--;
				}
				
			}
			else if (productoAleatorio == 7) {
				if (contImpresora < 50) {
					almacen[i] = new Producto(i, 0, "Impresora", false);
					contImpresora++;
				}
				else {
					i--;
				}
				
			}
			else if (productoAleatorio == 8) {
				if (contTv < 50) {
					almacen[i] = new Producto(i, 0, "TV", true);
					contTv++;
				}
				else {
					i--;
				}
					
			}
			else {
				if (contTv < 50) {
					almacen[i] = new Producto(i, 0, "TV", false);
					contTv++;
				}
				else {
					i--;
				}
			}
		}
		int suma = contLeche+contHuevos+contDvd+contCd
				+contImpresora+contTv;
		System.out.println("Leche de soja: " + contLeche
							+ "\nHuevos de avestruz: " + contHuevos
							+ "\nDVD: " + contDvd
							+ "\nCD: " + contCd
							+ "\nImpresora: " + contImpresora
							+ "\nTV: " + contTv + "\nSuma: " + suma);
	
	}

	@Override
	public String toString() {
		return "Almacen productos:\n" + Arrays.toString(productos) + "]";
	}
	
	
	
	
}
