package nominas;

import java.io.Serializable;

public class Empleados implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Departamento departamento;
	String nombre, apellido1, apellido2;
	int edad, sueldo;
	int fechaIncor;
	double comision;
	boolean riesgo;
	
	public Empleados() {
		
	}
	
	public Empleados( Departamento departamento, String nombre, String apellido1, String apellido2, int edad, int sueldo, int fechaIncor, double comision, boolean riesgo ) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.sueldo = sueldo;
		this.fechaIncor = fechaIncor;
		this.comision = comision;
		this.riesgo = riesgo;
		this.departamento = departamento;
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
	
	public boolean getRiesgo() {
		return riesgo;
		
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public void setApellido2(String apellido2) {
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
	
	public void setRiesgo(boolean riesgo) {
		this.riesgo = riesgo;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public String palabras() {
		return "Departamento= " + departamento +"\nNombre = "+ nombre + "\nPrimer apellido= " + apellido1 + "\nSegundo apellido= " + apellido2 + "\nEdad= " + edad + "\nSueldo= " + sueldo
				+ "\nFecha de incorporacion= " + fechaIncor + "\nComision es= " + comision + "\nRiesgo es= " + riesgo;
	}

	@Override
	public String toString() {
		return  departamento + ";" +nombre + ";" + apellido1 + ";" + apellido2 + ";" + edad + ";" + sueldo
				+ ";" + fechaIncor + ";" + comision + ";" + riesgo;
	}
	
	
	
	
	
	

}
