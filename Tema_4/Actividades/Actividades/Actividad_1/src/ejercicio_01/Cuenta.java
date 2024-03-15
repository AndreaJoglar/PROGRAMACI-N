package ejercicio_01;

public class Cuenta {

	//Atributos
	private String titular;
	private double cantidad;
	
	//Creamos constructores (uno con dos parámetros y otro solo con el obligatorio
	/**
	 * Constructor con dos parametros
	 * @param titular String
	 * @param cantidad real
	 */
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	/**
	 * Constructor con un parametro obligatorio
	 * @param titular String
	 */
	//Aunque solo tenga un parámetro obligatorio, el constructor tiene que inicializar los dos parámetros
	public Cuenta (String titular) {
		this.titular = titular;
		this.cantidad = 0.0;
	}

	//Generamos getters y setters. Sirven para modificar los atributos individualmente
	/**
	 * Metodo get del atributo titular
	 * @return String
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * Metodo set del atributo titular
	 * @param titular String
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * Metodo get del atributo cantidad
	 * @return real
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * Metodo set del atributo cantidad 
	 * @param cantidad real
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	//creamos toString. Muestra por pantalla TODOS los atributos de la clase.
	//Si queremos mostrar solo un atributo, habría que crear otro método.
	@Override
	/**
	 * Metodo toString de la clase Cuenta
	 */
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	//Método para ingresar dinero en cuenta
	/**
	 * Metodo que permite incrementar la cantidad de dinero de una cuenta
	 * @param cantidad real
	 */
	public void ingresar (double cantidad) {
		if (cantidad>0) {
			this.cantidad+=cantidad; //usar el this. siempre para el atributo
		}
		
	}
	
	//Método para retirar dinero de la cuenta
	/**
	 * Metodo que permite restar una cantidad de dinero a una cuenta
	 * @param cantidad real
	 */
	public void retirar (double cantidadRetirada) {
		if (this.cantidad<cantidadRetirada) {
			this.cantidad=0;
		}
		else {
			this.cantidad-=cantidadRetirada;
		}
	}
	
	
	
	
	
}
