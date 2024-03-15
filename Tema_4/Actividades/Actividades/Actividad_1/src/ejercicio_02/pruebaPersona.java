package ejercicio_02;

import java.util.Scanner;

public class pruebaPersona {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		//Pedimos nombre, edad, sexo, peso y altura
		System.out.println("Nombre: ");
		String nombre = teclado.next();
		System.out.println("Edad: ");
		int edad = teclado.nextInt();
		System.out.println("Sexo: ");
		char sexo = teclado.next().charAt(0); //0 representa el primer caracter que lee
		System.out.println("Peso: ");
		int peso = teclado.nextInt();
		System.out.println("Altura: ");
		double altura = teclado.nextDouble();
		
		Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona p2 = new Persona(nombre, edad, sexo);
		Persona p3 = new Persona();
		p3.setNombre("Pepe");
		p3.setEdad(10);
		p3.setSexo('H');
		p3.setPeso(30);
		p3.setAltura(1.40);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		Persona v [] = new Persona [3];
		v[0] = p1;
		v[1] = p2;
		v[2] = p3;
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].toString());
			if (v[i].calcularImc() ==0) System.out.println("Peso ideal.");
			if (v[i].calcularImc() ==1) System.out.println("Sobrepeso.");
			if (v[i].calcularImc() ==-1) System.out.println("Por debajo del peso ideal");
			if (v[i].esMayorDeEdad()==true) {
				System.out.println("Es mayor de edad.");
			}
		}
		
	}

}
