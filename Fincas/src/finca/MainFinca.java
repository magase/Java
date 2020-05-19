package finca;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class MainFinca {

	public static void main(String[] args) {

		//ARRAY DE TIPO FINCA
		ArrayList<Finca> listaFincas = new ArrayList<Finca>(); 
		//SE CREA UNA PARCELA, CASA Y FINCA LAS CUALES DESPUES SE AÑADEN AL HUECO DEL ARRAY
		Scanner teclado = new Scanner (System.in);
		int opcion;
		
		do {
			System.out.println("Que quieres hacer");
			System.out.println("1- Añadir Finca");
			System.out.println("2- Ver Lista de Fincas");
			opcion = teclado.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Como se llama la Finca?");
				//teclado.nextInt();
				teclado.nextLine();
				String nombre = teclado.nextLine();
				
				System.out.println("Que tamaño tiene? ");
				int tamañoF= teclado.nextInt();
				
				System.out.println("Que tamaño tiene la casa?");
				int tamañoC= teclado.nextInt();
				System.out.println("Cuantas plantas tiene?");
				int plantas = teclado.nextInt();
				System.out.println("Cuantas habitaciones tiene?");
				int habitaciones = teclado.nextInt();
				
				System.out.println("Que tamaño tiene la parcela?");
				int tamañoP= teclado.nextInt();

				System.out.println("Se dedica a la ganaderia");
				teclado.nextLine();
				String ganaderia = teclado.nextLine();
				System.out.println("Se dedica a la agricultura");
				String agricultura = teclado.nextLine();
				//teclado.close();
				
				Parcela parcela1 = new Parcela(tamañoP, ganaderia, agricultura);
				Casa casa1 = new Casa(tamañoC, plantas, habitaciones);
				Finca finca1 = new Finca(nombre, tamañoF, casa1, parcela1);
				listaFincas.add(finca1);
				//System.out.println(finca1);
				
				//pureba
				Parcela parcela2 = new Parcela(8, "Si", "Si");
				Casa casa2 = new Casa(3, 5, 8);
				Finca finca2 = new Finca("Adios", 3, casa2, parcela2);
				
				listaFincas.add(finca2);//SE AÑADE LA FINCA CON TODOS SUS PARAMETROS
				
				//System.out.println(finca2);
			
				//JOptionPane.showMessageDialog(null, finca1);
				
				//OptionPane.showMessageDialog(null, "jola");
				break;
				
			case 2:
				for (int i=0; i<listaFincas.size(); i++) {
					System.out.println(listaFincas.get(i));
				}
			break;
			
			}
		}
		
		while (opcion!=2) ;
		
		
		
		teclado.close();
	}

}
