package Ficheros;

public class Ejercicio22ClaseFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Suma todos los números impares que hay entre 1 y 20 mostrando el resultado al final. 
		 * Generaliza lueg este ejercicio para dos números cualquier pedidos por teclado, 
		 * deberá ir de menor a mayor.
		 */
		
		int inicio = 1;
		int fin = 20; 
		int suma = 0; 
		
		for ( ; inicio <= fin; inicio++) {
			if (inicio % 2 != 0) {
				suma = suma + inicio;
			}
		}
		System.out.println("Suma: "+suma);
		
				

	}

}
