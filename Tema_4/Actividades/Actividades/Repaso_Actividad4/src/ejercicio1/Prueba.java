package ejercicio1;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico e = new Electrodomestico("Electro1", 110);
		
		System.out.println(e.toString());
		
		System.out.println("Precio con descuento: " + e.precioConDescuento(25));
		System.out.println("Precio con Iva: " + e.precioConIva(10));
		
		ElectrodomesticoConInstalacion ec = new ElectrodomesticoConInstalacion("Lavadora", 110, 20);
		
		System.out.println(ec.toString());
		System.out.println("Precio con Iva: " + ec.precioConIva(10));
		
	}

}
