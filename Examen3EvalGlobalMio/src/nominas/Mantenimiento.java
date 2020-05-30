package nominas;

public class Mantenimiento extends Empleados{

	boolean riesgo;
	
	public Mantenimiento(String nombre, String apellidos, int edad, int sueldo, int fechaIncor, double comision,
			boolean riesgo) {
		super(nombre, apellidos, edad, sueldo, fechaIncor, comision);
		
		this.riesgo = riesgo;
	}

	public boolean getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(boolean riesgo) {
		this.riesgo = riesgo;
	}
	
	

}
