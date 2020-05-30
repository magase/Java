package nominas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MianMio implements MetodosEmpleados {
	
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
					break;
				
				}
				
			}while(opcion !=4);
			
		}catch(Exception e ) {
			e.printStackTrace();
		
		}finally {
			teclado.close();
		}
	}

}
