package serializacion_youtube;

import java.util.*;
import java.util.GregorianCalendar;
import java.io.*;

public class Empleado implements Serializable{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1554338471010425308L;
	
	private String nombre;
	private double sueldos;
	private Date fechaContrato;

	public Empleado(String n, double s, int agno, int mes, int dia ) {
		nombre =n;
		sueldos =s; 
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		fechaContrato = calendario.getTime();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSueldo() {
		
		return sueldos;
	}
	
	public Date getFechaContrato() {
		
		return fechaContrato;
	}
	
	public void subirSueldo(double porcentaje) {
		double aumento=sueldos*porcentaje/100;
		sueldos += aumento;
	}
	
	public String toString() {
		return "Nombre " + nombre + ", sueldo " + sueldos + ", fecha de contratacion " + fechaContrato;
	}
}
