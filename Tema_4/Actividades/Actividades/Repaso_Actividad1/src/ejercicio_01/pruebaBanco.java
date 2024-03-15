package ejercicio_01;

public class pruebaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco b1 = new Banco();
		
		Cuenta c1 = new Cuenta("Mari", 500.60);
		Cuenta c2 = new Cuenta("Gioconda", 30000);
		Cuenta c3 = new Cuenta ("Michelangelo", 18390);
		Cuenta c4 = new Cuenta ("Frida", 4650.70);
		
		b1.addCuenta(c1);
		b1.addCuenta(c2);
		b1.addCuenta(c3);
		b1.addCuenta(c4);
		
		System.out.println(b1.toString());
		
		Cuenta c5 = new Cuenta("Margot", 500.60);
		
		b1.addCuenta(c5);
		

	}

}
