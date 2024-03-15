package ejercicio1;

public class Factura {

	private static int CONTADOR_FACTURAS = 0;
	
	private int numeroFactura;
	private Cliente c;
	private DetalleFactura [] detalles;
	private int contDetalles;
	
	public Factura() {
		CONTADOR_FACTURAS++;
		this.numeroFactura = CONTADOR_FACTURAS;
		this.c = asignarCliente(c);
		this.detalles = new DetalleFactura [10];
		this.contDetalles = 0;
	}

	
	
	/**
	 * @return the numeroFactura
	 */
	public int getNumeroFactura() {
		return numeroFactura;
	}



	/**
	 * @param numeroFactura the numeroFactura to set
	 */
	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}



	/**
	 * @return the c
	 */
	public Cliente getC() {
		return c;
	}



	/**
	 * @param c the c to set
	 */
	public void setC(Cliente c) {
		this.c = c;
	}



	/**
	 * @return the detalles
	 */
	public DetalleFactura[] getDetalles() {
		return detalles;
	}



	/**
	 * @param detalles the detalles to set
	 */
	public void setDetalles(DetalleFactura[] detalles) {
		this.detalles = detalles;
	}



	/**
	 * @return the contDetalles
	 */
	public int getContDetalles() {
		return contDetalles;
	}



	/**
	 * @param contDetalles the contDetalles to set
	 */
	public void setContDetalles(int contDetalles) {
		this.contDetalles = contDetalles;
	}



	public Cliente asignarCliente(Cliente c) {
		this.c = c;
		return null;
	}
	
	public void insertarDetalle (Electrodomestico e, int cantidad) {
		
		DetalleFactura detalle = new DetalleFactura(e, cantidad);
		
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
	
	
	
	
}
