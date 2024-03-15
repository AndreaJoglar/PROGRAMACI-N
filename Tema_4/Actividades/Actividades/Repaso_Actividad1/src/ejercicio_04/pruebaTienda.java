package ejercicio_04;

import java.util.Scanner;

public class pruebaTienda {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tienda t1 = new Tienda("Cuántica","Pepe", "xxxxxx", 4);
		Computador c1 = new Computador("Acer", 128, "Sin SO", 450.50);
		Computador c2 = new Computador("Acer", 1000, "Windows", 1450.50);
		Computador c3 = new Computador("HP", 512, "Windows", 1660.00);
		Computador c4 = new Computador("Lenovo", 512, "Sin SO", 950.50);
		
		t1.addComputador(c1);
		t1.addComputador(c2);
		t1.addComputador(c3);
		t1.addComputador(c4);
		
		t1.imprimir();
		//intentamos añadir un ordenador con la tienda llena
		Computador c5 = new Computador("XX", 100, "XXX", 0);
		t1.addComputador(c5);
		
		
		System.out.println("Buscar marca de ordenador: ");
		String marca = teclado.next();
		if(t1.buscar(marca) != -1) {
			System.out.println("El ordenador a buscar "+marca+" se encuentra en la posición "+t1.buscar(marca)+"\n");
			
			System.out.println(t1.getComputadores()[t1.buscar(marca)]+"\n");
		}
		else {
			System.out.println("ERROR. Ordenador no encontrado.");
		}
		
		System.out.println("Indica la marca del ordenador que quieras eliminar: ");
		marca = teclado.next();
		
		t1.eliminar(marca);
		
		t1.imprimir();
	}

}
