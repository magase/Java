package miFutbol;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Manuel Garcia
 * 10/26/2020
 */
public class MainPartido {

            public static void main (String[] args) {
                int opcion;
                Scanner teclado = new Scanner(System.in);

                try {

                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                                "Que quieres hacer"
                                        + "\n1-  Crear Jugador"
                                        + "\n2-  Mostrar Jugadores Locales"
                                        + "\n3-  Mostrar Jugadores Visitantes"
                                        + "\n4-  Guardar partido Guardado"
                                        + "\n5-  Buscar jugador"
                                        + "\n6-  Mostrar los jugadores"
                                        + "\n7-  Cardar datos guardados"
                                        + "\n8-  Borra jugador"
                                        + "\n9-  Ordenar por goles"
                                        + "\n10- Ordenar por pases"
                                        + "\n11- Ordenar alfabeticamente"
                                        + "\n12- Ordenar por valoe"
                                        + "\n13- Aumentar goles a un jugador"
                                        + "\n14- Aumentar pases a un jugador"
                                        + "\n15- Aumentar paradas de portero"
                                        + "\n16- Aumentar jugadas cortadas de defensa"
                                        + "\n17- Aumentar jugadas de goles"
                                        + "\n18- Salir del programa"
                        ));

                        switch(opcion) {

                            case 1:
                                //Crear jugador
                                /**
                                 * @param jugador añade el jugador que elijamos al equipo
                                 */
                                MetodosPartido.crearJugador();
                                break;

                            case 2:
                                //Mostrar jugadores equipo visitante
                                MetodosPartido.mostrarJugadoresLocales();
                                break;

                            case 3:
                                //Mostrar jugadores equipo local
                                MetodosPartido.mostrarJugadoresVisitantes();
                                break;

                            case 4:
                                //Guardar datos
                                MetodosPartido.guardarArchivo();
                                MetodosPartido.serializarDatos();

                                break;

                            case 5:
                                //mostrar datos guardados
                                int numDorsal = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el dorsal que buscar?"));
                                MetodosPartido.buscarJugador(numDorsal);
                                break;

                            case 6:
                                //Deseraializar datos
                                MetodosPartido.desSerializarDatos();
                                break;

                            case 7:
                                MetodosPartido.cargarDatos();
                                break;


                            case 8:
                                int dor = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el dorsal que buscas?"));
                                int gol = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos goles quieres añadir?"));
                                MetodosPartido.sumarGoles(gol, dor);
                                break;

                            /*case 9:

                                break;

                            case 10:

                                break;

                            case 11:

                                break;

                            case 12:

                                break;

				Caso 18 sale del programa


                            */
                        }
                    }while(opcion !=18);
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");

                }catch(Exception e ) {
                    e.printStackTrace();

                }finally {
                    teclado.close();
                }
            }

        }


