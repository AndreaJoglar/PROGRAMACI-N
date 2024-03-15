package ejercicio_02;

public class Persona {
	/*nombre, edad, DNI, sexo (H hombre, M mujer),
	 * peso y altura.
	 */
	final char CTE_SEXO = 'H';
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = generarDni();
		this.sexo = CTE_SEXO;
		this.peso = 0;
		this.altura = 0;
	}
	
	/**
	 * Constructor con parametros nombre, edad y sexo
	 * @param nombre String
	 * @param edad entero
	 * @param sexo char
	 */
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generarDni();
		if (comprobarSexo(sexo) == true) {
			this.sexo = sexo;
		} else {
			this.sexo = CTE_SEXO;
		}
		this.peso = 0;
		this.altura = 0;
	}

	/**
	 * Constructor con todos los parametros
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generarDni();
		if (comprobarSexo(sexo) == true) {
			this.sexo = sexo;
		} else {
			this.sexo = CTE_SEXO;
		}
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * @return the cTE_SEXO
	 */
	public char getCTE_SEXO() {
		return CTE_SEXO;
	}
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo="
				+ sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}

	/**
	 * Calcula el imc de una persona
	 * @return entero
	 */
	public int calcularIMC () {
		double imc = this.peso / (this.altura * this.altura);
		if (imc < 20) {
			return -1;
		} else {
			if(imc >=20 && imc <=25) {
				return 0;
			}
		}
		return 1;
	}
	
	/**
	 * Determina si una persona es mayor de edad
	 * @return boolean
	 */
	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		}
		return false;
	}
	
	/**
	 * Comprueba 
	 * @param sexo char
	 * @return boolean
	 */
	public boolean comprobarSexo (char sexo) {
		if (sexo == 'H' || sexo == 'h') return true;
		if (sexo == 'M' || sexo == 'm') return true;
		return false;
	}
	
	/**
	 * Genera un dni aleatorio
	 * @return String
	 */
	public String generarDni() {
		this.dni = "";
		for (int i = 0; i < 8; i++) {
			int digito = (int)(Math.random()*10);
			this.dni += digito;
		}
		int suma = 0;
		for (int i = 0; i < 8; i++) {
			char digitoChar = dni.charAt(i);
			int valorDigito = digitoChar - 0x30;
			suma += valorDigito;
		}
		
		char letra = 'x';
		if (suma % 23 == 0) {
			letra = 'T';
		}
		if (suma % 23 == 1) {
			letra = 'R';
		}
		if (suma % 23 == 2) {
			letra = 'W';
		}
		if (suma % 23 == 3) {
			letra = 'A';
		}
		if (suma % 23 == 4) {
			letra = 'G';
		}
		if (suma % 23 == 5) {
			letra = 'M';
		}
		if (suma % 23 == 6) {
			letra = 'Y';
		}
		if (suma % 23 == 7) {
			letra = 'F';
		}
		if (suma % 23 == 8) {
			letra = 'P';
		}
		if (suma % 23 == 9) {
			letra = 'D';
		}
		if (suma % 23 == 10) {
			letra = 'X';
		}
		if (suma % 23 == 11) {
			letra = 'B';
		}
		if (suma % 23 == 12) {
			letra = 'N';
		}
		if (suma % 23 == 13) {
			letra = 'J';
		}
		if (suma % 23 == 14) {
			letra = 'Z';
		}
		if (suma % 23 == 15) {
			letra = 'S';
		}
		if (suma % 23 == 16) {
			letra = 'Q';
		}
		if (suma % 23 == 17) {
			letra = 'V';
		}
		if (suma % 23 == 18) {
			letra = 'H';
		}
		if (suma % 23 == 19) {
			letra = 'L';
		}
		if (suma % 23 == 20) {
			letra = 'C';
		}
		if (suma % 23 == 21) {
			letra = 'K';
		}
		else {
			if (suma % 23 == 22) {
				letra = 'E';
			}
		}
		
		this.dni += letra;
		return this.dni;
	}
	
	

}
