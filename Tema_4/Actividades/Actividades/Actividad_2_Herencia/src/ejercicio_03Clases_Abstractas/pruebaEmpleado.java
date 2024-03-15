package ejercicio_03Clases_Abstractas;

public class pruebaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ERROR: No se pueden crear objetos directamente de una clase abstracta
		 * Empleado e1 = new Empleado ("Paco");
		 * Operario op1 = new Operario ("Pepe");
		 */
		
		//No se pueden crear objetos de clases con métodos vacíos, pero sí vectores
		//Generalidad/Factoría. Guardamos en un vector genérico, categorías distintas.
		Empleado v[] = new Empleado [5];
		v[0] = new Directivo ("Paco");
		//v[1] = new Operario ("Jorge"); No se puede crear el objeto, porque es una clase abstracta
		v[1] = new Oficial ("Juan");
		v[2] = new Tecnico ("Jose");
		v[3] = new Directivo ("Pablo");
		v[4] = new Oficial ("Miguel");
		
		for (int i = 0; i < v.length; i++) {
			v[i].categoria();
			//tratamos a todos los elementos del vector como empleados (down cast)
		}
		
		//upcast o casting:
		Directivo d1 = (Directivo) v[0];
		d1.mostrarDatos();
		
		/* ATENCIÓN AL SIGUIENTE CASO:
		 * No genera error de compilación, pero sí genera excepción:
		 * Una ruptura traumática del sistema.
		 * Oficial of1 = (Oficial) v[0];
		 * of1.categoria();
		 */
		
		
		
	}

}
