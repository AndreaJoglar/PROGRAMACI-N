package ejercicio_03;

public class pruebaUniversidad {

	public static void main(String[] args) {

		Direccion dir1 = new Direccion("Calle1", "ciudad1", 11111, "Mali");
		Direccion dir2 = new Direccion("Calle2", "ciudad2", 22222, "Sudáfrica");
		Direccion dir3 = new Direccion("Calle3", "ciudad3", 22222, "Nigeria");
		Direccion dir4 = new Direccion("Calle4", "ciudad4", 22222, "Ghana");
		Direccion dir5 = new Direccion("Calle5", "ciudad5", 22222, "Marruecos");
		Direccion dir6 = new Direccion("Calle6", "ciudad6", 22222, "Cabo Verde");
		
		Persona [] p = new Persona [6];
		p[0] = new Alumno("11111", "Antonio", "Flores", dir1);
		p[1] = new Profesor("22222", "Pepa", "Flores", dir2, "despacho1");
		p[2] = new Alumno("33333", "Carlos", "Cano", dir3);
		p[3] = new Profesor("44444", "María", "Antonieta", dir4, "despacho1");
		p[4] = new Alumno("55555", "Antonio", "Vega", dir5);
		p[5] = new Profesor("66666", "Maruja", "Díaz", dir6, "despacho1");
		
		for (int i = 0; i < p.length; i++) {
			p[i].identificate();
		}
	}

}
