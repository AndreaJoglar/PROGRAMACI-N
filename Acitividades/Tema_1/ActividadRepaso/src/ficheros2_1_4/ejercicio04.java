package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio04 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* compañía tiene n vendedores (pedir)
		 * sueldo base? (pedir)
		 * comisión = +10 % por venta
		 * hacen 3 ventas a la semana
		 * ¿cuánto gana cada vendedor por comisiones a la semana?
		 * ¿cuánto sumando comisiones + sueldo base?
		 */
		
		System.out.println("¿Cuántos vendedores tiene la compañía?");
		int vendedores = teclado.nextInt();
		
		System.out.println("¿Cuánto es el sueldo base de cada vendedor?");
		double sueldo = teclado.nextDouble();
		
		double comisionVenta = (10 * sueldo) / 100;
		System.out.println("Cada vendedor recibe "+comisionVenta+" euros en concepto de comisiones por ventas.");
		
		double sueldoTotal = sueldo + ((10 * sueldo) / 100);
		
		System.out.println("Cada vendedor recibe "+sueldoTotal+" euros sumando el sueldo y las comisiones.");
		
		sueldoTotal = sueldoTotal * vendedores;
		System.out.println("En total, el jefe de la empresa pagará "+sueldoTotal+" en sueldos de sus trabajadores.");
	}

}
