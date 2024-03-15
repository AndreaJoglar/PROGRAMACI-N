package Ficheros;


import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Funcion que lee los valores de un vector.
	 * @return vector enteros
	 */
	public static int[] leerVector () {
		System.out.println("Leer tamaño: ");
		int tam=teclado.nextInt();
		int v[] = new int[tam];
		for (int i=0; i<v.length;i++) {
			System.out.println("["+i+"] ");
			v[i]=teclado.nextInt();
		}
		return v;
	}
	
	/**
	 * Muestra el contenido de un vector.
	 * @param v vector enteros
	 */
	public static void imprimirVector (int v[]) {
		for (int i=0;i<v.length;i++) {
			System.out.println("["+i+"] "+v[i]);
		}
	}
	
	 /**
	 * Funcion que muestra el numero de veces que un elemento entero
	 * de un vector aparece repetido
	 * @param v vector de enteros
	 */ 
	public static void mostrarRepetidos (int v[]) {
		System.out.println("\nValores repetidos: ");
		boolean noRepite = false;
		for (int i=0;i<v.length;i++) {
			int cont=1;
			for(int j=0;j<v.length;j++) {
				if ((i!=j) && v[i]==v[j]) {
					cont++;
					noRepite=true;
				}
			}
			if (cont>=2) {
				System.out.println("El elemento ["+i+"] "+v[i]+". Número de veces que aparece: "+cont);
			}
		}
		if (noRepite==false) {
			System.out.println("No se repite ninguno.");
		}
	}
	
	/**
	 * Funcion que devuelve el minimo de un vector
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int calcularMin (int v[]) {
		int min=v[0];
		for (int i=1;i<v.length;i++) {
			if(min>v[i]) {
				min=v[i];
			}
		}
		return min;
	}
	
	/**
	 * Funcion que devuelve el maximo de un vector
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int calcularMax (int v[]) {
		int max=v[0];
		for (int i=1;i<v.length;i++) {
			if(max<v[i]) {
				max=v[i];
			}
		}
		return max;
	}
	 
	/**
	 * Funcion que busca numeros ausentes en un vector
	 * @param v vector de enteros
	 */
	public static void buscarAusentes (int v[]) {
		int min=calcularMin(v);
		int max=calcularMax(v);
		
		System.out.print("\nValores ausentes: \n(");
		boolean primero = true;
		for (int i=min;i<max;i++) {
			boolean presente = false;
			for (int j=0;j<v.length && presente ==false;j++) {
				if (i==v[j]) {
					presente = true;
				}
			}
			if (presente==false) {
				if (primero==true) {
					System.out.print(i);
					primero=false;
				}
				else {
					System.out.print(", "+i);
				}
			}
		}
		if (primero==true) {
			System.out.print("No hay ausentes");
		}
		System.out.println(") \nMáximo del vector = "+max+"; Mínimo del vector = "+min);
	}
	
	/**
	 * Funcion que devuelve el promedio de los elementos
	 * de un vector.
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int promedio (int v[]) {
		int min=calcularMin(v);
		int max=calcularMax(v);
		int valorMedio = (max+min)/2;
		int promedio=0;
		boolean primero=true;
		int resta=0;
		
		for (int i=0;i<v.length;i++) {
			if (primero==true) {
				resta = Math.abs(valorMedio-v[i]);
				promedio=v[i];
				primero=false;
			}
			else {
				if (resta>Math.abs(valorMedio-v[i])) {
					promedio=v[i];
					resta=Math.abs(valorMedio-v[i]);
				}
			}
		}
		return promedio;
	}
}
