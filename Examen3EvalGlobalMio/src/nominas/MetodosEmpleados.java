package nominas;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class MetodosEmpleados {

	
	static ArrayList<Empleados> listaEmpleados= new ArrayList<Empleados>();
	//static ArrayList<Empleados> listaEmpleadosSave= new ArrayList<Empleados>();
	
	
	
	public static void crearEmpleado() {
		
		Scanner sc = new Scanner(System.in);
		
		
		String nombre = JOptionPane.showInputDialog("Cual es su nombre");
		
		String apellido1 = JOptionPane.showInputDialog("Cual es su primer apellido");
		
		String apellido2 = JOptionPane.showInputDialog("Cual es su segundo apellido");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Cual es su edad"));
		
		int fechaIncor = Integer.parseInt(JOptionPane.showInputDialog("En que año se incorporo?"));
		
		int deptno = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su departamento?" + "\n1-Ventas" + "\n2-Produccion" + "\n3-Mantenimiento"));
		
		if (deptno==1) {
			int respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha vendido?"));
			double comision = respuesta * 0.2;
			int sueldo = (int) (500+comision);
			boolean riesgo=false;
			
			Empleados empleadoV = new Empleados( Departamento.VENTA, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo);
			listaEmpleados.add(empleadoV);
			
		}
		if (deptno==2) {
			int respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Manipula producctos de riesgo?"+ "\n1-Si" + "\n2-no"));
			boolean riesgo=false;
			if (respuesta == 1) {
				riesgo = true;
				int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha producido?"));
				double comision = producctos * 25;
				int sueldo = (int) (500+comision);
				Empleados empleadoP = new Empleados(Departamento.PRODUCCION, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo );
				listaEmpleados.add(empleadoP);
			}
			if (respuesta == 2) {
				riesgo = false;
				int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha producido?"));
				double comision = producctos * 25;
				int sueldo = (int) (500+comision);
				Empleados empleadoP = new Empleados(Departamento.PRODUCCION, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo);
				listaEmpleados.add(empleadoP);
			}
		}
		if (deptno==3) {
			int respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Manipula producctos de riesgo?" + "\n1-Si" + "\n2-no"));
			boolean riesgo=false;
			if (respuesta == 1) {
				riesgo = true;
				int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha mantenido?"));
				double comision = producctos * 10;
				int sueldo = (int) (500+comision);
				Empleados empleadoM = new Empleados(Departamento.MANTENIMIETNO, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo);
				listaEmpleados.add(empleadoM);
			}
			if (respuesta == 2) {
				riesgo = false;
				int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha mantenido?"));
				double comision = producctos * 10;
				int sueldo = (int) (500+comision);
				Empleados empleadoM = new Empleados(Departamento.MANTENIMIETNO, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo);
				listaEmpleados.add(empleadoM);
			}
		}
		
		sc.close();
	}
	
	
	public static void mostrarEmpleados() {
		
		
		try {
		//Empleados no guardados
		for (int i=0; i<listaEmpleados.size();i++ ) {
			JOptionPane.showMessageDialog( null, listaEmpleados.get(i).palabras());
			
		}
		
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	public static void guardarEmpleados() {
		try {
			
			FileWriter escritura = new FileWriter("C:/Users/ram/Desktop/empleados.txt", true);
			for (int i=0; i<listaEmpleados.size();i++ ) {
				System.out.println(listaEmpleados.get(i));
				escritura.write(listaEmpleados.get(i) +"\n");
				}
			
			escritura.close();
		} catch (Exception e) {
			System.out.println("No se puede gerenrar el archivo");
			e.printStackTrace();
		}
	}
	
	
	public static void mostrarEmpleadosGuardados() {
		try {
			BufferedReader bufferLecura = new BufferedReader(new FileReader("C:/Users/ram/Desktop/empleados.txt"));
		    
			   String lineaSalida = null;
			   while ((lineaSalida = bufferLecura.readLine()) != null){
		            JOptionPane.showMessageDialog(null, lineaSalida);
				
			}
			
			   bufferLecura.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void bucarEmpleado(String name) {
		for (int i=0; i<listaEmpleados.size(); i++) {
			if (name.equals(listaEmpleados.get(i).getNombre())) {
				System.out.println(listaEmpleados.get(i).toString());
			}
			
		}
		
		
	}
	
	
	public static void mostrarEmpleadoDat() {
		try {
			
			
			ObjectInputStream recuperandoFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\ram\\Desktop\\empleados.dat"));
			
			ArrayList<Empleados> personalRecuperado= new ArrayList<Empleados>();
			
			personalRecuperado= ((ArrayList<Empleados>) recuperandoFichero.readObject());
			
			recuperandoFichero.close();
			
			for(Empleados e: personalRecuperado) {
				
				JOptionPane.showMessageDialog(null, e);
				System.out.println(e);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
	public static void archivosSerializados() {
		
			
		try {
			
			
			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ram\\Desktop\\empleados.dat"));
			
			escribiendoFichero.writeObject(listaEmpleados);
			
			escribiendoFichero.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void cargarDatos() {
		

		try {	
			
			FileReader archivo_lectura = new FileReader("C:/Users/ram/Desktop/empleados.txt");
			
			BufferedReader miBuffer = new BufferedReader(archivo_lectura);
					
			String[] atributos;// Son 9 atributos 
			
			if (miBuffer.readLine() == null ) {
			       System.out.println("No errors, and file empty");
			
				while(miBuffer.read() != -1) {
					
					
					/*
					 * SEPARAMOS LOS ";" Y SE AÑADEN AL ARRAYLIST LOS DATOS SEPARADOS
					 */
					String line = miBuffer.readLine();
					atributos = line.split(";");
					Departamento departamento = Departamento.valueOf(atributos[0]);
					listaEmpleados.add(new Empleados(departamento, atributos[1], atributos[2], atributos[3], Integer.parseInt(atributos[4]), Integer.parseInt(atributos[5]), Integer.parseInt(atributos[6]), Double.parseDouble(atributos[7]), Boolean.parseBoolean(atributos[8])));
				}
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	
}
