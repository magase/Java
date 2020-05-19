package excepciones_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_Datos {

	public static void main(String[] args) {

		System.out.println("Que deseas hacer?");
		System.out.println("1. Introducir datos ");
		System.out.println("2. Salir del programa ");
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion = teclado.nextInt();
		
		if (opcion ==1) {
			
			pedirDatos();
		}else {
			System.out.println("Adios ");
			System.exit(0);
		}
		teclado.close();
	}
	
	static void pedirDatos() throws InputMismatchException {
		try {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Pon tu nombre ");
		String nombre = teclado.nextLine();
		System.out.println("Pon tu edad ");
		int edad = teclado.nextInt();
		
		System.out.println("Hola " + nombre + "\nEl año que viene tendras " + (edad ++) + "años");
		teclado.close();
		}catch(InputMismatchException e) {
			System.out.println("Que has puesto? ");
		}
		System.out.println("Hemos terminado");

	}

}
