package ejercicio_3;

public class pruebaUniversidad {

	public static void main(String[] args) {

		Direccion dir1 = new Direccion("dir1", "ciudad1", 1111, "pais1");
		Direccion dir2 = new Direccion("dir2", "ciudad2", 2222, "pais2");
		Direccion dir3 = new Direccion("dir3", "ciudad3", 3333, "pais3");
		Direccion dir4 = new Direccion("dir4", "ciudad4", 4444, "pais4");
		
		Persona [] personas = new Persona [4];
		personas[0] = new Estudiante("nombre1", "apellidos1", "1111111", dir1, 1);
		personas[1] = new Profesor("Profesor1", "apellido2", "222222", dir2, 11);
		personas[2] = new Estudiante("nombre3", "apellidos3", "3333333", dir3, 3);
		personas[3] = new Profesor("Profesor2", "apellido4", "4444444", dir4, 12);
		
		for (int i = 0; i < personas.length; i++) {
			personas[i].identificate();
			System.out.println(personas[i].toString());
		}
		
		
	}

}
