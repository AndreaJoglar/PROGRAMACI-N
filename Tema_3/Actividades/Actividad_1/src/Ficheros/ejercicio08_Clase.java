package Ficheros;

public class ejercicio08_Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v[] = new int [200];
		generarVector(v);
		int contVeces []= new int [11];
		for (int i=0; i<=10; i++) {
			contVeces[i]= contarValor(v, i);
		}
		
		mostrar (contVeces);
		int media = calculaMedia (contVeces);
		System.out.println("Media: "+media);

	}
	
	/**
	 * Muestra el contenido del vector
	 * @param contVeces vector de enteros
	 */
	public static void mostrar(int[] contVeces) {
		for (int i=0; i<contVeces.length;i++) {
			System.out.println("["+i+"] "+contVeces[i]);
		}
	}


	/**
	 * rellena un vector con valores entre 0 y 10
	 * @param v vector de enteros
	 */
	public static void generarVector (int v[]) {
		for (int i = 0; i<v.length; i++) {
			v[i]= (int) (Math.random()*11);
		}
	}
	
	/**
	 * Retorna el numero de veces que aparece el valor en el vector
	 * @param v vector de enteros
	 * @param valor entero
	 * @return entero
	 */
	public static int contarValor (int v[], int valor) {
		int cont = 0;
		for ( int i= 0; i<v.length; i++) {
			if (v[i]==valor) cont++;
		}
		return cont;
	}
	
	/**
	 * Calcula la media del vector
	 * @param contVeces
	 * @return
	 */
	public static int calculaMedia(int[] contVeces) {
		int suma = 0; 
		for (int i=0; i<contVeces.length;i++) {
			suma = suma+contVeces[i];
		}
		return suma/contVeces.length;
	}

}
