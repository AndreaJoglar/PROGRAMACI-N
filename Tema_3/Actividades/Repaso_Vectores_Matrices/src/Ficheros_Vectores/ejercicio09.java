package Ficheros_Vectores;

public class ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []v= {2,3,4,1,2,3,6,7,5,4,7,6,5,3,8,9,8,7,6};
		if(Libreria.tienePico(v)) {
			System.out.println("El vector tiene picos.");
		}
		else System.out.println("No tiene picos");

		int []nopico = {6,5,4,3,2,1};
		if(Libreria.tienePico(nopico)) {
			System.out.println("El vector tiene picos.");
		}
		else System.out.println("No tiene picos");
		
		if(Libreria.tieneValle(v)) {
			System.out.println("El vector tiene valles.");
		}
		else System.out.println("No tiene valles");
		
	}

}
