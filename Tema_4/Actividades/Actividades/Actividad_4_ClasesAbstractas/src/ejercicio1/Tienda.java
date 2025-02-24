package ejercicio1;

public class Tienda {

	private Producto [] productos;
	private int contProductos;
	private Factura facturas[];
	private int contFacturas;
	
	/**
	 * Constructor por defecto
	 */
	public Tienda() {
		productos = new Producto [10];
		contProductos = 0;
		facturas = new Factura[10];
		contFacturas = 0;
	}
	
	/**
	 * Metodo para insertar productos en la tienda
	 * @param p
	 */
	public void insertarProducto (Producto p) { //agregación
		if (contProductos < productos.length) {
			productos[contProductos] = p;
			contProductos++;
		}
		else {
			System.out.println("Error. No hay sitio.");
		}
	}
	
	public String listarProductos() {
		String texto = "";
		for (int i = 0; i < contProductos; i++) {
			texto += productos[i].toString()+ "\n";
		}
		return texto;
	}

	public Producto buscarReferencia(String referenciaParametro) {
		for (int i = 0; i < contProductos; i++) {
			if (productos[i].referencia.compareTo(referenciaParametro) == 0) {
				return productos[i];
			}
		}
		return null;
	}

	public void insertarVenta(Factura nueva) {
		if (contFacturas < facturas.length) {
			facturas[contFacturas] = nueva;
			contFacturas++;
		}
	}
	
	public String listarVentas() {
		String texto = "";
		for (int i = 0; i < contFacturas; i++) {
			texto += facturas[i].toString() + "\n";
		}
		return texto;
	}
	

}
