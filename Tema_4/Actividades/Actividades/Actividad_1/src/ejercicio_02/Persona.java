package ejercicio_02;

public class Persona {

	/*una constante es una variable que nunca cambia. Se inicializan en el momento en el que se declara.
	 * La constante suele colocarse arriba del todo, por encima de los atributos.
	 */
	private final char CTE_SEXO = 'H';
	//Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private int peso;
	private double altura;
	
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		generarDni();
		this.sexo = CTE_SEXO;
		this.peso = 0;
		this.altura = 0;
		
	}

	/**
	 * Constructor con parametros
	 * @param nombre String
	 * @param edad entero
	 * @param sexo char
	 */
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		if (comprobarSexo(sexo)==true) {
			this.sexo = sexo;
		}
		else {
			this.sexo=CTE_SEXO;
		}
		generarDni();
		this.peso = 0;
		this.altura = 0;
	}

	/**
	 * Constructor con todos los parametros
	 * @param nombre String
	 * @param edad entero
	 * @param sexo char
	 * @param peso entero
	 * @param altura real
	 */
	public Persona(String nombre, int edad, char sexo, int peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		generarDni();
		if (comprobarSexo(sexo)==true) {
			this.sexo = sexo;
		}
		else {
			this.sexo=CTE_SEXO;
		}
		this.peso = peso;
		this.altura = altura;
	}
	
	/**
	 * Metodo get del atributo nombre
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Metodo set del atributo nombre 
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Metodo get del atributo edad
	 * @return entero
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * Metodo set del atributo edad
	 * @param edad entero
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * Metodo get del atributo sexo
	 * @return char
	 */
	public char getSexo() {
		return sexo;
	}


	/**
	 * Metodo set del atributo sexo
	 */
	public void setSexo(char sexo) {
		if (comprobarSexo(sexo)==true) {
			this.sexo = sexo;
		}
		else {
			this.sexo=CTE_SEXO;
		}
	}


	/**
	 * Metodo get del atributo peso
	 * @return entero
	 */
	public int getPeso() {
		return peso;
	}


	/**
	 * Metodo set del atributo peso
	 * @param peso entero
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}


	/**
	 * Metodo get del atributo altura 
	 * @return real
	 */
	public double getAltura() {
		return altura;
	}


	/**
	 * Metodo set del atributo altura
	 * @param altura real
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}


	/**
	 * Metodo get del atributo dni
	 * @return String
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Calcula el IMC de una persona (kg/altura^2).
	 * Si devuelve un valor menor que 20, retorna -1
	 * Si devuelve un número entre 20 y 25 (incluidos), retorna 0
	 * Si devuelve un número mayor que 25, retorna 1.
	 * @return
	 */
	public int calcularImc() {
		double valor = peso/(altura*altura);
		if (valor <20) return -1;
		if (valor >=20 && valor <=25) return 0;
		else return 1;
	}

	/**
	 * Determina si se es mayor de edad (>=18)
	 * @return boolean
	 */
	public boolean esMayorDeEdad() {
		if (edad>=18) return true;
		return false;
	}

	
	/**
	 * Comprobar que el char representa un valor correcto para el sexo
	 * @param letra char
	 * @return boolean
	 */
	private boolean comprobarSexo (char letra) {
		if (letra == 'H' || letra == 'h') return true;
		if (letra == 'M' || letra == 'm') return true;
		return false;
	}
	
	/**
	 * Genera numeros aleatorios para un dni
	 */
	private void generarDni() {
		this.dni = "";
		for ( int i=1; i<=8;i++) {
			int digito = (int)(Math.random()*10);
			dni += digito;
		}
		char letra = calcularLetra();
		dni = dni+letra;
	}

	/**
	 * Calcula la letra asociada al dni segun:
	 * calcula la suma de todos los digitos 
	 * y lo divide entre 4.
	 * resto = 0 A
	 * resto = 1 B
	 * resto = 2 C
	 * resto = 3 D
	 * @return char
	 */
	private char calcularLetra() {
		int suma = 0;
		for (int i = 0; i<8; i++) {
			char digitoChar = dni.charAt(i); //String es un vector de char. charAt nos devuelve la posición (0,1,2,3,4,5,6,7)
			int valorDigito = digitoChar-0x30; // '5' - 30h = 5 (35h-30h)
			suma += valorDigito;
		}
		int resto = suma%4;
		if (resto == 0) return 'A';
		if (resto ==1) return 'B';
		if (resto == 2) return 'C';
		return 'D';
	}

	/**
	 * Retorna el toString de la clase
	 * @return boolean 
	 */
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	

	
	
	
}
