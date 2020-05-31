package nominas;

public class Venta extends Empleados{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Venta(String nombre, String apellido1, String apellido2, int edad, int sueldo, int fechaIncor,
			double comision, Departamento deptno) {
		super(nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, deptno);
		
	}

	

}
