package ejercicio_03;

public class pruebaEjer3 {

	public static void main(String[] args) {

		Direccion dir1 = new Direccion("Calle1", "Ciudad1", 33204, "España");
		
		Alumno a1 = new Alumno("1111", "Pepe", "XXXX", dir1);
		a1.identificate();
		
		Alumno a2 = new Alumno("2222", "Charo", "XXXX", dir1);
		a2.identificate();
		
		Alumno a3 = new Alumno("3333", "Marta", "XXXX", dir1);
		a3.identificate();
		
		//Probamos las veces que usamos el método en total.
		System.out.println("Contador de veces que se usa identifícate: " + a1.getContVeces());
		System.out.println("Contador de veces que se usa identifícate: " + a3.getContVeces());
		
		
	}

}
