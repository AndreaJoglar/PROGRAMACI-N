package ficheros2_1_4;

import java.util.Scanner;

public class ejercicio11 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* pedir opcion 1 o 2:
		 * 
		 */
		
		System.out.println("Elija 1 o 2: ");
		int opcion = teclado.nextInt();
		while ((opcion != 1) && (opcion != 2)) {
			System.out.println("Solo puedes pulsar 1 o 2. Vuelva a intentarlo: ");
			opcion= teclado.nextInt();
		}
		
		
		
		while (opcion == 1) {
			System.out.println("Escribe un número: ");
			int num = teclado.nextInt();
			if (num % 2 == 0) {
				for (int cont = 1; cont <= 10; cont++) {
					int tabla = num * cont;
					System.out.println(num+" x "+cont+" = "+tabla);
				}	
			}
			else {
				for (int cont = 1; cont <= 5; cont++) {
					int aleatorio = (int)(Math.random()*990+10);
					System.out.println("Número aleatorio ("+cont+"): "+aleatorio);
				}
			}
		}
		if (opcion == 2) {
			System.out.println("Escribe el primer número: ");
			double num1 = teclado.nextInt();
			System.out.println("Escribe el segundo número: ");
			double num2 = teclado.nextInt();
			if (num1 == num2) {
				System.out.println("Los números son iguales.");
			}
			else{
				double resultado;
				if (num1 > num2) {
					resultado = num2 / num1;
					System.out.println("Resultado de dividir el menor ("+num2+") entre el mayor ("+num1+") = "+resultado);
					resultado = num1 - num2;
					System.out.println("Resultado de restar el menor ("+num2+") al mayor ("+num1+") = "+resultado);
				}
				else {
					resultado = num1 / num2;
					System.out.println("Resultado de dividir el menor ("+num1+") entre el mayor ("+num2+") = "+resultado);
					resultado = num2 - num1;
					System.out.println("Resultado de restar el menor ("+num1+") al mayor ("+num2+") = "+resultado);
				}
			}
		}

	}

}
