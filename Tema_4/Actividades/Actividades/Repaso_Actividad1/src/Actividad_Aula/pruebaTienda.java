package Actividad_Aula;

public class pruebaTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tienda t1 = new Tienda();
		
		Electrodomestico e1 = new Electrodomestico("id1", "Lavadora", "Fagor", 1000.50, true);
		Electrodomestico e2 = new Electrodomestico ("id2", "Frigorífico", "Fagor", 1900.0, false);
		Electrodomestico e3 = new Electrodomestico ("id3", "Congelador", "Teka", 800.0, true);
		Electrodomestico e4 = new Electrodomestico ("id4", "Congelador", "MGM", 800.0, false);
		Electrodomestico e5 = new Electrodomestico ("id5", "Lavadora", "Teka", 1200.0, true);
		Electrodomestico e6 = new Electrodomestico ("id6", "Congelador", "Fagor", 900.0, false);
		Electrodomestico e7 = new Electrodomestico ("id7", "Congelador", "Teka", 800.0, true);
		Electrodomestico e8 = new Electrodomestico ("id8", "Lavadora", "Teka", 800.0, false);
		Electrodomestico e9 = new Electrodomestico ("id9", "Nevera", "Teka", 1800.0, true);
		Electrodomestico e10 = new Electrodomestico ("id10", "Lavadora", "Bosch", 500.0, false);
		
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
		
		t1.listarElectrodomestico();
		
		//Un electrodomestico más (no entra)
		Electrodomestico e11 = new Electrodomestico("id11", "Congelador", "Teka", 2000, false);
		
		t1.nuevoElectrodomestico(e11);
		
		t1.borrarElectrodomestico("id4");
		
		t1.listarElectrodomestico();
		
		t1.stockTienda();
		
		t1.precioProducto("id9");
	}
	
	

}
