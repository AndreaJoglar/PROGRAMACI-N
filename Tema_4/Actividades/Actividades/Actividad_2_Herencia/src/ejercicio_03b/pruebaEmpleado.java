package ejercicio_03b;

public class pruebaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e1 = new Empleado("Rafa");
		Directivo d1 = new Directivo("Mario");
		Operario op1 = new Operario("Alfonso");
		Oficial of1 = new Oficial("Luis");
		Tecnico t1 = new Tecnico("Lolo");
		
		Empleado v[] = new Empleado [5];
		v[0]=e1;
		v[1]=d1;
		v[2]=op1;
		v[3]=of1;
		v[4]=t1;
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].datos()); //factorías: las clases derivadas no siempre añaden funcionalidad. Algunas sí y otras no. 
		}
		
		//downcast: el programa ejecuta el método correspondiente de cada clase
	}

}
