package nominas;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class MetodosEmpleados {


	static ArrayList<Empleados> listaEmpleados= new ArrayList<Empleados>();

	
	
	public static void crearEmpleado() {
		try {

			String nombre = JOptionPane.showInputDialog("Cual es su nombre");
			nombre.toLowerCase();

			String apellido1 = JOptionPane.showInputDialog("Cual es su primer apellido");
			apellido1.toLowerCase();

			String apellido2 = JOptionPane.showInputDialog("Cual es su segundo apellido");
			apellido2.toLowerCase();
			int edad, fechaIncor;
			try {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Cual es su edad"));



				if (edad < 16 || edad >= 67) {
					JOptionPane.showMessageDialog(null, "No se puede inscribir con esa edad");
					return;
				}
				fechaIncor = Integer.parseInt(JOptionPane.showInputDialog("En que año se incorporo?"));
				if (fechaIncor < 1990 || fechaIncor > 2020){
					JOptionPane.showMessageDialog(null, "No se puede inscribir con esa fecha");
					return;
				}
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "No se puede inscribir con esos datos");
				e.printStackTrace();
				return;

			}
			int deptno = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su departamento?" + "\n1-Ventas" + "\n2-Produccion" + "\n3-Mantenimiento"));
			UUID idEmpleado = UUID.randomUUID();
			//Comprueba que al generar el ID de un empleado que ya exista no sea el mismo
			compararId(idEmpleado);


			if (deptno == 1) {
				int respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha vendido?"));
				double comision = respuesta * 0.2;
				int sueldo = (int) (500 + comision);
				boolean riesgo = false;

				Empleados empleadoV = new Empleados(Departamento.VENTA, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo, idEmpleado);
				listaEmpleados.add(empleadoV);

			}
			if (deptno == 2) {
				int respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Manipula producctos de riesgo?" + "\n1-Si" + "\n2-no"));
				boolean riesgo = false;
				if (respuesta == 1) {
					riesgo = true;
					int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha producido?"));
					double comision = producctos * 25;
					int sueldo = (int) (500 + comision);
					Empleados empleadoP = new Empleados(Departamento.PRODUCCION, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo, idEmpleado);
					listaEmpleados.add(empleadoP);
				}
				if (respuesta == 2) {
					riesgo = false;
					int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha producido?"));
					double comision = producctos * 25;
					int sueldo = (int) (500 + comision);
					Empleados empleadoP = new Empleados(Departamento.PRODUCCION, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo, idEmpleado);
					listaEmpleados.add(empleadoP);
				}
			}
			if (deptno == 3) {
				int respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Manipula producctos de riesgo?" + "\n1-Si" + "\n2-no"));
				boolean riesgo = false;
				if (respuesta == 1) {
					riesgo = true;
					int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha mantenido?"));
					double comision = producctos * 10;
					int sueldo = (int) (500 + comision);
					Empleados empleadoM = new Empleados(Departamento.MANTENIMIETNO, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo, idEmpleado);
					listaEmpleados.add(empleadoM);
				}
				if (respuesta == 2) {
					riesgo = false;
					int producctos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos ha mantenido?"));
					double comision = producctos * 10;
					int sueldo = (int) (500 + comision);
					Empleados empleadoM = new Empleados(Departamento.MANTENIMIETNO, nombre, apellido1, apellido2, edad, sueldo, fechaIncor, comision, riesgo, idEmpleado);
					listaEmpleados.add(empleadoM);
				}
			}


		}catch (Exception e){
			e.printStackTrace();
		}
	}


	public static void mostrarEmpleados() {

		try {
			for (int i=0; i<listaEmpleados.size();i++ ) {
				JOptionPane.showMessageDialog( null, listaEmpleados.get(i).palabras());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		 /*
		Iterator<Empleados> it=listaEmpleados.iterator();
		while (it.hasNext()){
			String nombreEmpleado = it.next().palabras();
			JOptionPane.showMessageDialog(null, nombreEmpleado);
		}
		*/
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
			String nombreE = listaEmpleados.get(i).getNombre().toLowerCase();
			if (name.equals(nombreE)) {
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
				JOptionPane.showMessageDialog(null, listaEmpleados.get(i).palabras());
			}


		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
	public static void serializarDatos() {
		try {
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
			FileInputStream fis = new FileInputStream("C:\\Users\\ram\\Desktop\\empleados.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			listaEmpleados = (ArrayList) ois.readObject();

			JOptionPane.showMessageDialog(null, "Datos cargados correctamente");

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void borrarEmpleado(String idEmpleado) {
		Iterator<Empleados> it = listaEmpleados.iterator();
		while (it.hasNext()) {
			String idE = it.next().getIdEmpleado().toString();
			if (idE.equals(idEmpleado)) {
				it.remove();
				JOptionPane.showMessageDialog(null, "Empleado borrado correctamente");
			}
		}

		//Acctualizar los archivos de guardado
		serializarDatos();
		guardarEmpleados();

	}

//Eviata duplicar los UUID al estar creados aleatoriamente
	public static void compararId(UUID idEmpleado){
		for (Empleados listaEmpleado : listaEmpleados) {
			UUID id = listaEmpleado.idEmpleado;
			if (id.equals(idEmpleado)) {
				idEmpleado = UUID.randomUUID();
			}

		}

	}

	public static void ordenarSalario(){

		Collections.sort(listaEmpleados, new CompararSueldos());
		for (Empleados e:
			 listaEmpleados) {
			JOptionPane.showMessageDialog(null, e.palabras());
		}
	}
	public static void ordenarFechaIncorporacion(){

		Collections.sort(listaEmpleados, new CompararSueldos());
		for (Empleados e:
				listaEmpleados) {
			JOptionPane.showMessageDialog(null, e.palabras());
		}
	}
	public static void ordenarNombre(){

		Collections.sort(listaEmpleados, new CompararNombre());
		for (Empleados e:
				listaEmpleados) {
			JOptionPane.showMessageDialog(null, e.palabras());
		}
	}

	public static void subirSueldo(String idEmpleado){
		for (int i=0; i<listaEmpleados.size();i++){
			if (idEmpleado.equals(listaEmpleados.get(i).getIdEmpleado().toString())){
				int aumento =  Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quieres aumentarlo?"));
				int sueldoTotal = aumento + listaEmpleados.get(i).getSueldo();
				listaEmpleados.get(i).setSueldo(sueldoTotal);
				JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
			}
		}
		serializarDatos();
		guardarEmpleados();

	}


}
