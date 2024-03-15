package ejercicio_01;

public class pruebaLibro {

	public static void main(String[] args) {

		Libro l1 = new Libro("libro1", "autor1");
		l1.setPrecio(100);
		
		System.out.println(l1.toString());
		
		System.out.println("Precio con 12 % de iva " + l1.precioConIva(12));
		System.out.println("***********************************************");
		
		LibroTexto lt1 = new LibroTexto("lt1", "autorT", 4);
		lt1.setPrecio(200);
		
		System.out.println(lt1.toString());
		//el libro de texto hereda también los métodos que tiene especificados el padre
		System.out.println("Precio con iva del 10 % " + lt1.precioConIva(10));
		System.out.println("***********************************************");
		
		LibroUniovi lf1 = new LibroUniovi("Titulo1", "Autor1", 1, "Informática");
		
		lf1.setPrecio(200);
		
		System.out.println(lf1.toString());
		
		System.out.println(lf1.precioConIva(5));
		
		System.out.println("***********************************************");
		
		Novela n = new Novela("Novela1", "Autor1", TipoNovela.AVENTURAS);
		n.setPrecio(25);
		System.out.println(n.toString());
		
	}

}
