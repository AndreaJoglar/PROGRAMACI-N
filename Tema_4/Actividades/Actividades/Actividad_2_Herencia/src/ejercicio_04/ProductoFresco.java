package ejercicio_04;

public class ProductoFresco extends Producto {

	public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tProducto fresco";
	}

	
}