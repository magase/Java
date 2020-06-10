package miFutbol;

import javax.swing.*;
import java.util.Scanner;

public class MainPartido {

            public static void main (String[] args) {
                int opcion;
                Scanner teclado = new Scanner(System.in);

                try {

                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                                "Que quieres hacer"
                                        + "\n1-  Crear Jugador"
                                        + "\n2-  Mostrar Jugadores Visitantes"
                                        + "\n3-  Mostrar Jugadores Locales"
                                        + "\n4-  Mostrar partido Guardado"
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
                                        + "\n17- Aumentar jugadas de gol de delantero"
                                        + "\n18- Salir del programa"
                        ));

                        switch(opcion) {

                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break;

                            case 6:

                                break;

                            case 7:

                                break;

                            case 8:

                                break;

                            case 9:

                                break;

                            case 10:

                                break;

                            case 11:

                                break;

                            case 12:

                                break;
				/*
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


}
