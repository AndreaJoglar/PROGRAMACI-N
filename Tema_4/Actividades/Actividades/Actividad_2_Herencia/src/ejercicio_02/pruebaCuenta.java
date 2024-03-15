package ejercicio_02;

public class pruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta c1 = new Cuenta (1000, 12);
		
		
		System.out.println(c1.toString());
		
		c1.extractoMensual();
		
		System.out.println("Después de aplicar extracto mensual: ");
		System.out.println(c1.toString());

		System.out.println("\n*****************Cuenta de Ahorro****************");
		CuentaAhorro ca1 = new CuentaAhorro(30000, 12);
		
		ca1.extractoMensual();
		ca1.imprimir();
		ca1.retirar(1000);
		ca1.retirar(1000);
		ca1.retirar(1000);
		ca1.retirar(1000);
		ca1.retirar(1000);
		ca1.retirar(1000);
		System.out.println("\nDespués de retirar 6 veces 1000 €: ");
		ca1.extractoMensual();
		ca1.imprimir();
		
		System.out.println("\n******************Cuenta Corriente***************");
		CuentaCorriente cc1 = new CuentaCorriente(1000, 12);
		
		cc1.imprimir();
		System.out.println("Retirar 400: ");
		cc1.retirar(400); //saldo sería = 600 sobregiro = 0
		cc1.imprimir();
		System.out.println("Retirar 900: ");
		cc1.retirar(900); // sobregiro = 300 saldo = 0
		cc1.imprimir();
		System.out.println("Consignar 100: ");
		cc1.consignar(100); //sobregiro = 200 saldo = 0
		cc1.imprimir();
		System.out.println("Consignar 500: ");
		cc1.consignar(500); //sobregiro = 0 saldo = 300
		cc1.imprimir();
		
	}

}
