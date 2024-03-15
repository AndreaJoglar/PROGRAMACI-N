package Ficheros;

public class ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int matriz2[][]= {{0,1,0,0,5,5,5,1,5},
						  {0,3,3,3,0,0,0,0,0},
					      {0,2,2,0,1,0,3,3,3},
					      {1,0,0,4,4,1,4,0,0},
					      {0,2,2,1,0,0,2,2,0}};
				
		
		
		int m[][] = {{0,1,0,0,5,0,0,1,0},
					 {0,3,0,2,0,0,0,0,0},
					 {0,2,0,0,1,0,3,0,0}};
		
			
		comprobarWarning(m);
	}
	
	/**
	 * Funcion que comprueba Warnings en el trafico aereo
	 * @param m matriz de enteros
	 */
	public static void comprobarWarning (int [][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j]!=0) {
					int tamAvion=m[i][j];
					for (int k = j+1; k < (j+tamAvion); k++) {
						if (m[i][k]!=0) {
							System.out.println("WARNING ("+i+","+k+")");
						}
					}
				}
			}
		}
	}
	
	

}
