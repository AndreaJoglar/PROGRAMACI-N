package practica;

public class OperacionesMatematicas {
	public int base;
	public int exponente;
	
	public static int potencia(int base, int exponente) {
		
		for (int i = 1; i <= exponente; i++){
			base *= base;
		}
		return base;
	}
}
