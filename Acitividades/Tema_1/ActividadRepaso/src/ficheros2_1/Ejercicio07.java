package ficheros2_1;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir una función
		 * que muestre las permutaciones con repetición que pueden hacerse con los números 1,2,3 y 4.
		 * También que muestre el número de estas.
		 */
		// bucles anidados. Vamos a usar valores anidados.
		
		int total= 0;
		
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 4; b++) {
				for (int c = 1; c <= 4; c++) {
					for (int d = 1; d <= 4; d++) {
						System.out.print(a+", "+b+", "+c+", "+d+"\t");
						total++;
					}
					System.out.println();
				}
			}
		}
		System.out.println("Total de permutaciones: "+total);
		

	}

}
