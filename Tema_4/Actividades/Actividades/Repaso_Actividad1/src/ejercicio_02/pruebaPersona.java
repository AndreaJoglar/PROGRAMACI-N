package ejercicio_02;

import java.util.Scanner;

public class pruebaPersona {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce nombre: ");
		String nombre = teclado.next();
		System.out.println("Introduce edad: ");
		int edad = teclado.nextInt();
		System.out.println("Introduce sexo (hombre o mujer): ");
		char sexo = teclado.next().charAt(0);
		System.out.println("Introduce peso (kg): ");
		double peso = teclado.nextDouble();
		System.out.println("Introduce altura (m): ");
		double altura = teclado.nextDouble();
		
		Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona p2 = new Persona(nombre, edad, sexo);
		Persona p3 = new Persona();
		
		p2.setPeso(64);
		p2.setAltura(1.64);
		
		p3.setNombre("Miguel");
		p3.setEdad(14);
		p3.setPeso(130);
		p3.setAltura(1.80);
		
		Persona [] personas = new Persona [3];
		personas[0] = p1;
		personas[1] = p2;
		personas[2] = p3;
		
		for (int i = 0; i < personas.length; i++) {
			if (personas[i].calcularIMC() == -1) {
				System.out.println("Está por debajo de su peso ideal.");;
			}
			else {
				if (personas[i].calcularIMC() == 0) {
					System.out.println("Está en su peso ideal");
				}
				else {
					System.out.println("Tiene sobrepeso.");
				}
			}	
		}
		
		for (int i = 0; i < personas.length; i++) {
			if (personas[i].esMayorDeEdad() == true) {
				System.out.println("Es mayor de edad.");
			}
			else {
				System.out.println("Es menor de edad.");
			}
		}
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		
		
		
		

	}

}
