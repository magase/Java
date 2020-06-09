package nominas;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class MetodosEmpleados {

	
	static ArrayList<Empleados> listaEmpleados= new ArrayList<Empleados>();
	//static ArrayList<Empleados> listaEmpleadosSave= new ArrayList<Empleados>();
	
	
	
	public static void crearEmpleado() {
		try {


			Scanner sc = new Scanner(System.in);

			String nombre = JOptionPane.showInputDialog("Cual es su nombre");
			nombre.toLowerCase();

			String apellido1 = JOptionPane.showInputDialog("Cual es su primer apellido");
			apellido1.toLowerCase();

			String apellido2 = JOptionPane.showInputDialog("Cual es su segundo apellido");
			apellido2.toLowerCase();

			int edad = Integer.parseInt(JOptionPane.showInputDialog("Cual es su edad"));

			int fechaIncor = Integer.parseInt(JOptionPane.showInputDialog("En que a�o se incorporo?"));

			int deptno = Integer.parseInt(JOptionPane.showInputDialog("�Cual es su departamento?" + "\n1-Ventas" + "\n2-Produccion" + "\n3-Mantenimiento"));
			UUID idEmpleado = UUID.randomUUID();
			if (deptno == 1) {
				int respuesta = Integer.parseInt(JOptionPane.showInputDialog("�Cuantos productos ha vendido?"));
				double comision = respuesta * 0.2;
				int sueldo = (int) (500 + comision);
				boolean riesgo = false;

				Empleados empleadoV = new Empleados(Departamento.VENTA, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo, idEmpleado);
				//oos.writeObject(empleadoV);
				listaEmpleados.add(empleadoV);

			}
			if (deptno == 2) {
				int respuesta = Integer.parseInt(JOptionPane.showInputDialog("�Manipula producctos de riesgo?" + "\n1-Si" + "\n2-no"));
				boolean riesgo = false;
				if (respuesta == 1) {
					riesgo = true;
					int producctos = Integer.parseInt(JOptionPane.showInputDialog("�Cuantos productos ha producido?"));
					double comision = producctos * 25;
					int sueldo = (int) (500 + comision);
					Empleados empleadoP = new Empleados(Departamento.PRODUCCION, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo, idEmpleado);
					//oos.writeObject(empleadoP);
					listaEmpleados.add(empleadoP);
				}
				if (respuesta == 2) {
					riesgo = false;
					int producctos = Integer.parseInt(JOptionPane.showInputDialog("�Cuantos productos ha producido?"));
					double comision = producctos * 25;
					int sueldo = (int) (500 + comision);
					Empleados empleadoP = new Empleados(Departamento.PRODUCCION, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo, idEmpleado);
					//oos.writeObject(empleadoP);
					listaEmpleados.add(empleadoP);
				}
			}
			if (deptno == 3) {
				int respuesta = Integer.parseInt(JOptionPane.showInputDialog("�Manipula producctos de riesgo?" + "\n1-Si" + "\n2-no"));
				boolean riesgo = false;
				if (respuesta == 1) {
					riesgo = true;
					int producctos = Integer.parseInt(JOptionPane.showInputDialog("�Cuantos productos ha mantenido?"));
					double comision = producctos * 10;
					int sueldo = (int) (500 + comision);
					Empleados empleadoM = new Empleados(Departamento.MANTENIMIETNO, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo, idEmpleado);
					//oos.writeObject(empleadoM);
					listaEmpleados.add(empleadoM);
				}
				if (respuesta == 2) {
					riesgo = false;
					int producctos = Integer.parseInt(JOptionPane.showInputDialog("�Cuantos productos ha mantenido?"));
					double comision = producctos * 10;
					int sueldo = (int) (500 + comision);
					Empleados empleadoM = new Empleados(Departamento.MANTENIMIETNO, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo, idEmpleado);
					//oos.writeObject(empleadoM);
					listaEmpleados.add(empleadoM);
				}
			}

			sc.close();

		}catch (Exception e){
			e.printStackTrace();
		}
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
			
			FileWriter escritura = new FileWriter("C:/Users/ram/Desktop/empleados.txt");
			for (int i=0; i<listaEmpleados.size();i++ ) {
				System.out.println(listaEmpleados.get(i).palabras());
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
		name.toLowerCase();
		for (int i=0; i<listaEmpleados.size(); i++) {
			if (name.equals(listaEmpleados.get(i).getNombre())) {
				System.out.println(listaEmpleados.get(i).toString());
				JOptionPane.showMessageDialog(null, listaEmpleados.get(i).palabras());
			}
		}
	}
	
	
	public static void desSerializarDatos() {
		try {
			//File f = new File("C:\\Users\\ram\\Desktop\\empleados.dat");
			FileInputStream fis = new FileInputStream("C:\\Users\\ram\\Desktop\\empleados.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			listaEmpleados = (ArrayList) ois.readObject();
			for (int i =0; i<listaEmpleados.size();i++) {
				JOptionPane.showMessageDialog(null, listaEmpleados.get(i));
			}


		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
	public static void serializarDatos() {
		try {
			//File f = new File("C:\\Users\\ram\\Desktop\\empleados.dat");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\ram\\Desktop\\empleados.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(listaEmpleados);
			oos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void cargarDatos() {
		try {
			//File f = new File("C:\\Users\\ram\\Desktop\\empleados.dat");
			FileInputStream fis = new FileInputStream("C:\\Users\\ram\\Desktop\\empleados.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			listaEmpleados = (ArrayList) ois.readObject();
			for (int i =0; i<listaEmpleados.size();i++) {
				listaEmpleados.add(listaEmpleados.get(i));
			}


		}catch(Exception e) {
			e.printStackTrace();
		}
		}

	public static void borrarEmpleado(String nombre) {
		nombre.toLowerCase();
		for (int i=0; i<listaEmpleados.size();i++){
			String nombreEmpleado = listaEmpleados.get(i).getNombre();
			if (nombre.equals(nombreEmpleado)){
				listaEmpleados.remove(i);
				JOptionPane.showMessageDialog(null, "Empleado borrado correctamente");
			}
		}

	}


}
