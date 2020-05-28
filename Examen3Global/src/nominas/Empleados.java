package nominas;


public class Empleados {

	String nombre, apellidos;
	int edad, sueldo;
	int fechaIncor;
	double comision;
	boolean riesgo;
	Departamento deptno;
	
	
	
	public Empleados(String nombre, String apellidos, int edad, int sueldo, int fechaIncor, double comision, boolean riesgo,
			Departamento deptno) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sueldo = sueldo;
		this.fechaIncor = fechaIncor;
		this.comision = comision;
		this.riesgo = riesgo;
		this.deptno = deptno;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public int getSueldo() {
		return this.sueldo;
	}
	public int getEdad() {
		return this.edad;
	}
	public boolean getRiesgo() {
		return this.riesgo;
	}
	public int getFechaIncor() {
		return this.fechaIncor;
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

	public void setRiesgo(boolean riesgo) {
		this.riesgo = riesgo;
	}

	public void setDeptno(Departamento deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Empleado nombre= " + nombre + ", apellidos= " + apellidos + ", edad= " + edad + ", sueldo= " + sueldo
				+ ", fechaIncor= " + fechaIncor + ", comisionVenta= " + comision + ", deptno= " + deptno + "\n";
	}



	
	
	
	
	
	
	
}

