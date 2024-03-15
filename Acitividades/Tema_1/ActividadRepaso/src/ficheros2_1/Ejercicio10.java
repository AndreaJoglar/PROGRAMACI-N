package ficheros2_1;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Como podemos ver, en este caso se trata de mostrar las letras del abecedario (sin la Ñ)
		 * en mayúsculas y en orden inverso.
		 * A continuación en cada fila mostrar una letra menos hasta llegar a mostrar solamente la A.
		 */
		
		for (int filas = 0; filas < 29; filas++) {
			for (char car= (char) ('Z'-filas); car >= 'A'; car--) {
				System.out.print(car+" ");
			}
			System.out.println();
		}
		
	
	}

}
