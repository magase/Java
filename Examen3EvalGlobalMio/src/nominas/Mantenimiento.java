package nominas;

public class Mantenimiento extends Empleados{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean riesgo;
	
	public Mantenimiento(String nombre, String apellido1, String apellido2, int edad, int sueldo, int fechaIncor,
			double comision, boolean riesgo) {
		super(nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision);
		
		this.riesgo = riesgo;
	}

	public boolean getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(boolean riesgo) {
		this.riesgo = riesgo;
	}
	
	

}
