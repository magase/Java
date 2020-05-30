package nominas;
import java.util.*;
import java.util.ArrayList;

public interface MetodosEmpleados {

	
	ArrayList<Empleados> listaEmpleados= new ArrayList<Empleados>();
	
	
	public static void crearEmpleado() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cual es su nombre?");
		String nombre = sc.nextLine();
		
		System.out.println("Cual es su apellido?");
		String apellido = sc.nextLine();
		
		System.out.println("Que edad tiene?");
		int edad = sc.nextInt();
		
		System.out.println("En que año se incorporo?");
		int fechaIncor = sc.nextInt();
		
		System.out.println("¿Cual es su departamento?\n1-Ventas\n2-Produccion\n3-Mantenimiento");
		//sc.nextInt();
		int deptno = sc.nextInt();
		//String ventas="ventas";
		//String produccion="produccion";
		//String mantenimiento="mantenimiento";
		
		if (deptno==1) {
			System.out.println("¿Cuantos productos ha vendido?");
			// sc.nextInt();
			int respuesta = sc.nextInt();
			double comision = respuesta * 0.2;
			int sueldo = (int) (500+comision);
			
			Empleados empleadoV = new Venta(nombre, apellido, edad, sueldo, fechaIncor, comision );
			listaEmpleados.add(empleadoV);
			empleadoV.toString();
			
		}
		if (deptno==2) {
			System.out.println("¿Manipula producctos de riesgo?");
			String respuesta = sc.nextLine();
			respuesta.toLowerCase();
			boolean riesgo=false;
			if (respuesta == "si") {
				riesgo = true;
			}
			if (respuesta == "no") {
				riesgo = false;
			}else {
				System.out.println("Cuantos producctos ha producido?");
				int producctos = sc.nextInt();
				double comision = producctos * 25;
				int sueldo = (int) (500+comision);
				Empleados empleadoP = new Produccion(nombre, apellido, edad, sueldo, fechaIncor, comision, riesgo );
				listaEmpleados.add(empleadoP);
				
			}
		}
		if (deptno==3) {
			System.out.println("¿Manipula producctos de riesgo?");
			String respuesta = sc.nextLine();
			respuesta.toLowerCase();
			boolean riesgo=false;
			if (respuesta == "si") {
				riesgo = true;
			}
			if (respuesta == "no") {
				riesgo = false;
			}else {
				System.out.println("Cuantos producctos ha producido?");
				int producctos = sc.nextInt();
				double comision = producctos * 25;
				int sueldo = (int) (500+comision);
				Empleados empleadoM = new Produccion(nombre, apellido, edad, sueldo, fechaIncor, comision, riesgo );
				listaEmpleados.add(empleadoM);
				
				
			}
		}
		
		sc.close();
	}
	
	
	public static void mostrarEmpleados() {
		
		for (Empleados e: listaEmpleados) {
			e.toString();
		}
	}
	
	
	
}
