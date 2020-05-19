package bbdd_Profesores;
import java.util.UUID;

public class Profesor extends Personas{
 

	 UUID IdProfesor;
	public Profesor() {
		//SIN PARAMETROS
	}
	public Profesor(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		IdProfesor = UUID.randomUUID();
		IdProfesor.toString();
	}

	public UUID getIdProfesor() {
		return IdProfesor;
	}

	public void setIdProfesor(UUID IdProfesor) {
		this.IdProfesor = IdProfesor;
	}

	@Override
	public String toString() {
		return "El profesor es: " + nombre + " " + apellido + "\nTiene: " + edad + " años " + "\nSu id es: " + IdProfesor;
	}
	
	

}
