package futbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Partido  {

	Scanner teclado = new Scanner(System.in);

	private ArrayList<Jugador> equipoLocal;
	private ArrayList<Jugador> equipoVisitante;

	//CREAR EL CONTRUCTOR DE LA CALSE CON LOS ARRAYS
	Partido() {
		equipoLocal = new ArrayList<Jugador>();
		equipoVisitante = new ArrayList<Jugador>();

	}

	
	//AÑADIR ATACANTE
	public void añadirJugadorAtacante() throws Exception {
		
		if (equipoLocal.size() < 31) {
			
			throw new Exception();
			
		}else {

		String nombre = JOptionPane.showInputDialog(null, "Que nombre tiene?");
		
		int dorsal = Integer.parseInt(JOptionPane.showInputDialog(null, "Que dorsal lleva?"));
		
		int goles = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos goles leva?"));
		
		int numPase = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos pases lleva?"));
		
		int recuperaciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas recuperaciones leva?"));

		
		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));

		
		//DIFERENCIAS DE LOCAL O VISITANTE 
		if (campo == 1) {
			TipoEquipo Visitante = TipoEquipo.VISITANTE;
			Jugador atacante = new Atacante(dorsal, goles, nombre, Visitante, numPase, recuperaciones);
			atacante.toString();
			equipoVisitante.add(atacante);
			// System.out.println(equipoVisitante);
			JOptionPane.showMessageDialog(null, equipoVisitante);
			equipoLocal.size();

		}
		if (campo == 2) {
			TipoEquipo Local = TipoEquipo.LOCAL;
			Atacante atacante = new Atacante(dorsal, goles, nombre, Local, numPase, recuperaciones);
			equipoLocal.add(atacante);
			JOptionPane.showMessageDialog(null, equipoLocal);
			

		}
		
	  }

	}
	
	//ESTRUCTUTURA IGUAL QUE ATACANTE
	public void añadirJugadorDefensor() {

		
		String nombre = JOptionPane.showInputDialog(null, "Que nombre tiene?");
		

		
		int dorsal = Integer.parseInt(JOptionPane.showInputDialog(null, "Que dorsal lleva?"));
		

	
		int goles = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos goles leva?"));
	
	
		int numPase = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos pases lleva?"));

	
		int recuperaciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas recuperaciones leva?"));

		

		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));

		if (campo == 1) {
			TipoEquipo Visitante = TipoEquipo.VISITANTE;
			Jugador defensor = new Defensor(dorsal, goles, nombre, Visitante, numPase, recuperaciones);
			defensor.toString();
			equipoVisitante.add(defensor);
			
			JOptionPane.showMessageDialog(null, equipoVisitante);
			equipoLocal.size();

		}
		if (campo == 2) {
			TipoEquipo Local = TipoEquipo.LOCAL;
			Jugador defensor = new Defensor(dorsal, goles, nombre, Local, numPase, recuperaciones);
			equipoLocal.add(defensor);
			JOptionPane.showMessageDialog(null, equipoLocal);

		}

	}
	
	//DIEFERNTES PARAMETROS PERO MISMA ESTRUCTURA
	public void añadirJugadorPortero() {

		System.out.println("Que nombre tiene?");
		String nombre = teclado.nextLine();

		System.out.println("Que dorsal lleva?");
		int dorsal = teclado.nextInt();

		System.out.println("Cuantos goles leva?");
		int goles = teclado.nextInt();

		System.out.println("Cuantas paradas leva?");
		int paradas = teclado.nextInt();

		System.out.println("¿Tu jugador juega de 1 visitante o 2 local? ");
		String campo = teclado.nextLine();
		campo.toLowerCase();
		if (campo == "visitante") {
			TipoEquipo Visitante = TipoEquipo.VISITANTE;
			Jugador portero = new Portero(dorsal, goles, nombre, Visitante, paradas);
			equipoLocal.add(portero);

		} else {
			TipoEquipo Local = TipoEquipo.LOCAL;
			Jugador portero = new Portero(dorsal, goles, nombre, Local, paradas);
			equipoLocal.add(portero);
		}

	}

	// CONTAR GOLES
	public void contarGoles() {

		int dorsal = Integer.parseInt(JOptionPane.showInputDialog(null, "Que dorsal lleva? "));
		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));
		int totalGoles;
		
		//SE BUSCA EL JUGADOR POR EL DORSAL ELIGIENDO EL EQUPO EN CUAL ESTA 
		if (campo == 1) {
			Iterator<Jugador> buscarDor = equipoVisitante.iterator();
			while (buscarDor.hasNext()) {
				if (dorsal == buscarDor.next().getDorsal()) {
					totalGoles = buscarDor.next().getGoles();
					JOptionPane.showMessageDialog(null, totalGoles++ + " goles");
				}
			}

		}

		if (campo == 2) {
			Iterator<Jugador> buscarDor = equipoLocal.iterator();
			while (buscarDor.hasNext()) {
				if (dorsal == buscarDor.next().getDorsal()) {
					totalGoles = buscarDor.next().getGoles();
					JOptionPane.showMessageDialog(null, totalGoles++ + " goles");
				}
			}

		}

	}

	// CONTAR PASES MISMA ESTRUCTURA QUE GOLES 
	public void contarPases() {

		int dorsal = Integer.parseInt(JOptionPane.showInputDialog(null, "Que dorsal lleva? "));
		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));
		int totalPases;

		if (campo == 1) {
			Iterator<Jugador> buscarDor = equipoVisitante.iterator();
			while (buscarDor.hasNext()) {
				if (dorsal == buscarDor.next().getDorsal()) {
					totalPases = ((JugadorCampo) buscarDor.next()).getPases();
					JOptionPane.showMessageDialog(null, totalPases++ + "pases");
				}
			}

		}

		if (campo == 2) {
			Iterator<Jugador> buscarDor = equipoLocal.iterator();
			while (buscarDor.hasNext()) {
				if (dorsal == buscarDor.next().getDorsal()) {
					totalPases = ((JugadorCampo) buscarDor.next()).getPases();
					JOptionPane.showMessageDialog(null, totalPases++ + "pases");
				}
			}

		}

	}
	
	//CONTAR RECUPERACIONES MISMA ESTRUCTURA QUE GOLES 
	public void contarRecuperaciones() {

		int dorsal = Integer.parseInt(JOptionPane.showInputDialog(null, "Que dorsal lleva? "));
		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));
		int totalRecuperaciones;

		if (campo == 1) {
			Iterator<Jugador> buscarDor = equipoVisitante.iterator();
			while (buscarDor.hasNext()) {
				if (dorsal == buscarDor.next().getDorsal()) {
					totalRecuperaciones = ((JugadorCampo) buscarDor.next()).getRecuperaciones();
					JOptionPane.showMessageDialog(null, totalRecuperaciones++ + "pases");
				}
			}

		}

		if (campo == 2) {
			Iterator<Jugador> buscarDor = equipoLocal.iterator();
			while (buscarDor.hasNext()) {
				if (dorsal == buscarDor.next().getDorsal()) {
					totalRecuperaciones = ((JugadorCampo) buscarDor.next()).getRecuperaciones();
					JOptionPane.showMessageDialog(null, totalRecuperaciones++ + "pases");
				}
			}

		}

	}
	
	//CONTAR PARADAS ESTRUCTURA QUE GOLES 
	public void contarParadas() {

		int dorsal = Integer.parseInt(JOptionPane.showInputDialog(null, "Que dorsal lleva? "));
		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));
		int totalParadas;

		if (campo == 1) {
			Iterator<Jugador> buscarDor = equipoVisitante.iterator();
			while (buscarDor.hasNext()) {
				if (dorsal == buscarDor.next().getDorsal()) {
					totalParadas = ((Portero) buscarDor.next()).getParadas();
					JOptionPane.showMessageDialog(null, totalParadas++ + "paradas");
				}
			}

		}

		if (campo == 2) {
			Iterator<Jugador> buscarDor = equipoLocal.iterator();
			while (buscarDor.hasNext()) {
				if (dorsal == buscarDor.next().getDorsal()) {
					totalParadas = ((Portero) buscarDor.next()).getParadas();
					JOptionPane.showMessageDialog(null, totalParadas++ + "paradas");
				}
			}

		}

	}

	
	//BUCAR UN JUGADOR CONCRETO DENTRO DE LOS ARRAY
	public void mostrarJugador() {

		int dorsal = Integer.parseInt(JOptionPane.showInputDialog(null, "Que dorsal lleva? "));
		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));
		

		if (campo == 1) {
			for(Jugador j : equipoVisitante) {
				if (j.getDorsal() == dorsal) {
					//VER DE QUE TIPO ES EL OBJETO CREADO 
					if (j instanceof Portero) {
						JOptionPane.showInputDialog(null, j);
					}
					if (j instanceof Atacante) {
						JOptionPane.showInputDialog(null, j);
					}
					if (j instanceof Defensor) {
						JOptionPane.showInputDialog(null, j);
					}
				}
			}

		}

		if (campo == 2) {
			for(Jugador j : equipoVisitante) {
				if (j.getDorsal() == dorsal) {
					//VER DE QUE TIPO ES EL OBJETO CREADO 
					if (j instanceof Portero) {
						JOptionPane.showInputDialog(null, j);
					}
					if (j instanceof Atacante) {
						JOptionPane.showInputDialog(null, j);
					}
					if (j instanceof Defensor) {
						JOptionPane.showInputDialog(null, j);
					}
				}
			}
		}

	}
	
	//ESTRUCUTURA COMO MOSTRAR JUGADOR Y CUANDO LO COGE SE ELIMINA
	public void elimiarJugador() {

		int dorsal = Integer.parseInt(JOptionPane.showInputDialog(null, "Que dorsal lleva? "));
		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));
		

		if (campo == 1) {
			Iterator<Jugador> buscarDor = equipoVisitante.iterator();
			while (buscarDor.hasNext()) {
				if (dorsal == buscarDor.next().getDorsal()) {
					buscarDor.remove();
					JOptionPane.showMessageDialog(null, "Jugador Eliminado");
				}
			}

		}

		if (campo == 2) {
			Iterator<Jugador> buscarDor = equipoLocal.iterator();
			while (buscarDor.hasNext()) {
				if (dorsal == buscarDor.next().getDorsal()) {
					buscarDor.remove();
					JOptionPane.showMessageDialog(null, "Jugador Eliminado");
				}
			}

		}

	}
	
	//RECORRER LA ARRAY ENTERA MOSTRANDO TODOS LOS DATOS 
	public void mostrarEquipo() {
		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));
		if (campo == 1) {
			for(int i=0; i< equipoVisitante.size(); i++){
				JOptionPane.showMessageDialog(null, equipoVisitante.get(i));
		        
		}
		}
		if (campo == 2) {
			for(int i=0; i< equipoVisitante.size(); i++){
				JOptionPane.showMessageDialog(null, equipoVisitante.get(i));
		        
		}
		}
	}
	
	//VA SUMANDO LOS GOLES DE LOS INTEGRANTES DE LOS EQUIPOS
	public void totalGoles() {
		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));
		if (campo == 1) {
			int goles=0;
			for(Jugador gol : equipoVisitante){
				goles += gol.getGoles();
								
				JOptionPane.showMessageDialog(null, goles);
		        
		}
		}
		if (campo == 2) {
			int goles=0;
			for(Jugador gol : equipoLocal){
				goles += gol.getGoles();
								
				JOptionPane.showMessageDialog(null, goles);
		        
		}
		}
	}
	
	//VA COMPARANDO LOS GOLES Y DE MAYOR A MENOR SE ORDENAN DE LOS INTEGRANTES DE LOS EQUIPOS
	public void ordenarGoles() {
		
		
		int campo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tu jugador juega de 1 visitante o 2 local? "));
		if (campo == 1) {
			Collections.sort(equipoVisitante);
			for (Jugador j : equipoVisitante) {
			JOptionPane.showMessageDialog(null, j);
			}
		}
		
		if (campo == 2) {
			Collections.sort(equipoLocal);
			for (Jugador j : equipoLocal) {
			JOptionPane.showMessageDialog(null, j);
			}
		}
	}
	
	
	/*
	public void ordenarPase() {
		
		
		NO ME SALE 
		
			Collections.sort(new Comparar().comparePases(equipoVisitante, comparePases()));
			for (Jugador j : equipoVisitante) {
			JOptionPane.showMessageDialog(null, j);
			}
			
	}
	
*/
	
}
