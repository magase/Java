package nominas;

public class Produccion extends Empleados{

	boolean riesgo;
	
	public Produccion(String nombre, String apellidos, int edad, int sueldo, int fechaIncor, double comision,
			boolean riesgo) {
		super(nombre, apellidos, edad, sueldo, fechaIncor, comision);
		
		this.riesgo = riesgo;
		
	}

}
