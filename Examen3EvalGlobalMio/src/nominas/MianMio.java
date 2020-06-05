package nominas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MianMio {
	
	public static void main (String[] args) {
		int opcion;
		Scanner teclado = new Scanner(System.in);
		//MetodosEmpleados metodos = new MetodosEmpleados();
		//Empleados metodos;
		
		try {
			
			do {

				opcion = Integer.parseInt(JOptionPane.showInputDialog(
						"Que quieres hacer"
						+ "\n1- Crear empleado"
						+ "\n2- Mostrar empleados"
						+ "\n3- Guardar empleados"
						+ "\n4- Mostrar empleados Guardados"
						+ "\n5- Buscar empleado"
						+ "\n6- Mostrar los empleados del .dat"
						+ "\n7- Guardar los empleados del .dat"
						+ "\n8- Salir del programa"
						+ "\nLos datos se guardan automaticamente"
						));
				MetodosEmpleados.cargarDatos();
				switch(opcion) {
	
				case 1:
					MetodosEmpleados.crearEmpleado();
					MetodosEmpleados.guardarEmpleados();
					break;
				case 2:
					MetodosEmpleados.mostrarEmpleados();
					break;
				case 3:
					MetodosEmpleados.guardarEmpleados();
					break;
				case 4:
					MetodosEmpleados.mostrarEmpleadosGuardados();
					break;
				case 5:
					String name = JOptionPane.showInputDialog("Que nombre tiene?");
					MetodosEmpleados.bucarEmpleado(name);
					break;
				case 6:
					MetodosEmpleados.mostrarEmpleadoDat();
					break;
				case 7:
					MetodosEmpleados.archivosSerializados();
					break;
				
				}
				
			}while(opcion !=8);
			JOptionPane.showMessageDialog(null, "El programa ha terminado");
			
		}catch(Exception e ) {
			e.printStackTrace();
		
		}finally {
			teclado.close();
		}
	}

}
