package nominas;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.ArrayList;
import javax.swing.*;
public interface MetodosEmpleados {

	
	ArrayList<Empleados> listaEmpleados= new ArrayList<Empleados>();
	
	
	public static void crearEmpleado() {
		
		Scanner sc = new Scanner(System.in);
		
		
		String nombre = JOptionPane.showInputDialog("Cual es su nombre");
		
		String apellido = JOptionPane.showInputDialog("Cual es su apellido");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Cual es su edad"));
		
		int fechaIncor = Integer.parseInt(JOptionPane.showInputDialog("En que año se incorporo?"));
		
		int deptno = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su departamento?\\n1-Ventas\\n2-Produccion\\n3-Mantenimiento"));
		
		if (deptno==1) {
			int respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha vendido?"));
			double comision = respuesta * 0.2;
			int sueldo = (int) (500+comision);
			
			Empleados empleadoV = new Venta(nombre, apellido, edad, sueldo, fechaIncor, comision );
			listaEmpleados.add(empleadoV);
			
		}
		if (deptno==2) {
			int respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Manipula producctos de riesgo? \n1-Si \n2-no"));
			boolean riesgo=false;
			if (respuesta == 1) {
				riesgo = true;
				int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha producido?"));
				double comision = producctos * 25;
				int sueldo = (int) (500+comision);
				Empleados empleadoP = new Produccion(nombre, apellido, edad, sueldo, fechaIncor, comision, riesgo );
				listaEmpleados.add(empleadoP);
			}
			if (respuesta == 2) {
				riesgo = false;
				int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha producido?"));
				double comision = producctos * 25;
				int sueldo = (int) (500+comision);
				Empleados empleadoP = new Produccion(nombre, apellido, edad, sueldo, fechaIncor, comision, riesgo );
				listaEmpleados.add(empleadoP);
			}
		}
		if (deptno==3) {
			int respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Manipula producctos de riesgo? \n1-Si \n2-no"));
			boolean riesgo=false;
			if (respuesta == 1) {
				riesgo = true;
				int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha mantenido?"));
				double comision = producctos * 10;
				int sueldo = (int) (500+comision);
				Empleados empleadoM = new Mantenimiento(nombre, apellido, edad, sueldo, fechaIncor, comision, riesgo );
				listaEmpleados.add(empleadoM);
			}
			if (respuesta == 2) {
				riesgo = false;
				int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha mantenido?"));
				double comision = producctos * 10;
				int sueldo = (int) (500+comision);
				Empleados empleadoM = new Mantenimiento(nombre, apellido, edad, sueldo, fechaIncor, comision, riesgo );
				listaEmpleados.add(empleadoM);
			}
		}
		
		sc.close();
	}
	
	
	public static void mostrarEmpleados() {
		
		
		for (int i=0; i<listaEmpleados.size();i++ ) {
			JOptionPane.showMessageDialog( null, listaEmpleados.get(i));
			
		}
		
	}
	
	public static void guardarEmpleados() {
		try {
			ObjectOutputStream guardarEmpleados = new ObjectOutputStream(new FileOutputStream("C:/Users/ram/Desktop/empleados.txt"));
			
			guardarEmpleados.writeObject(listaEmpleados);
			
			guardarEmpleados.close();
			
		} catch (IOException e) {
			System.out.println("No se puede gerenrar el archivo");
			e.printStackTrace();
		}
	}
	
	
	
}
