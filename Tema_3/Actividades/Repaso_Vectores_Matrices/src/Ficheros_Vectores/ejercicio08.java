package Ficheros_Vectores;

public class ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []v=new int [200];
		Libreria.crearVectorAleatorio(v);
		Libreria.mostrarVector(v);
		int [] contarVeces = new int [11];
		
		System.out.println("Veces que aparece cada valor: ");
		for (int i=1;i<=10;i++) {
			contarVeces[i]=Libreria.contarValor(v, i);
		}
		Libreria.mostrarVector(contarVeces);
		System.out.println("Media de veces que aparece cada valor: "+Libreria.mediaRepeticiones(contarVeces));

	}

}
