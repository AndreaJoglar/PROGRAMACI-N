package ejercicio_01;

public class Banco {

	private Cuenta [] cuentas;
	private int contCuentas;
	
	/**
	 * Constructor sin parametros
	 */
	public Banco() {
		this.cuentas = new Cuenta [4];
		this.contCuentas = 0;
	}

	/**
	 * Metodo get del atributo cuentas
	 * @return cuentas vector de Cuenta
	 */
	public Cuenta[] getCuentas() {
		return cuentas;
	}

	/**
	 * Metodo set del atributo cuentas
	 * @param cuentas vector de Cuenta
	 */
	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	/**
	 * Metodo get del contador de cuentas
	 * @return contCuentas entero
	 */
	public int getContCuentas() {
		return contCuentas;
	}

	/**
	 * Metodo set del contador de cuentas
	 * @param contCuentas entero
	 */
	public void setContCuentas(int contCuentas) {
		this.contCuentas = contCuentas;
	}

	@Override
	public String toString() {
		String texto = "Cuentas del banco:\n";
		
		for (int i = 0; i < this.contCuentas; i++) {
			texto += cuentas[i] + "\n";
		}
		return texto;
	}
	
	/**
	 * Permite meter una cuenta en el banco
	 * @param c Cuenta
	 */
	public void addCuenta (Cuenta c) {
		if (this.contCuentas < cuentas.length) {
			cuentas[contCuentas] = c;
			contCuentas++;
		} else {
			System.out.println("ERROR. Límite de cuentas alcanzado.");
		}
	}
	
	
	
	
	
}
