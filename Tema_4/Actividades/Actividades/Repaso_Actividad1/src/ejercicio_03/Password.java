package ejercicio_03;

public class Password {
	
	private int longitud;
	private String password;
	
	/**
	 * Constructor por defecto
	 */
	public Password () {
		this.longitud = 8;
		this.password = generarPassword();
	}

	/**
	 * Constructor que recibe la longitud como parametro
	 * @param longitud entero
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.password = generarPassword();
	}
	
	/**
	 * Metodo get del atributo longitud
	 * @return longitud entero
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * Metodo set del atributo longitud
	 * @param longitud entero
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * Metodo get del atributo password
	 * @return password String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Genera un password aleatorio con numeros,
	 * mayusculas y minusculas
	 * @return String
	 */
	public String generarPassword() {
		this.password = "";
		
		for (int i = 0; i < this.longitud; i++) {
			int tipo = (int)(Math.random()*3);
			if (tipo == 0) {
				int valor = (int)(Math.random()*10);
				this.password += valor;
			}
			if (tipo == 1) {
				int valor = (int)(Math.random()*26);
				char mayus = (char)('A' + valor);
				this.password += mayus;
			}
			if (tipo == 2) {
				int valor = (int)(Math.random()*26);
				char minus = (char)('a' + valor);
				this.password += minus;
			}
		}
		return this.password ;
	}

	/**
	 * Determina si un password es fuerte
	 * Si tiene mas de 5 numeros
	 * Si tiene mas de dos mayusculas
	 * Si tiene mas de una minuscula
	 * @return boolean
	 */
	public boolean esFuerte() {
		int contNum = 0;
		int contMayus = 0;
		int contMinus = 0;
		
		for (int i = 0; i < this.longitud; i++) {
			char caracter = this.password.charAt(i);
			if (Character.isDigit(caracter)) {
				contNum++;
			}
			if (Character.isUpperCase(caracter)) {
				contMayus++;
			}
			if (Character.isLowerCase(caracter)) {
				contMinus++;
			}	
		}
		if (contNum <= 5) {
			return false;
		}
		if (contMayus <=2) {
			return false;
		}
		if (contMinus <= 1) {
			return false;
		}
		return true;
	}
}
