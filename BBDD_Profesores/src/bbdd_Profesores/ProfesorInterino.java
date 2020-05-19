package bbdd_Profesores;

import java.util.Calendar;

public class ProfesorInterino extends Profesor{

	protected Calendar FechaComienzoInterinidad = Calendar.getInstance();
	protected int a�o, mes, dia; 
	
	public ProfesorInterino(String nombre, String apellido, int edad, int a�o, int mes, int dia) {
		super(nombre, apellido, edad);
		FechaComienzoInterinidad.set (a�o, mes, dia);// int a�o, int mes, int dia //PREGUNTAR A IRMA LA FECHA
	}

	@Override
	public String toString() {
		return "Profesor Interino\n" + "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: "+ edad + "\nComenz� en..."  + a�o + mes + dia;
	}

	
}
