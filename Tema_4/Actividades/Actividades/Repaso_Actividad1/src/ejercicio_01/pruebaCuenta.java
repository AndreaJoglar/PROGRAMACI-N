package ejercicio_01;

public class pruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prueba de cuenta con los dos parámetros
		Cuenta c1 = new Cuenta("Pepe", 2000.50);
		
		System.out.println(c1.toString());
		
		//Prueba método ingresar
		c1.ingresar(200);
		
		System.out.println(c1.toString());
		
		//comprobación método ingresar
		if (c1.getCantidad() == 2200.50) {
			System.out.println("Ingreso realizado correctamente.\n");
		}
		
		//Prueba método retirar
		c1.retirar(500);
		
		System.out.println(c1.toString());
		
		//comprobación método retirar
		if (c1.getCantidad() == 1700.50) {
			System.out.println("Retirada de dinero realizada correctamente.\n");
		}
		
		//-------------Prueba con un solo parámetro---------------
		Cuenta c2 = new Cuenta("Melisa");
		
		System.out.println(c2.toString());
		
		//Prueba método ingresar
		c2.ingresar(3000.75);
		
		System.out.println(c2.toString());
		
		//comprobación método ingresar
		if (c2.getCantidad() == 3000.75) {
			System.out.println("Ingreso realizado correctamente.\n");
		}
		
		//Prueba método retirar, sacando una cantidad mayor que la de la cuenta
		c2.retirar(4000);
		
		System.out.println(c2.toString());
		
		//comprobación método retirar
		if (c2.getCantidad() == 0) {
			System.out.println("Retirada de dinero correcta.\n");
		}

	}

}
