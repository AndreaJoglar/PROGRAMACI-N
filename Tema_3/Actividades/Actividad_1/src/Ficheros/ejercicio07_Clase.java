package Ficheros;

public class ejercicio07_Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v []= {6,3,4,8,5,7,9,2,1};
		ordena(v);
		ParesAscImparDes(v);
		mostrar(v);
	}
	
	public static void mostrar(int[] v) {
		for (int i=0;i<v.length;i++) {
			System.out.print(v[i]+" ");
		}
		
	}
	
	/**
	 * Funcion que ordena pares primero e impares después
	 * dentro de un vector de enteros
	 * @param v vector de enteros
	 */
	public static void ordena (int v[]) {
		int i=0;
		int j=v.length-1;
		while (i<j) {
			if (v[i]%2==0) {
				i++;
			}
			else {
				if (v[j]%2!=0) {
					j--;
				}
				else {
					int aux=v[i];
					v[i]=v[j];
					v[j]=aux;
				}
			}
		}
	}
	
	/**
	 * Funcion que muestra pares en orden ascendente 
	 * e impares en descente dentro de un vector de enteros
	 * @param v vector de enteros
	 */
	public static void ParesAscImparDes (int []v) {
		for (int iter =0;iter<v.length;iter++) {
			for (int i=0;i<v.length-1;i++) {
				if (v[i]%2==0 && v[i+1]%2==0 && v[i]>v[i+1] ) {
					int aux =v[i];
					v[i]=v[i+1];
					v[i+1] = aux;
				}
				else {
					if (v[i]%2!=0 && v[i+1]%2!=0 && v[i]<v[i+1] ) {
						int aux =v[i];
						v[i]=v[i+1];
						v[i+1] = aux;
					}
				}
			}
		}
	}

}
