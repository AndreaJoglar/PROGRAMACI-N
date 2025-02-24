package ejercicio_03;

public class Colegio {

	private Persona [] v;
	
	/**
	 * Constructor por defecto
	 */
	public Colegio() {
		v = null;
	}
	
	/**
	 * Metodo que permite insertar una persona en el colegio
	 * @param p Persona
	 */
	public void insertarPersona(Persona p) {
		if (v == null) {
			v = new Persona [1];
			v[0] = p;
		}
		else {
			int nuevoTam = v.length + 1;
			Persona [] vNuevo = new Persona [nuevoTam];
			
			for (int i = 0; i < v.length; i++) {
				vNuevo[i] = v[i];
			}
			int pos = nuevoTam - 1;
			vNuevo [pos] = p;
			v = vNuevo;
		}
	}
	
	/**
	 * Metodo que lista los elementos de un colegio
	 */
	public void listarColegio() {
		for (int i = 0; i < v.length; i++) {
			v[i].identificate();
		}
	}

	/**
	 * Metodo para buscar una persona a partir de un dni
	 * @param dni String
	 * @return Persona
	 */
	public Persona buscarPersona(String dni) {
		for (int i = 0; i < v.length; i++) {
			Persona p = v[i];
			if (p.getDni().compareTo(dni) == 0) {
				return p;
			}
		}
		return null;
	}
	
	/**
	 * Metodo para borrar una persona a partir del dni
	 * @param dni String
	 */
	public void borrarPersona(String dni) {
		int pos = -1;
		
		for (int i = 0; i < v.length; i++) {
			Persona p = v[i];
			if (p.getDni().compareTo(dni) == 0) {
				pos = i;
			}
		}
		
		if (pos != -1) {//encontré a la persona
			int nuevoTam = v.length-1;
			Persona [] vNuevo  = new Persona [nuevoTam];
			
			for (int i = 0; i < pos; i++) {
				vNuevo[i] = v [i];
			}
			for (int i = pos+1; i < v.length; i++) {
				vNuevo[i-1] = v[i];
			}
			
			v = vNuevo;
			
		}
		
	}
}
