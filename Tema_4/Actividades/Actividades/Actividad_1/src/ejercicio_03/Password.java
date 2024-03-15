package ejercicio_03;

public class Password {
	
	private int longitud;
	private String contraseña;
	
	/**
	 * Constructor por defecto
	 */
	public Password() {
		this.longitud=8;
		generarPassword();
	}
	
	/**
	 * Constructor con el parametro longitud
	 * @param longitud entero
	 */
	public Password (int longitud) {
		this.longitud=longitud;
		generarPassword();
	}

	/**
	 * Generamos de forma aleatoria la contraseña
	 * con mayusculas, minusculas y numeros
	 */
	public void generarPassword() {
		this.contraseña="";
		for (int i = 1; i <=longitud; i++) {
			int tipo = (int)(Math.random()*3);
			if (tipo == 0) {
				int valor = (int) (Math.random()*10);
				contraseña = contraseña + valor;
			}
			if (tipo == 1) {
				int valor = (int) (Math.random()*26);
				char letraMay = (char) ('A'+valor);
				contraseña = contraseña + letraMay;
			}
			if (tipo == 2) {
				int valor = (int) (Math.random()*26);
				char letraMin = (char) ('a'+valor);
				contraseña = contraseña + letraMin;
			}
		}
	}
	
	/**
	 * Comprueba si una contraseña es fuerte:
	 * tiene que tener mas de 2 mayusculas,
	 * mas de 1 minuscula y 
	 * 5 numeros
	 * @return boolean
	 */
	public boolean esFuerte() {
		int contNum = 0;
		int contMin = 0;
		int contMay = 0;
		for (int i=0;i<longitud; i++) {
			char caracter = this.contraseña.charAt(i);
			if (Character.isDigit(caracter)==true) {
				contNum++;
			}
			if (Character.isUpperCase(caracter)==true) {
				contMay++;
			}
			if (Character.isLowerCase(caracter)==true) {
				contMin++;
			}
		}
		if (contNum<=5) return false;
		if (contMay<=2) return false;
		if (contMin<=1) return false;
		
		return true;
	}

	/**
	 * Metodo get para el atributo longitud
	 * @return entero
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * Metodo set para el atributo longitud
	 * @param longitud entero
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}

	/**
	 * Metodo get para el atributo contraseña
	 * @return String
	 */
	public String getContraseña() {
		return contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	
	
	

}
