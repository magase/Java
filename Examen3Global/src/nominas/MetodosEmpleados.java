package nominas;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;


public class MetodosEmpleados {
	
	 public static ArrayList <Empleados> listaEmpleados = new ArrayList <Empleados>();
	
	
	
	public static void crearEmpleado() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cual es su nombre ?");
		teclado.hasNextInt();
		String nombre = teclado.nextLine();
		
		
		System.out.println("¿Cual es su apellidos ?");
		String apellidos = teclado.nextLine();
		
		System.out.println("¿Cual es su edad ?");
		int edad = teclado.nextInt();
		
		System.out.println("En que año entro");
		int fecha = teclado.nextInt();
       
        System.out.println("¿Cual es su departemto ?(VENTA, PRODUCCION, MANTENIMIENTO)");
        String departamento = teclado.nextLine();
		departamento.toUpperCase();
		switch (departamento) {
		
		case "VENTA":
			System.out.println("¿Cuantas ventas ha tenido?");
			int sueldo =500;
			int ventas = teclado.nextInt();
			double comision = 0.2;
			sueldo = (int) (sueldo+(ventas*comision));
			boolean riesgo = false;
			Empleados empleadoV = new Empleados(nombre, apellidos, edad, sueldo, fecha, comision, riesgo, Departamento.VENTA);
			listaEmpleados.add(empleadoV);
			
			break;
			
		case "PRODUCCION":
			System.out.println("¿Cuanto han producido?");
			int producir = teclado.nextInt();
			sueldo =500;
			riesgo = false;
			comision = 25;
			sueldo = (int) (sueldo+(producir*comision));
			System.out.println("¿Manipula productos de riesgo? SI o NO");
			String productos = teclado.nextLine();
			productos.toUpperCase();
			if (productos == "SI") {
				riesgo = true;
			}if (productos == "NO") {
				riesgo = false;
			}
			
			Empleados empleadoP = new Empleados(nombre, apellidos, edad, sueldo, fecha, comision, riesgo, Departamento.PRODUCCION);
			listaEmpleados.add(empleadoP);
			
			
			break;
			
		case "MANTENIMIENTO":
			System.out.println("¿Cuantas oras llevan trabajadas?");
			int horas = teclado.nextInt();
			sueldo =500;
			riesgo=false;
			comision = 10;
			sueldo = (int) (sueldo+(horas*comision));
			System.out.println("¿Manipula productos de riesgo? SI o NO");
			productos = teclado.nextLine();
			productos.toUpperCase();
			if (productos == "SI") {
				riesgo = true;
			}if (productos == "NO") {
				riesgo = false;
			}
		
			Empleados empleadoM = new Empleados(nombre, apellidos, edad, sueldo, fecha, comision, riesgo, Departamento.MANTENIMIENTO);
			listaEmpleados.add(empleadoM);
		
		break;
		
		
		}
		 
		
	}
	
	
	public static void mostrarLista() {
		
		Iterator<Empleados> itL = listaEmpleados.iterator();
		if (itL.hasNext()) {
			for (int i = 0; i < listaEmpleados.size(); i++) {						
				System.out.println(listaEmpleados.get(i));
			}
		}else {
			System.out.println("Todavia no has a�adido ningun empleado");
		}
	}
	
	public static void buscarEmpleado(String name) {
		
		for (int i=0; i<listaEmpleados.size(); i++) {
			if (name.equals(listaEmpleados.get(i).getNombre())) {
				System.out.println(listaEmpleados.get(i).toString());
			}
			
		}
		
		
	}
	
	public static void mediaSueldo() {
		
		int sueldoTotal=0;
		
		for(Empleados e: listaEmpleados) {
			sueldoTotal = sueldoTotal + e.getSueldo();
		}
		int media = sueldoTotal/listaEmpleados.size();
		
		 System.out.println("La media de sueldos de los empleados es: " + media);
		
		
	}
	
	
	public static void guardaDatos() {
		
		try {
			
			ObjectOutputStream guardarFichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ram\\Desktop\\empleados.dat"));
			
			guardarFichero.writeObject(listaEmpleados);
			
			guardarFichero.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public static void leerDatos() {
		
		try {
			
			ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\ram\\Desktop\\empleados.dat"));
			
			
			Empleados[] leeDatos = (Empleados[]) leerFichero.readObject();
			
			leerFichero.close();
			
			for (Empleados e: leeDatos) {
				System.out.println(e);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public static  void compararEdad() {
	
		Iterator<Empleados> iter = listaEmpleados.iterator();
		if (iter.hasNext()) {
			for (int i = 0; i < listaEmpleados.size(); i++) {
				Collections.sort(listaEmpleados, new OrdenarEdad());
				System.out.println(listaEmpleados.get(i));
			}
		}else {
			System.out.println("No hay ningun empleado aun, rellene el los datos primero");
		}	
		
		
	}
	
	public static  void compararAntiguedad() {
		
		Iterator<Empleados> iter = listaEmpleados.iterator();
		if (iter.hasNext()) {
			for (int i = 0; i < listaEmpleados.size(); i++) {
				Collections.sort(listaEmpleados, new OrdenarAntiguedad());
				System.out.println(listaEmpleados.get(i));
			}
		}else {
			System.out.println("No hay ningun empleado aun, rellene el los datos primero");
		}	
		
	}
		


}
		
		
	

