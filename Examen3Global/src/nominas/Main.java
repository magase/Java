package nominas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Clase Main 
 * @since 28-05-2020
 * @author Manuel Garcia
 */
public class Main {

	public static void main(String[] args) {
		
		int opcion;
		Scanner teclado = new Scanner(System.in);

		try {
		do {

			System.out.println("Que quieres hacer");
			System.out.println("1- Crear empleado");
			System.out.println("2- Mostrar empleados");
			System.out.println("3- Mostrar un empleado");
			System.out.println("4- Calcular media");
			System.out.println("5- Guardar datos");
			System.out.println("6- Leer datos");
			System.out.println("7- Ordenar por edad");
			System.out.println("8- Ordenar por antiguedad");
			opcion=teclado.nextInt();
			MetodosEmpleados metodos = new MetodosEmpleados();
			switch(opcion) {
				
			case 1:
				
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
				
				
				if (departamento == "VENTA") {
					System.out.println("¿Cuantas ventas ha tenido?");
					int sueldo =500;
					int ventas = teclado.nextInt();
					double comision = 0.2;
					sueldo = (int) (sueldo+(ventas*comision));
					boolean riesgo = false;
					Empleados empleadoV = new Empleados(nombre, apellidos, edad, sueldo, fecha, comision, riesgo, Departamento.VENTA);
					MetodosEmpleados.listaEmpleados.add(empleadoV);
					
				}
					
				if(departamento == "PRODUCCION") {
					System.out.println("¿Cuanto han producido?");
					int producir = teclado.nextInt();
					int sueldo =500;
					boolean riesgo = false;
					double comision = 25;
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
					MetodosEmpleados.listaEmpleados.add(empleadoP);
					
					
				}
					
					if (departamento== "MANTENIMIENTO") {
					System.out.println("¿Cuantas oras llevan trabajadas?");
					int horas = teclado.nextInt();
					int sueldo =500;
					boolean riesgo=false;
					double comision = 10;
					sueldo = (int) (sueldo+(horas*comision));
					System.out.println("¿Manipula productos de riesgo? SI o NO");
					String productos = teclado.nextLine();
					productos.toUpperCase();
					if (productos == "SI") {
						riesgo = true;
					}if (productos == "NO") {
						riesgo = false;
					}
				
					Empleados empleadoM = new Empleados(nombre, apellidos, edad, sueldo, fecha, comision, riesgo, Departamento.MANTENIMIENTO);
					MetodosEmpleados.listaEmpleados.add(empleadoM);
			}
			case 2:
				MetodosEmpleados.mostrarLista();
				
				break;
			case 3:
				System.out.println("¿Como se llama el empleado?");
				teclado.nextLine();
				String name = teclado.nextLine();
				MetodosEmpleados.buscarEmpleado(name);
				break;
				
			case 4:
				MetodosEmpleados.mediaSueldo();
				break;		
				
			case 5:
				MetodosEmpleados.guardaDatos();
				break;
			case 6:
				MetodosEmpleados.leerDatos();
				break;
			case 7:
				MetodosEmpleados.compararEdad();
				break;
			case 8:
				MetodosEmpleados.compararAntiguedad();
				break;
			}
			
			
				
			
		}while(opcion !=8 );
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		teclado.close();
		}
	}

}
