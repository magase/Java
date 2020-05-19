package centrosEducativos;
//import java.util.ArrayList;
import java.util.Scanner;

public class MainColes {

	public static void main(final String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("Que quieres hacer");
			System.out.println("1- Agregar Colegios");
			System.out.println("2- Ver Lista de Colegios");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Agrega un colegio");
				ListaColes colPubli = new ListaColes();
					colPubli.insertarPublica();
				
				}
		}
		while (opcion!=5) ;
		
		teclado.close();
	}
	
}
