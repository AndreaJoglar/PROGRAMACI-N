package ficheros2_1_4;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* primera columna dibujar 1 columna++
		 * segunda dibujar 2 columna++
		 * tercera dibujar 3 columna++
		 * cuarta dibujar 4 columna++
		 */
		
		for (int filas = 1; filas <= 4; filas++) {
			System.out.println();
			int num = 1;
			for (int columna = 1; columna <= filas; columna++) {
				System.out.print(num+"   ");
				num++;
			}	
		}
		for (int filas = 5; filas <= 7; filas++) {
			System.out.println();
			int num = 1;
			for (int columna = 7; columna >= filas; columna--) {
				System.out.print(num+"   ");
				num++;
			}
			
		}

	}

}
