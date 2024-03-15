package Ficheros;

import java.util.Scanner;

public class ejercicio05_ClaseBurbuja {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Método de burbuja o pivote
		
		double v[]=generaVector();
		mostrarVector (v);
		ordena (v);
		mostrarVector(v);

	}
	
	/**
	 * Funcion que muestra el contenido de un vector
	 * @param v vector de enteros
	 */
	public static void mostrarVector(double []v) {
		// TODO Auto-generated method stub
		for (int i=0;i<v.length;i++) {
			System.out.print(v[i]+", ");
		}
		System.out.println();
	}

	/**
	 * Funcion que genera un vector de reales
	 * con valores aleatorios
	 * @return vector de reales
	 */
	public static double[] generaVector() {
		// TODO Auto-generated method stub
		System.out.println("Dimensión del vector: ");
		int dim = teclado.nextInt();
		double v[]= new double [dim];
		
		for (int i = 0;i<v.length;i++) {
			v[i]= Math.rint((Math.random()*30+1)*100)/100;
		}
		return v;
		
	}

	/**
	 * Ordena los valores de un vector
	 * @param v vector de enteros
	 */
	public static void ordena (double v[]) {
		for (int iter=0;iter<v.length;iter++) {
			double pivote = v[iter];
			int posPivote = iter;
			for (int i=iter+1;i<v.length;i++) {
				if (v[i]<pivote) {
					pivote = v[i];
					posPivote=i;
				}
			}
			//intercambiar con variable auxiliar
			double aux=v[iter];
			v[iter]=v[posPivote];
			v[posPivote]=aux;
		}
	}

}
