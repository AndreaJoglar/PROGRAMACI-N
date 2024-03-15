package Ficheros;

public class Ejercicio22While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Suma todos los números impares que hay entre 1 y 20 mostrando el resultado al final. 
		 * Generaliza lueg este ejercicio para dos números cualquier pedidos por teclado, 
		 * deberá ir de menor a mayor.
		 */
		
		int num = 1;
		int suma = 0;
		
		
		while ((num >= 1) && (num <= 20)) {
			if (num % 2 != 0) {
				System.out.println(num);
				suma = suma + num;
				num++;
			}
			else {
				num++;
			}
		}
		System.out.println("Suma impares = "+suma);
	
				

	}

}
