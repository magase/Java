package futbol;
//import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class EstadisticasApp {

	public static void main(String[] args) throws Exception {
		Partido p = new Partido();
		
		
		
		int opcion;
		
		try {
		
		
		do {
			Scanner teclado = new Scanner(System.in);
			
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
										"1-  Añadir Atacante  "
									+ "\n2-  Añadir Defensor"
									+ "\n3-  Añadir Portero "
									+ "\n4-  Contar goles "
									+ "\n5-  Contar pases " 
									+ "\n6-  Contar recuperaciones "
									+ "\n7-  Contar parada"
									+ "\n8-  Mostrar jugador "
									+ "\n9-  Eliminar jugador "
									+ "\n10- Mostrar equipo "
									+ "\n11- Total goles de equipo "
									+ "\n12- Ordenar jugadores segun sus goles"));
			
			switch (opcion) {
				
				case 1:
					
				try {
					p.añadirJugadorAtacante();
				}catch(Exception e) {
					System.out.println("No se puede añadir mas de 30 jugadores. \nSe ha producido un erro de tipo: " + e.getClass().getName());
					
				}
					break;
				case 2:
					
					p.añadirJugadorDefensor();
					
					break;

				case 3:
					
					p.añadirJugadorPortero();
					
					break;
					
				case 4:
					
					//Contar goles + 1
					p.contarGoles();
					
					break;

				case 5:
					
					//Contar pases  + 1 
					p.contarPases();
					break;
					
				case 6:
				
					//Contar recuperaciones + 1
					p.contarRecuperaciones();
					break;
					
				case 7:
					
					//Contar parada  
					p.contarParadas();
					
					break;

				case 8:
					
					//Mostrar jugador  
					p.mostrarJugador();
					
					break;
				
				case 9:
					
					//Eliminar jugador
					p.elimiarJugador();
					
					break;
			
				case 10:
					
					//Mostrar equipo
					p.mostrarEquipo();
					
					break;
			
				case 11:
					
					//Total goles de equipo  
					p.totalGoles();
					
					break;
			
				case 12:
					
					//Ordenar jugadores segun sus goles  
					p.ordenarGoles();
					
					break;
				case 13:
					
					//Ordenar jugadores segun sus pases Local  
					p.ordenarGoles();
					
					break;
						
			
			}
			
			teclado.close();
			
		}while (opcion !=14);
		
		
		}catch (Exception e){
			System.out.println("Se ha producido un  error de tipo"+ e.getClass().getName());
		}
	}

	
	
}
