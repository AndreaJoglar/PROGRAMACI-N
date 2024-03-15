package Ejer2;


public class Mensaje {
	public final static int ALTA = 1;
	public final static int BAJA = 0;

	public final static int INFO = 0;
	public final static int CERRAR = 1;
	public final static int ACTUACION = 2;

	private int codIncidencia;
	private double time;
	private byte prioridad;
	private String descripcion;
	private byte tipo;

	public Mensaje(int ci, double t, byte pri, String desc, byte tip) {
		codIncidencia = ci;
		time = t;
		prioridad = pri;
		descripcion = desc;
		tipo = tip;
	}

	public String toString() {
		return codIncidencia + "-" + 
			time + "-" + 
			prioridad + "-" + 
			descripcion	+ "-" +
			tipo;
	}
}