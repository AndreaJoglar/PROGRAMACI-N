package Ficheros;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*X, Y son enteros
		 * Z es lógico
		 * X = 5
		 * Y = X – 2;
		 * X = Y * 2 + 1
		 * Z = (X > (Y + 5))
		 */
		
		int x,y; // se pone coma para declarar dos variables a la vez
		boolean z;
		
		x = 5;
		y = x - 2;
		x = y * 2 + 1;
		z = (x > (y + 5));
		
		System.out.println("x = "+x+"\ny = "+y+"\nz = "+z);

	}

}
