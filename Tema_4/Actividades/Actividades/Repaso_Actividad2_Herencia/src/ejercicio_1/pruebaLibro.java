package ejercicio_1;

public class pruebaLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro [] libros = new Libro [6];
		libros[0] = new LibroTexto("titulo1", "autor1", 25.50, 1);
		libros[1] = new LibroTextoUniovi("titulo2", "autor2", 15.75, 3, "Filología");
		libros[2] = new Novela("novela1", "autor3", 20.00, TipoNovela.AVENTURAS);
		libros[3] = new LibroTexto("titulo3", "autor4", 22.50, 1);
		libros[4] = new LibroTextoUniovi("titulo4", "autor5", 19.75, 3, "Filología");
		libros[5] = new Novela("novela2", "autor6", 16.00, TipoNovela.POLICIACA);
		
		for (int i = 0; i < libros.length; i++) {
			System.out.println(libros[i]);
		}
	}

}
