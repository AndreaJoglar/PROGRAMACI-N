package Ficheros;

public class ejercicio04_Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v[]= {2,5,3,6,2,1};
		System.out.println("Varianza "+varianza(v));

	}
	
	public static int varianza (int v[]) {
		int suma=0;
		for (int i=0;i<v.length;i++) {
			suma =suma + (v[i]*v[i]);
		}
		return suma/v.length;
	}

}
