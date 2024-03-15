package ejercicio1;

public class Factura {

	private static int CONT_FACTURAS = 0;
	
	private int numFact;
	private Cliente c; 
	private DetalleFactura [] detalles;
	private int contDetalles;
	
	public Factura() {
		CONT_FACTURAS++;
		this.numFact = CONT_FACTURAS;
		this.detalles = new DetalleFactura[10];
		this.contDetalles = 0;
	}
	
	public void insertarCliente (Cliente c) {
		this.c = c;
	}
	
	/**
	 * Metodo para insertar detalles a la venta
	 * @param p Producto
	 * @param cantidad entero
	 */
	public void insertarDetalle(Producto p, int cantidad) {//composición
		DetalleFactura detalle = new DetalleFactura(p, cantidad);
		if (contDetalles < detalles.length) {
			detalles[contDetalles] = detalle;
			contDetalles++;
		}
	}
	
	public double calcularImporteTotal() {
		double total = 0.0;
		for (int i = 0; i < contDetalles; i++) {
			total += detalles[i].precioTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		String texto = "Factura: " + this.numFact + "\n";
		texto += c.toString() + "\n";
		for (int i = 0; i < contDetalles; i++) {
			texto += "\t" + detalles[i].toString() + "\n";
		}
		return texto;
	}
	
	
	
}
