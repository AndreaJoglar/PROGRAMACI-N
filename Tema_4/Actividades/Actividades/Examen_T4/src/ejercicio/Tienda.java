package ejercicio;

public class Tienda {

	private Producto [] productos;
	private Venta [] ventas;
	private int contProductos;
	private int contVentas;
	
	public Tienda() {
		this.productos = new Producto [10];
		this.contProductos = 0;
		this.ventas = new Venta[10];
		this.contVentas = 0;
	}
	
	public void añadirProducto (Producto p) { //agregación
		if (contProductos < productos.length) {
			productos[contProductos] = p;
			contProductos++;
		}
		else {
			System.out.println("Error. No hay sitio.");
		}
	}
	
	public void añadirVenta (Venta nueva) {
		if (contVentas < ventas.length) {
			ventas[contVentas] = nueva;
			contVentas++;
		}
	}
	
	public Producto buscarProducto (int cod) {
		for (int i = 0; i < contProductos; i++) {
			if (productos[i].getCod() == 0) {
				return productos[i];
			}
		}
		return null;
	}
	
	public String mostrarProductos () {
		String texto = "";
		for (int i = 0; i < contProductos; i++) {
			texto += productos[i].toString()+ "\n";
		}
		return texto;
	}
	
	public String mostrarVentas() {
		String texto = "";
		for (int i = 0; i < contVentas; i++) {
			texto += ventas[i].toString() + "\n";
		}
		return texto;
	}
	
	
}
