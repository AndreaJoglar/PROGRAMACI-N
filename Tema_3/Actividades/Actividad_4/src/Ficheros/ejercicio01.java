package Ficheros;

import java.util.Scanner;

public class ejercicio01 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int v [] = {2,5,8,9,3,4,6,7};
	Libreria.mostrarValor(v);
	Libreria.insertaValor(v,11,3);
	Libreria.mostrarValor(v);
	Libreria.insertaValor(v,11,-2);//error pos es negativa
	Libreria.mostrarValor(v);
	Libreria.insertaValor(v,13,8);//error pos fuera de rango
	Libreria.mostrarValor(v);
	Libreria.insertaValor(v,12,5);
	Libreria.mostrarValor(v);
	
	}

}
