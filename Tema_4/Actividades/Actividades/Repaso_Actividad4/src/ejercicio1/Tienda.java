package ejercicio1;

public class Tienda {
	private Electrodomestico [] electrodomesticos;
	private Factura [] facturas;
	private int contFacturas;
	
	public Tienda () {
		this.electrodomesticos = null;
		this.facturas = null;
	}
	
	public void insertarElectrodomestico (Electrodomestico e) {
		if (electrodomesticos == null) {
			electrodomesticos = new Electrodomestico [1];
			electrodomesticos[0] = e;
		}
		else {
			if (buscarReferencia(e.getReferencia()) != null) {
				System.out.println("No se puede insertar electrodomestico");
			}
			else {
				int nuevoTamanio = electrodomesticos.length + 1;
				Electrodomestico [] nuevoElectrodomesticos = new Electrodomestico [nuevoTamanio];
				
				for (int i = 0; i < electrodomesticos.length; i++) {
					nuevoElectrodomesticos[i] = electrodomesticos[i];
				}
				int pos = nuevoTamanio - 1;
				nuevoElectrodomesticos[pos] = e;
				electrodomesticos = nuevoElectrodomesticos;
			}
		}
	}
	
	public String listarElectrodomesticos() {
		String texto = "";
		for (int i = 0; i < electrodomesticos.length; i++) {
			texto += electrodomesticos[i].toString() + "\n";
		}
		return texto;
	}
	
	public Electrodomestico buscarReferencia (String referencia) {
		for (int i = 0; i < electrodomesticos.length; i++) {
			if(electrodomesticos[i].getReferencia().compareTo(referencia) == 0) {
				return electrodomesticos[i];
			}
		}
		return null;
	}
	
	public int buscarPosReferencia (String referencia) {
		int pos = -1;
		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i].getReferencia().compareTo(referencia) == 0) {
				pos = i;
			}
		}
		return pos;
	}
	
	
	public void insertarVenta (Factura factura) {
		if (facturas == null) {
			facturas = new Factura [1];
			facturas[0] = factura;
		}
		else {
			if (buscarFactura(factura.getNumeroFactura()) != null) {
				System.out.println("No se puede puede insertar la venta");
			}
			else {
				int nuevoTamanio = facturas.length + 1;
				Factura [] nuevaVenta = new Factura [nuevoTamanio];
				
				for (int i = 0; i < facturas.length; i++) {
					nuevaVenta[i] = facturas[i];
				}
				int pos = nuevoTamanio - 1;
				nuevaVenta[pos] = factura;
				facturas = nuevaVenta;
			}
		}
	}

	public Factura buscarFactura(int numeroFactura) {
		for (int i = 0; i < facturas.length; i++) {
			if (facturas[i].getNumeroFactura() == numeroFactura) {
				return facturas[i];
			}
		}
		return null;
	}
	
	public int buscarPosFactura (int numeroFactura) {
		int pos = -1;
		for (int i = 0; i < facturas.length; i++) {
			if (facturas[i].getNumeroFactura() == numeroFactura) {
				pos = i;
			}
		}
		return pos;
	}
	
	public void borrarElectrodomestico (String referencia) {
		int pos = buscarPosReferencia(referencia);
		if (pos != -1) {
			int nuevoTamanio = electrodomesticos.length - 1;
			
			Electrodomestico [] ventaNueva = new Electrodomestico [nuevoTamanio];
			
			for (int i = 0; i < pos; i++) {
				ventaNueva[i] = electrodomesticos[i];
			}
			for (int i = pos + 1; i < electrodomesticos.length; i++) {
				ventaNueva[i - 1] = electrodomesticos[i];
			}
			
			electrodomesticos = ventaNueva;
		}
	}
	
	public void borrarVenta (int numVenta) {
		int pos = buscarPosFactura(numVenta);
		if (pos != -1) {
			int nuevoTamanio = facturas.length - 1;
			
			Factura [] ventaNueva = new Factura [nuevoTamanio];
			
			for (int i = 0; i < pos; i++) {
				ventaNueva[i] = facturas[i];
			}
			for (int i = pos + 1; i < facturas.length; i++) {
				ventaNueva[i - 1] = facturas[i];
			}
			
			facturas = ventaNueva;
		}
	}
	
	public void hacerDevolucion (Electrodomestico e) {
		insertarElectrodomestico(e);
		borrarVenta(contFacturas);
	}
	
	
}
