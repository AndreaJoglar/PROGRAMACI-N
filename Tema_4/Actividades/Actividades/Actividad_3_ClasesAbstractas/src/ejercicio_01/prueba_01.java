package ejercicio_01;

public class prueba_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura v[] = new Figura [3];
		v[0] = new Cuadrado (2);
		v[1] = new Triangulo (2, 5);
		v[2] = new Circulo (2.45);
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Área = "+v[i].area());
		}
	}

}
