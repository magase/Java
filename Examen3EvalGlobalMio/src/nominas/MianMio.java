package nominas;

import java.io.File;
import java.io.FileWriter;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MianMio {
	
	public static void main (String[] args) {
		int opcion;
		Scanner teclado = new Scanner(System.in);

		try {

			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(
						"Que quieres hacer"
						+ "\n1-  Crear empleado"
						+ "\n2-  Mostrar empleados"
						+ "\n3-  Guardar empleados"
						+ "\n4-  Mostrar empleados Guardados"
						+ "\n5-  Buscar empleado"
						+ "\n6-  Mostrar los empleados del .dat"
						+ "\n7-  Cardar datos guardados"
						+ "\n8-  Borra empleado"
						+ "\n9-  Ordenar por salario"
						+ "\n10- Ordenar por fecha de incorporacion"
						+ "\n11- Ordenar alfabeticamente"
						+ "\n12- Aumentar el sueldo a un empleado"
						+ "\n13- Salir del programa"
						));

				switch(opcion) {
	
				case 1:
					MetodosEmpleados.crearEmpleado();
					break;
				case 2:
					MetodosEmpleados.mostrarEmpleados();
					break;
				case 3:
					MetodosEmpleados.guardarEmpleados();
					MetodosEmpleados.serializarDatos();
					JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
					break;
				case 4:
					MetodosEmpleados.mostrarEmpleadosGuardados();
					break;
				case 5:
					String name = JOptionPane.showInputDialog("Que nombre tiene?");
					MetodosEmpleados.bucarEmpleado(name);
					break;

				case 6:
					MetodosEmpleados.desSerializarDatos();
					break;

				case 7:
					MetodosEmpleados.cargarDatos();
					break;

				case 8:
					String id = JOptionPane.showInputDialog("Que id tiene?");
					MetodosEmpleados.borrarEmpleado(id);
					break;

				case 9:
					MetodosEmpleados.ordenarSalario();
					break;

				case 10:
					MetodosEmpleados.ordenarFechaIncorporacion();
					break;

				case 11:
					MetodosEmpleados.ordenarNombre();
					break;

				case 12:
					String idE = JOptionPane.showInputDialog("Que id tiene?");
					MetodosEmpleados.subirSueldo(idE);
					break;
				/*
				Caso 13 sale del programa
				 */

				}
			}while(opcion !=13);
			JOptionPane.showMessageDialog(null, "El programa ha terminado");
			
		}catch(Exception e ) {
			e.printStackTrace();
		
		}finally {
			teclado.close();
		}
	}

}
