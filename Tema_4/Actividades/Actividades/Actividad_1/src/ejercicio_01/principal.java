package ejercicio_01;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta c1 = new Cuenta ("Pepe",150);
		System.out.println(c1.toString());
		
		Cuenta c2 = new Cuenta ("Juan",200);
		System.out.println(c2.toString());
		
		Cuenta c3 = new Cuenta ("Paco");
		System.out.println(c3.toString());
		
		//Probamos el método setCantidad. set sirve para cambiar a calzador el valor de un atributo
		c1.setCantidad(100.0);
		System.out.println("Nueva cantidad: "+c1.toString());
		
		//c1 = cantidad 100
		c1.ingresar(200.0); //la cantidad pasaría a ser 300
		
		//Probar que el método ingresar funciona 
		if (c1.getCantidad()==300.0) {//get y set se usan fuera de la clase
			System.out.println("Método ingresar correcto.");
		}
		else {
			System.out.println("Método ingresar no funciona bien.");
		}
		//Comprobamos que es verdad
		System.out.println(c1.toString());
		
		
		//c1 = cantidad 300
		c1.retirar(100);
		//Esperamos que c1= cantidad 200
		if (c1.getCantidad()==200.0) {
			System.out.println("El método retirar funciona.");
		}
		else {
			System.out.println("El método retirar no funciona bien.");
		}
		
		System.out.println(c1.toString());
		
		//c1 = cantidad 200
		c1.retirar(300);
		//esperamos que c1= cantidad 0
		if (c1.getCantidad()==0) {
			System.out.println("EL método retirar funciona.");
		}
		else {
			System.out.println("El método retirar no funciona bien");
		}
		
		System.out.println(c1.toString());
		
		
		
		
	}

}
