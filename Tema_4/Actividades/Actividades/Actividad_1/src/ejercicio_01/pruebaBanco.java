package ejercicio_01;

public class pruebaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c1=new Cuenta ("Pepe", 100.0);
		Cuenta c2=new Cuenta ("Paco", 200.0);
		Cuenta c3=new Cuenta ("Juan", 300.0);
		Cuenta c4=new Cuenta ("Lolo", 400.0);
		
		/*Las cuentas las creamos en el main
		 * Un banco formado por una serie de cuentas
		 */
		
		//hay que hacer diagramas para los ejercicios (diagrama de clases, equivalentes a los diagramas entidad reladción.)
		
		
		
		Banco banco = new Banco();
		banco.addCuenta(c1, 0);
		banco.addCuenta(c2, 1);
		banco.addCuenta(c3, 2);
		banco.addCuenta(c4, 3);
		
		banco.mostrarCuentas();
	}

}
