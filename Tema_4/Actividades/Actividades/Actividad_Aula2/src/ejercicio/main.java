package ejercicio;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico [] tienda = new Electrodomestico [8];
		Lavadora l1 = new Lavadora();
		Lavadora l2 = new Lavadora(300, TipoColor.GRIS);
		Television t1 = new Television();
		Television t2 = new Television(800, 60);
	
		
		tienda[0] = l1;
		tienda[1] = l2;
		tienda[2] = t1;
		tienda[3] = t2;
		
		
		for (int i = 0; i < tienda.length; i++) {
			if (tienda[i] == null) {
				
			}
			else {
				System.out.println("Precio Final= " + tienda[i].precioFinal());
			}
			
		}
		
	
	}

}
