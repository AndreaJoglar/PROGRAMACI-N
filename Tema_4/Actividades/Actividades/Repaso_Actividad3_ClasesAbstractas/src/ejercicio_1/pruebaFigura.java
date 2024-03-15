package ejercicio_1;

public class pruebaFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura [] v = new Figura [3];
		v[0] = new Cuadrado(3);
		v[1] = new Circulo(10);
		v[2] = new Triangulo(3, 4);
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Área = " + v[i].area());
		}
	}

}
