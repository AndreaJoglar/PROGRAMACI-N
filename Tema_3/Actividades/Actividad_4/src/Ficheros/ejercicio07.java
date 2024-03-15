package Ficheros;

public class ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]m= {{1,1,1},{1,1,1},{1,1,1}};
		int [][]m2= {{1,19,0},{33,7,7},{9,3,2}};
		
		System.out.println("Suma de la fila: "+Libreria.sumaFila(m, 0));
		System.out.println("Suma de la columna: "+Libreria.sumaColumna(m, 0));
		System.out.println("Suma de la diagonal principal: "+Libreria.sumaDiagonalPrincipal(m));
		System.out.println("Suma de la diagonal secundaria: "+Libreria.sumaDiagonalSecundaria(m));
		if(Libreria.matrizMagica(m)) System.out.println("La matriz es mágica.");
		else System.out.println("La matriz no es mágica.");
		if(Libreria.matrizMagica(m2)) System.out.println("La matriz es mágica.");
		else System.out.println("La matriz no es mágica.");
	}

}
