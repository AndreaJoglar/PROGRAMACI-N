package Ejer2;

import java.util.Random;


public class Simulador {
	/**
	 * @param numMensajes
	 * 
	 */
	public Mensaje[] crearSimulacion(int numMensajes) {
		Random generador = new Random();
		int codIncidencia;
		double time;
		byte prioridad;
		String descripcion = "";
		byte tipo;
		Mensaje mensajes[] = new Mensaje[numMensajes];

		for (int x = 0; x < 100; x++) {
			codIncidencia = generador.nextInt(20);
			time = generador.nextInt(10000);
			prioridad = (byte) generador.nextInt(2);
			tipo = (byte) generador.nextInt(4);

			switch (tipo) {
			case (Mensaje.INFO):
				switch (generador.nextInt(20)) {
				case 0:
					descripcion = "Mi rat�n se mueve al contrario";
					break;
				case 1:
					descripcion = "Mi monitor se ha mojado y ya no funciona";
					break;
				case 2:
					descripcion = "Se me ha perdido el cable de conexi�n";
					break;
				case 3:
					descripcion = "No encuentro los iconos";
					break;
				case 4:
					descripcion = "El Guindous ha desaparecido";
					break;
				case 5:
					descripcion = "Yo no he sido";
					break;
				case 6:
					descripcion = "El Ordenador no me hace caso";
					break;
				case 7:
					descripcion = "Por m�s que le echo typex a la pantalla no se borra";
					break;
				case 8:
					descripcion = "El ordenador no me hace caso";
					break;
				default:
					descripcion = "solo veo una pantalla azul";
					break;
				}
				break;
			case Mensaje.CERRAR:
				descripcion = "ya funciona";
				break;
			case Mensaje.ACTUACION:
				descripcion = "de ha cambiado el componente afectado";
				break;
			}

			mensajes[x] = new Mensaje(codIncidencia, time, prioridad,
					descripcion, tipo);

		}
		return mensajes;
	}
}