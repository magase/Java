package bbdd_Profesores;

import java.util.Calendar;

public class ProfesorInterino extends Profesor{

	protected Calendar FechaComienzoInterinidad = Calendar.getInstance();
	protected int año, mes, dia; 
	
	public ProfesorInterino(String nombre, String apellido, int edad, int año, int mes, int dia) {
		super(nombre, apellido, edad);
		FechaComienzoInterinidad.set (año, mes, dia);// int año, int mes, int dia //PREGUNTAR A IRMA LA FECHA
	}

	@Override
	public String toString() {
		return "Profesor Interino\n" + "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: "+ edad + "\nComenzó en..."  + año + mes + dia;
	}

	
}
