package EjemplosClase;

public class EjemploNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7;
		int b = 3;
		
		int r1 = a/b;
		float r2 = a/b;
		
		System.out.println("r1 int: "+r1);
		System.out.println("r2 float: "+r2);
		
		////////////////////////////////////
		
		float a1 = 7;
		float b1 = 3;
		
		int resul1 = (int) (a1/b1);
		float resul2 = a1/b1;
		double resul3 = a1/b1;
		
		System.out.println("resul1 int: "+resul1);
		System.out.println("resul2 float: "+resul2);
		System.out.println("resul3 double: "+resul3);
		
		////////////////////////////////////
		// ¿7/3.2 qué es? -> real (natural entre real siempre va a ser real)
		//¿7.23/3 qué es?
		
		int a2 = 7;
		float b2 = 3.2f;
		
		int resul4 =  (int) (a2/b2);
		
		System.out.println("resul4 int: "+resul4);
		

	}

}
