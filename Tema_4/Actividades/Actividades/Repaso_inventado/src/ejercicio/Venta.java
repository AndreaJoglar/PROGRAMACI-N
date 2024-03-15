package ejercicio;


public class Venta {

	private static int CONT_VENTAS;
	
	private int idVenta;
	private Comprador comprador;
	private DetalleVenta [] detalle;
	
	public Venta() {
		CONT_VENTAS++;
		this.idVenta = CONT_VENTAS;
		this.comprador = insertarComprador(comprador);
		this.detalle = null;
	}
	
	/**
	 * @return the idVenta
	 */
	public int getIdVenta() {
		return idVenta;
	}

	/**
	 * @param idVenta the idVenta to set
	 */
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	/**
	 * @return the comprador
	 */
	public Comprador getComprador() {
		return comprador;
	}

	/**
	 * @param comprador the comprador to set
	 */
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	/**
	 * @return the detalle
	 */
	public DetalleVenta[] getDetalle() {
		return detalle;
	}

	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(DetalleVenta[] detalle) {
		this.detalle = detalle;
	}


	/**
	 * Metodo para ingresar compradores
	 * @param c Comprador 
	 * @return Comprador
	 */
	public Comprador insertarComprador(Comprador c) {
		this.comprador = c;
		return c;
	}
	
	/**
	 * Ingresa un nuevo detalle de venta a la venta
	 * @param d DetalleVenta
	 */
	public void ingresarDetalleVenta (DetalleVenta d) {
		if (detalle == null) {
			detalle = new DetalleVenta [1];
			detalle[0] = d;
		}
		else {
			int nuevoTamanio = detalle.length + 1;
			
			DetalleVenta [] nuevoDetalle = new DetalleVenta [nuevoTamanio];
			
			for (int i = 0; i < detalle.length; i++) {
				nuevoDetalle[i] = detalle[i];
			}
			
			int pos = nuevoTamanio - 1;
			nuevoDetalle[pos] = d;
			detalle = nuevoDetalle;
		}
	}
	
	/**
	 * Busca un producto en el detalle de Venta
	 * @param p Producto
	 * @return Producto
	 */
	public Producto buscarProducto(Producto p) {
		for (int i = 0; i < detalle.length; i++) {
			if (detalle[i].getProducto() == p) {
				return p;
			}
		}
		return null;
	}
	
	/**
	 * Busca la posicion de un producto
	 * @param p Producto
	 * @return entero
	 */
	public int buscarPosProductoDetalle (Producto p) {
		int pos = -1;
		for (int i = 0; i < detalle.length; i++) {
			if (detalle[i].getProducto() == p) {
				pos = i;
			}
		}
		return pos;
	}
	
	/**
	 * Devuelve un producto eliminandolo de la venta
	 * @param p Producto
	 */
	public void devolverProducto (Producto p) {
		int pos = buscarPosProductoDetalle(p);
		
		if (pos != -1) {
			int nuevoTamanio = detalle.length - 1;
			DetalleVenta [] nuevoDetalle = new DetalleVenta  [nuevoTamanio];
			
			for (int i = 0; i < pos; i++) {
				nuevoDetalle[i] = detalle[i];
			}
			for (int i = pos + 1; i < detalle.length; i++) {
				nuevoDetalle[i-1] = detalle[i];
			}
			detalle = nuevoDetalle;
		}
		
	}

	/**
	 * Calcula el importe total de la venta
	 * @return real
	 */
	public double importeTotal() {
		double total = 0.0;
		for (int i = 0; i < detalle.length; i++) {
			total += detalle[i].precioTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		String texto = "Venta: \n\tIDVenta: " + idVenta 
				+ "\n\tComprador: " + comprador + "\n";
		for (int i = 0; i < detalle.length; i++) {
			texto += detalle[i].toString();
		}
		texto += "\tPrecio Total: " + importeTotal();
		return texto;
	}
	
	
}
