package nominas;

import java.io.Serializable;

public abstract class Empleados implements MetodosEmpleados, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nombre, apellido1, apellido2;
	int edad, sueldo;
	int fechaIncor;
	double comision;
	
	public Empleados(String nombre, String apellido1, String apellido2, int edad, int sueldo, int fechaIncor, double comision) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.sueldo = sueldo;
		this.fechaIncor = fechaIncor;
		this.comision = comision;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
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

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public void setApellidos(String apellido2) {
		this.apellido2 = apellido2;
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
		return "Empleados nombre= " + nombre + ", primer apellido= " + apellido1 + ", segundo apellido= " + apellido2 + ", edad= " + edad + ", sueldo= " + sueldo
				+ ", fechaIncor= " + fechaIncor + ", comision= " + comision;
	}
	
	
	
	
	
	

}
