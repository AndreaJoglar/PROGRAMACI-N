package ejercicio_03;

import java.util.Scanner;

public class pruebaPassword {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Indica cantidad de passwords que se van a almacenar: ");
		int tam = teclado.nextInt();
		Password [] password = new Password [tam];
		
		System.out.println("Indica longitud de los password: ");
		int longitud = teclado.nextInt();
		
		for (int i = 0; i < password.length; i++) {
			password[i] = new Password(longitud);
			System.out.println("Contraseña: " + password[i].getPassword() + "\tContraseña fuerte: "
											  + password[i].esFuerte());
		}
		
		
		
	}

}
