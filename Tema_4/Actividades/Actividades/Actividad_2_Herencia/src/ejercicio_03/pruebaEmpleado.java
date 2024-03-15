package ejercicio_03;

public class pruebaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e1 = new Empleado("Rafa");
		Directivo d1 = new Directivo("Mario");
		Operario op1 = new Operario("Alfonso");
		Oficial of1 = new Oficial("Luis");
		Tecnico t1 = new Tecnico("Pablo");
		
		System.out.println(e1);
		System.out.println(d1);;
		System.out.println(op1);
		System.out.println(of1);
		System.out.println(t1);

		/*Método .equals compara si dos elementos son iguales
		 * Ej:
		 * Empleado E1 = new Empleado ("Rafa");
		 * Empleado E2 = new Empeado ("Rafa");
		 * System.out.println (E1.equals(E2));
		 * 
		 * Para cadenas mejor el .compareTo
		 */
		
	}

}
