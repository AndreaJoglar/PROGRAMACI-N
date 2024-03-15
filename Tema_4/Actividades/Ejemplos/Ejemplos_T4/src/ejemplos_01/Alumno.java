package ejemplos_01;

public class Alumno {//ATENCI�N: Las clases siempre se tienen que llamar igual que el nombre del fichero
					 //ATENCI�N 2: Las clases siempre empiezan por may�scula
	
	//Atributos. Por convenio suelen ser privados (solo accesibles desde el fichero)
	private String dni;
	private String nombre;
	private int edad; //Si no ponemos nada, es accesible desde todo el paquete. Nivel package
	
	
	//Generamos getters y setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Generamos constructores
	public Alumno(String d, String n, int e) {//Constructor para inicializar los datos
		this.dni=d; //this. hace referencia a atributo. Esto asegura que el programa diferencia entre atributo y par�metro
		nombre=n;
		edad=e;
	}
	
	public Alumno() {//Constructor que no tiene par�metros y los metemos directamente
		dni = "00000000E";
		nombre="Mariana";
		edad=0;
	}
	
	public Alumno (String n,int e) {//Constructor que tiene dos par�metros
		dni="X";
		nombre=n;
		edad=e;
		
	}
	
	//Idea de polimorfismo.

	//M�todo para mostrar los atributos
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
}
