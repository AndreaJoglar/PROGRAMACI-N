package ejercicio_07;

public class Polideportivo {

	//Atributos
	private String nombre;
	private String direccion;
	private int extension;
	//también tiene un conjunto de pistas. 
	//Vamos a plantear que vamos a tener el tamaño exacto de pistas que tiene el poli
	private Pista pistas [];
	
	
	/**
	 * Constructor con los parametros
	 * @param nombre String
	 * @param direccion String
	 * @param extension entero
	 */
	public Polideportivo(String nombre, String direccion, int extension) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.extension = extension;
		pistas = new Pista [0];
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
	 * Metodo get del atributo direccion
	 * @return String
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Metodo set del atributo direccion
	 * @param direccion String
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo get del atributo extension
	 * @return entero
	 */
	public int getExtension() {
		return extension;
	}

	/**
	 * Metodo set del atributo extension
	 * @param extension entero
	 */
	public void setExtension(int extension) {
		this.extension = extension;
	}
	
	/**
	 * Metodo get del atributo pistas
	 * @return Pista
	 */
	public Pista[] getPistas() {
		return pistas;
	}

	/**
	 * Metodo set del atributo pistas
	 * @param pistas Pista
	 */
	public void setPistas(Pista[] pistas) {
		this.pistas = pistas;
	}

	@Override
	public String toString() {
		String texto = "Polideportivo [nombre=" + nombre + ", direccion=" + direccion + ", extension=" + extension + "]\n";
		
		for (int i = 0; i < pistas.length; i++) {
			texto+="\t"+pistas[i].toString()+"\n";
		}
		return texto;
		
	}
	
	//Forma alternativa de añadir una pista al polideportivo sin necesidad de contador
	/**
	 * Permite agregar una pista al polideportivo
	 * @param codigo entero
	 * @param tipo enumeracion TipoPista
	 * @param estaOperativa boolean
	 * @param precio real
	 * @param fechaUltimaReserva String
	 */
	public void addPista (int codigo, TipoPista tipo, boolean estaOperativa, double precio, String fechaUltimaReserva) {
		
		Pista pNueva = new Pista (codigo, tipo, estaOperativa, precio, fechaUltimaReserva);
		
		int tam = pistas.length;
		int nuevoTam = pistas.length+1;
		
		Pista nuevoVector [] = new Pista [nuevoTam];
		
		for (int i = 0; i < tam; i++) {
			nuevoVector[i]= pistas[i];	
		}
		
		int posNuevo = nuevoTam - 1;
		nuevoVector [posNuevo] = pNueva;
		
		pistas = nuevoVector;
	}
	
	/**
	 * Metodo para eliminar una pista del polideportivo
	 * @param pos entero
	 */
	public void eliminarPista (int pos) {
		int tamNuevo = pistas.length-1;
		Pista nuevoV [] = new Pista [tamNuevo];
		
		for (int i = 0; i < pos; i++) {
			nuevoV[i]= pistas[i];
		}
		
		for (int i = pos; i < tamNuevo; i++) {
			nuevoV[i]=pistas [i+1];
		}
		
		this.pistas = nuevoV;
	}
	
	public Pista getPista (int pos) {
		if (pos >=0 && pos < pistas.length) {
			return pistas[pos];
		}
		return null;
	}
	
	
	
	
}
