package nominas;

import java.util.Scanner;

public class MianMio implements MetodosEmpleados {
	
	public static void main (String[] args) {
		int opcion;
		Scanner teclado = new Scanner(System.in);
		//MetodosEmpleados metodos = new MetodosEmpleados();
		//Empleados metodos;
		
		try {
			do {
				System.out.println("Que quieres hacer");
				System.out.println("1- Crear empleado");
				System.out.println("2- Mostrar empleados");
				opcion=teclado.nextInt();
				switch(opcion) {
				case 1:
					MetodosEmpleados.crearEmpleado();
					break;
				case 2:
					MetodosEmpleados.mostrarEmpleados();
					break;
				
				}
				
			}while(opcion !=2);
			
		}catch(Exception e ) {
			e.printStackTrace();
		
		}finally {
			teclado.close();
		}
	}

}
