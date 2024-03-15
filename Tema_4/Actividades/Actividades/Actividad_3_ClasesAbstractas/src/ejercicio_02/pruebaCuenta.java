package ejercicio_02;

public class pruebaCuenta {

	public static void main(String[] args) {

		Persona p1 = new Persona("Pepe", "XXX", "XXX");
		CuentaAhorro ca = new CuentaAhorro(1111, p1, 2.5, 600);
		System.out.println(ca.toString());
		ca.ingresar(1000);
		System.out.println("Ingresamos 1000: ");
		System.out.println(ca.toString());
		ca.retirar(100);
		System.out.println("Retirar 100: ");
		System.out.println(ca.toString());
		ca.retirar(500); //no podemos porque la cantidad resultante es menor que el saldo mínimo
		System.out.println("Retirar 500: ");
		System.out.println(ca.toString());

	}

}
