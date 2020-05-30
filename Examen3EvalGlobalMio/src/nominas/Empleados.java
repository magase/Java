package nominas;

import java.io.Serializable;

public abstract class Empleados implements MetodosEmpleados, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nombre, apellidos;
	int edad, sueldo;
	int fechaIncor;
	double comision;
	
	public Empleados(String nombre, String apellidos, int edad, int sueldo, int fechaIncor, double comision) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sueldo = sueldo;
		this.fechaIncor = fechaIncor;
		this.comision = comision;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public int getSueldo() {
		return sueldo;
	}

	public int getFechaIncor() {
		return fechaIncor;
	}

	public double getComision() {
		return comision;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public void setFechaIncor(int fechaIncor) {
		this.fechaIncor = fechaIncor;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Empleados nombre= " + nombre + ", apellidos= " + apellidos + ", edad= " + edad + ", sueldo= " + sueldo
				+ ", fechaIncor= " + fechaIncor + ", comision= " + comision;
	}
	
	
	
	
	
	

}
