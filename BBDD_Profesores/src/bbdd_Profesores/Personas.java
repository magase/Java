package bbdd_Profesores;

public class Personas {
	
	
	protected String nombre, apellido;
	protected int edad;

//CONSTRUTORES
	public Personas() {
		nombre=null;
		apellido=null;
		edad = 0;
	}
	
	public Personas(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}



//GETTERS Y SETTERS 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
