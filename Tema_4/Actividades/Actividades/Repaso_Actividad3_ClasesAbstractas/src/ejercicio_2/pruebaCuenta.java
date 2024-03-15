package ejercicio_2;

public class pruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona("Nombre1", "Apellidos1", "1111111");
		/*
		CuentaCorriente cc1 = new CuentaCorriente(111111, p1);
		
		cc1.ingresar(1500);
		System.out.println(cc1.toString());
		
		cc1.retirar(500);
		System.out.println(cc1.toString());
		
		cc1.retirar(1500);
		*/
		CuentaAhorro ca1 = new CuentaAhorro(222222, p1, 5.50, 1000);
		
		ca1.ingresar(1500);
		System.out.println(ca1.toString());
		
		ca1.retirar(500);
		System.out.println(ca1.toString());
		
		ca1.retirar(200);
	}

}
