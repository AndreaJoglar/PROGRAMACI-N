package ejercicio_08;

public class pruebaColegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno("111", "exp1", "nombre1", "apellidos1", "XXX", "XXX", "XXX");
		System.out.println(a1.toString());
		Alumno a2 = new Alumno("222", "exp2", "nombre2", "apellidos2", "XXX", "XXX", "XXX");
		System.out.println(a2.toString());
		a1.addCompaniero(a2);
		a2.addCompaniero(a1);
		System.out.println("Después de añadir compañero");
		System.out.println(a1.toString());
		
		
		Profesor p1 = new Profesor("prof1", "ap1", "Domicilio1", "email1");
		Profesor p2 = new Profesor("prof2", "ap2", "Domicilio2", "email2");
		Profesor p3 = new Profesor("prof3", "ap3", "Domicilio3", "email3");
		
		Asignatura asig1 = new Asignatura("asig1", 120);
		asig1.setProfesor(p1);
		System.out.println(asig1.toString());
		
		Asignatura asig2 = new Asignatura("asig2", 200, p2);
		System.out.println(asig2.toString());
		
	}

}
