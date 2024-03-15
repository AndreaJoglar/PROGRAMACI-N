package Ficheros;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A y B de tipo entero (int)
		
		int a;
		int b;
		
		//C y D de tipo real (double/float)
		
		double c;
		float d;
		
		//E y F de tipo carácter (char)
		
		char e;
		char f;
		
		//G de tipo lógico (boolean)
		
		boolean g;
		
		a = 20;
		b = 12;
		f = 'C';
		b = 5500;
		c = 0; // c es double
		d = 0; // d es float
		c = d; // asignamos el valor de la variable de d a c
		d = (float) c; // casting: lo usamos para meter un double en un float
		e = f;
		e = 'F';
		// a = 12.56; a es entero y no puede tener decimales
		// g = verdadero; boolean solo acepta "true" o "false", no "verdadero"
		g = false;
		// f = g; no se puede convertir un boolean en char
		
		//Comentario sobre el uso de float
		c = 12.56; // asignación de un número con decimales a un double
		d = 12.56f; // cuando asignamos un valor a un float, conviene acabarlo con una f
		

	}

}
