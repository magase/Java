package centrosEducativos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaColes {
	public ListaColes() {
		ArrayList<CentrosEducativos> ListaColes = new ArrayList<CentrosEducativos>();
		Scanner teclado = new Scanner(System.in);
		int opcion;
		/*
		do {
			System.out.println("Que quieres hacer");
			System.out.println("1- Agregar Colegios");
			System.out.println("2- Ver Lista de Colegios");
			System.out.println("3- Modificar Colegios");
			System.out.println("4- Eliminar Colegios");
			System.out.println("5- Salir");

		*/	opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				int tipo;
				System.out.println("¿Que clase es?");
				System.out.println("\n1- Publica 2- Concertado 3- Privado");
				tipo = teclado.nextInt();
				if (tipo == 1) {

					teclado.nextLine();
					System.out.println("Que nombre tiene? ");
					String nombre = teclado.nextLine();

					System.out.println("Direccion: ");
					String direccion = teclado.nextLine();
					System.out.println("Que presupuesto anual tiene? ");
					int dinero = teclado.nextInt();
					Publica colegioP = new Publica(nombre, direccion, dinero);

					ListaColes.add(colegioP);
					System.out.println(colegioP + "\n");

				}

				if (tipo == 2) {

					teclado.nextLine();
					System.out.println("Que nombre tiene? ");
					String nombre = teclado.nextLine();
					System.out.println("Direccion: ");
					String direccion = teclado.nextLine();
					System.out.println("Que presupuesto publico mensual tiene? ");
					int dineroM = teclado.nextInt();
					System.out.println("Cuanto se paga al mes? ");
					int pago = teclado.nextInt();
					Concertado colegioC = new Concertado(nombre, direccion, dineroM, pago);
					ListaColes.add(colegioC);
					System.out.println(colegioC + "\n");

				}
				if (tipo == 3) {

					teclado.nextLine();
					System.out.println("Que nombre tiene? ");
					String nombre = teclado.nextLine();
					System.out.println("Direccion: ");
					String direccion = teclado.nextLine();
					System.out.println("Cuanto se paga al mes? ");
					int pagoP = teclado.nextInt();
					Privada colegioC = new Privada(nombre, direccion, pagoP);
					ListaColes.add(colegioC);
					System.out.println(colegioC + "\n");
				}
				break;

			case 2:
				System.out.println("hoa");
				// System.out.println(((Object) ListaColes).getListaColes());
				break;
			}

		

		while (opcion != 5);
		// opcion=5

		teclado.close();
	}
	
	public void insertarPublica() {
		int tipo;
		//System.out.println("¿Que clase es?");
		//System.out.println("\n1- Publica 2- Concertado 3- Privado");
		Scanner teclado = new Scanner(System.in);
		tipo = teclado.nextInt();
		if (tipo == 1) {

			System.out.println("Que nombre tiene? ");
			String nombre = teclado.nextLine();

			System.out.println("Direccion: ");
			String direccion = teclado.nextLine();
			System.out.println("Que presupuesto anual tiene? ");
			int dinero = teclado.nextInt();
			Publica colegioP = new Publica(nombre, direccion, dinero);

			ListaColes.add(colegioP);
			System.out.println(colegioP + "\n");

		}
		teclado.close();
	}

	private static void add(Publica colegioP) {
		// TODO Auto-generated method stub
		
	}


}
