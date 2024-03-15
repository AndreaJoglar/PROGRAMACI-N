package ejercicio_01;

public class Banco {
	//Atributos
	private Cuenta v[]; //un vector como atributo
	
	
	/**
	 * Constructor de la clase Banco, dimensiona el vector
	 * a 4 posiciones.
	 */
	public Banco () { //el constructor dimensiona el vector 
		v=new Cuenta[4];
	}

	/**
	 * Insertar en la posicion pos un nuevo objeto de tipo cuenta
	 * @param c objeto cuenta
	 * @param pos entero
	 */
	public void addCuenta (Cuenta c, int pos) {
		if (pos>=0 && pos <v.length) { //comprobamos que se cumplen los límites (entre 0 y 3)
			v[pos]=c;
		}
		else System.out.println("ERROR en la posición.");
	}
	
	
	/**
	 * Muestra por pantalla el contenido del vector v
	 */
	public void mostrarCuentas() {
		for (int i = 0; i < v.length; i++) {
			Cuenta c=v[i];						//En v[i] va a haber un objeto cuenta
			System.out.println(c.toString());	//mostramos la cuenta
		}
	}
	
}
