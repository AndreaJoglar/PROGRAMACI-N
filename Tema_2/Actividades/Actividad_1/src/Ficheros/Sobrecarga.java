package Ficheros;

public class Sobrecarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Sobrecarga de funciones:
		 * Podemos llamar a distintas funciones de la misma manera
		 * siempre y cuando tengamos distinto número de parámetros
		 * o mismo número de parámetros pero de distinto tipo
		 * para que el ordenador sepa diferenciar a qué función queremos
		 * que vaya
		 */
		funcion (2);
		funcion(2, 4);
		funcion (5.2);
		funcion (true);

	}
	public static void funcion (int param1) {
		System.out.println("Funcion 1 parametro entero: ");
	}
	public static void funcion (int param1, int param2){
		System.out.println("Funcion 2 parametros entero: ");
	}
	public static void funcion (double param1) {
		System.out.println("Funcion 1 parametro real: ");
	}
	public static void funcion (boolean param1) {
		System.out.println("Funcion 1 parametro boolean: ");
	}


}
