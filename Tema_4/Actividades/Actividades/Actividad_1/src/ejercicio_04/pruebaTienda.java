package ejercicio_04;

import java.util.Scanner;

public class pruebaTienda {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Ordenador c1= new Ordenador ("HP", 512, "Windows", 800.0);
		Ordenador c2 = new Ordenador ("Asus", 128, "Linux", 450.0);
		Ordenador c3 = new Ordenador ("HP", 128, "Windows", 500.0);
		Ordenador c4 = new Ordenador ("Acer", 1000, "MacOs", 1500.0);
		Ordenador c5 = new Ordenador ("Lenovo", 512, "Windows", 830.0);
		Ordenador [] ordenadores = {c1, c2, c3, c4, c5};
		
		Tienda t1 = new Tienda ("TiendaPC", "María", "12001", ordenadores, 0);
		t1.addOrdenador(c1);
		t1.addOrdenador(c2);
		t1.addOrdenador(c3);
		t1.addOrdenador(c4);
		t1.addOrdenador(c5);
		
		System.out.println(t1.toString());
		
		
	}

}