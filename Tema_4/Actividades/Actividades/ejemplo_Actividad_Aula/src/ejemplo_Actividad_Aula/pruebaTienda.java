package ejemplo_Actividad_Aula;

public class pruebaTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico e1 = new Electrodomestico ("id1", "Lavadora", "Bosch", 900.0, true);
		Electrodomestico e2 = new Electrodomestico ("id2", "Frigorífico", "Fagor", 1900.0, false);
		Electrodomestico e3 = new Electrodomestico ("id3", "Congelador", "Teka", 800.0, true);
		Electrodomestico e4 = new Electrodomestico ("id4", "Congelador", "MGM", 800.0, false);
		Electrodomestico e5 = new Electrodomestico ("id5", "Lavadora", "Teka", 1200.0, true);
		Electrodomestico e6 = new Electrodomestico ("id6", "Congelador", "Fagor", 900.0, false);
		Electrodomestico e7 = new Electrodomestico ("id7", "Congelador", "Teka", 800.0, true);
		Electrodomestico e8 = new Electrodomestico ("id8", "Lavadora", "Teka", 800.0, false);
		Electrodomestico e9 = new Electrodomestico ("id9", "Nevera", "Teka", 1800.0, true);
		Electrodomestico e10 = new Electrodomestico ("id10", "Lavadora", "Bosch", 500.0, false);
		
		Electrodomestico e11 = new Electrodomestico ("id11", "Congelador", "Teka", 800.0, true);
		
		Tienda t1 = new Tienda();
		
		t1.nuevoElectrodomestico(e1);
		t1.nuevoElectrodomestico(e2);
		t1.nuevoElectrodomestico(e3);
		t1.nuevoElectrodomestico(e4);
		t1.nuevoElectrodomestico(e5);
		t1.nuevoElectrodomestico(e6);
		t1.nuevoElectrodomestico(e7);
		t1.nuevoElectrodomestico(e8);
		t1.nuevoElectrodomestico(e9);
		t1.nuevoElectrodomestico(e10);
		
		System.out.println(t1.toString());
		
		//Intentamos añadir otro electrodoméstico con la tienda completa
		
		t1.nuevoElectrodomestico(e11);
		
		//prueba borrar electrodomestico sin stock
		t1.borrarElectrodomestico(e4.getId());
		
		System.out.println("Actualización tienda: ");
		System.out.println(t1.toString());
		
		//prueba borrar electrodomestico con stock
		t1.borrarElectrodomestico(e3.getId());
		
		System.out.println("Actualización tienda: ");
		System.out.println(t1.toString());
		
		t1.stockTienda();
		
		t1.precioElectrodomestico(e10.getId());
		
		
	}

}
