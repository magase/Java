package examen;

import java.util.Scanner;
import java.util.ArrayList;


public class MainEquipo implements ListaJugadores {

	public static void main(String[] args) {
		/*
		Atacante atacante1 = new Atacante("Paco", 8, "Getafe", 9, 1, 3);
		Defensor defensor1 = new Defensor("Benito", 10, "Atletico de Madrid", 90, 8, 90);
		Portero portero1 = new Portero("Pepe", 10, "Real Madrid", 9, 1, 9);
		
		
		listaJugadores.add(atacante1);
		listaJugadores.add(defensor1);
		listaJugadores.add(portero1);
		*/
		int opcion;
/*
		System.out.println("Que quieres hacer");
		System.out.println("1- Añadir Atacante");//AÃ‘ADIR ATACANTE
		System.out.println("2- Añadir Defensor");//AÃ‘ADIR DEFENSOR
		System.out.println("3- Añadir Portero");//AÃ‘ADIR PORTERO 
		System.out.println("4- Contar Goles");//CONTAR GOLES
		System.out.println("5- Contar Pases");//CONTAR PASES
		System.out.println("6- Contar Recuperaciones");//CONTAR RECUPERACIONES
		System.out.println("7- Contar Paradas");//CONTAR PARADAS
		System.out.println("8- Mostrar valores del Jugador");
*/
		//Jugador jugador = new Atacante();
		//jugador.añadirJugadores();
		
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("Que quieres hacer");
			System.out.println("1- Añadir Atacante");//AÃ‘ADIR ATACANTE
			System.out.println("2- Añadir Defensor");//AÃ‘ADIR DEFENSOR
			System.out.println("3- Añadir Portero");//AÃ‘ADIR PORTERO 
			System.out.println("4- Contar Goles");//CONTAR GOLES
			System.out.println("5- Contar Pases");//CONTAR PASES
			System.out.println("6- Contar Recuperaciones");//CONTAR RECUPERACIONES
			System.out.println("7- Contar Paradas");//CONTAR PARADAS
			System.out.println("8- Mostrar valores del Jugador");
			
			opcion=teclado.nextInt();
			switch(opcion) {

			//CREAR Y AÃ‘ADIR ATACANTE
			case 1:
				System.out.println("Agrega atacante ");
				//Jugador atacante = new Atacante();
				ListaJugadores.añadirAtacante();
				
				break;

				//CREAR Y AÃ‘ADIR DEFENSOR
			case 2:
				System.out.println("Agrega defensor ");
				//Jugador defensor  = new Defensor();
				ListaJugadores.añadirDefensor();
				
				break;

				//CREAR Y AÃ‘ADIR PORTERO
			case 3:
				System.out.println("Agrega portero ");
				//Jugador portero  = new Portero();
				ListaJugadores.añadirDefensor();
				break;


				//VER CUANTOS GOLES HA HECHO UN JUGADOR
			case 4:
			
				for (int i=0; i<listaJugadores.size();i++) {
					int dorsal;
					String goles;
					dorsal = teclado.nextInt();
					
					goles = Jugador.getGoles(dorsal);
					
					System.out.println(goles);
				}
				break;

				//VER CUANTOS PASES HA HECHO UN JUGADOR
			case 5:
				System.out.println("De que jugador quieres saber sus pases? (Numero de dorsal)");
				

				break;

				//VER CUANTAS RECUPERACIONES HA HECHO UN JUGADOR
			case 6:
				/*
				int j;
				System.out.println("De que jugador quieres saber sus recuperaciones? (Numero de dorsal)");
				j = teclado.nextInt();
				if (j== listaJugadores.get(j).getnumDor()) {
					System.out.println(listaJugadores.get(j).getnumPase());
				}
				*/

				break;

				//VER CUANTAS PARADAS HA HECHO UN PORTERO
			case 7:/*
				int j;
				System.out.println("De que portero quieres saber sus paradas? (Numero de dorsal)");
				j = teclado.nextInt();
				if (j== listaJugadores.get(j).getnumDor()) {
					System.out.println(listaJugadores.get(j).getnumPase());
				}*/

				break;

				//VER EL VALOR DE UN JUGADOR
			case 8:/*
				int j;
				System.out.println("De que jugador quieres saber sus Valor? (Numero de dorsal)");
				j = teclado.nextInt();
				if (j== listaJugadores.get(j).getnumDor()) {
					System.out.println(listaJugadores.get(j).getnumPase());
				}*/

				break;


			}
		}

		while (opcion !=8);


		teclado.close();

	}

}
