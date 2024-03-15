package Ficheros;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*X es real
		 * X = 2.0
		 * X = (X * X) * 2
		 * X = raíz (X + raix(x) + 5) 
		 */
		
		double x;
		
		x = 2.0;
		x = (x * x) * 2;
		x = Math.sqrt(x + Math.sqrt(x) + 5);
		
		System.out.println("x = "+x);

	}

}
