package examen;

import java.util.ArrayList;
import java.util.Scanner;

public interface  ListaJugadores {

	static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
	Scanner teclado = new Scanner(System.in);
	/*
	String nombre;
	int numDor;
	String equipo;
	int numPase;
	int goles;
	
	Atacante atacante1 = new Atacante("Paco", 8, "Getafe", 9, 1, 3);
	Defensor defensor1 = new Defensor("Benito", 10, "Atletico de Madrid", 90, 8, 90);
	Portero portero1 = new Portero("Pepe", 10, "Real Madrid", 9, 1, 9);
	/*
	listaJugadores.add(atacante1);
	listaJugadores.add(defensor1);
	listaJugadores.add(portero1);
	
	
	public void añadirJugadores() {
		listaJugadores.add(atacante1);
		listaJugadores.add(defensor1);
		listaJugadores.add(portero1);
	}
*/
	
	public static void añadirAtacante() {
		
		int recuperacionesA;

		System.out.println("Que nombre tiene?");
		String nombre = teclado.nextLine();
		
		
		System.out.println("Que dorsal lleva?");
		int numDor = teclado.nextInt();

		System.out.println("De que equipo es?");
		String equipo = teclado.nextLine();
		teclado.nextLine();

		System.out.println("Cuantos pases lleva?");
		int numPase = teclado.nextInt();

		System.out.println("Cuantos goles leva?");
		int goles = teclado.nextInt();

		System.out.println("Cuantas recuperaciones leva?");
		recuperacionesA = teclado.nextInt();
		teclado.nextLine();
		//System.out.println(" ");

		
		Atacante atacante = new Atacante(nombre, numDor, equipo, numPase, goles, recuperacionesA);
		System.out.println(atacante);
		listaJugadores.add(atacante);
	}

	public static void añadirDefensor() {
		
		int recuperacionesD;
		
		System.out.println("Que nombre tiene?");
		String nombre = teclado.nextLine();
		System.out.println(" ");
		
		System.out.println("Que dorsal lleva?");
		int numDor = teclado.nextInt();

		System.out.println("De que equipo es?");
		String equipo = teclado.nextLine();
		teclado.nextLine();

		System.out.println("Cuantos pases lleva?");
		int numPase = teclado.nextInt();

		System.out.println("Cuantos goles leva?");
		int goles = teclado.nextInt();

		System.out.println("Cuantas recuperaciones leva?");
		recuperacionesD = teclado.nextInt();
		teclado.nextLine();
		


		Defensor defensor = new Defensor(nombre, numDor, equipo, numPase, goles, recuperacionesD);
		System.out.println(defensor);
		listaJugadores.add(defensor);
	}

	public static void añadirPortero() {
		
		int paradas;

		System.out.println("Que nombre tiene?");
		String nombre = teclado.nextLine();
		System.out.println("\n");
		
		System.out.println("Que dorsal lleva?");
		int numDor = teclado.nextInt();

		System.out.println("De que equipo es?");
		String equipo = teclado.nextLine();

		System.out.println("Cuantos pases lleva?");
		int numPase = teclado.nextInt();

		System.out.println("Cuantos goles leva?");
		int goles = teclado.nextInt();

		System.out.println("Cuantas recuperaciones leva?");
		paradas = teclado.nextInt();
		teclado.nextLine();
		


		Portero portero = new Portero(nombre, numDor, equipo, numPase, goles, paradas);
		System.out.println(portero);
		listaJugadores.add(portero);
	}

	public static  String getGoles (int numDor) {
		String goles;
		goles = Atacante.getGoles(numDor);
			
		return "Los goles son " + goles;
	}
	

	

}
