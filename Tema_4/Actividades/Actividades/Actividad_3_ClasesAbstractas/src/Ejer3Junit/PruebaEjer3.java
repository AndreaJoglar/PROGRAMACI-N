package Ejer3Junit;

public class PruebaEjer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direccion dir1=new Direccion("Calle1","ciudad1",33204,"españa");
		Alumno a1=new Alumno("1111", "alum1", "XXX", dir1);
		a1.identificate();
		Alumno a2=new Alumno("2222", "alum2", "XXX", dir1);
		a2.identificate();
		Alumno a3=new Alumno("3333", "alum3", "XXX", dir1);
		a3.identificate();
		
		
		System.out.println("Veces" +a1.getContVeces());
		
		a1.identificate();
		a1.identificate();
		a3.identificate();
		a2.identificate();
		
		System.out.println("Veces a1:" +a1.getContVeces());
		System.out.println("Veces a3: " +a3.getContVeces());
		
	}

}
