package manuelGarciaSeva_Tenis;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Manuel Garcia Seva
 * Gestion de una aplicacion de un torneo de tenis
 * 11/06/2020
 */

public class MainTenis {

    public static void main (String [] args){


        int opcion;


        try {


            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        //El fichero esta nombrado como tenistas
                        "Que quieres hacer"
                                + "\n1-  Cargar tenistas"
                                + "\n2-  Mostrar tenistas"
                                + "\n3-  Buscar tenista"
                                + "\n4-  Ordenar por pista rapida"
                                + "\n5-  Ordenar por pista lenta"
                                + "\n6-  Cerrar programa"
                                + "El fichero esta nombrado como tenistas"
                ));

                switch(opcion) {

                    case 1:
                        String fichero = JOptionPane.showInputDialog("Como se llama el archivo que quieres cargar");
                        MetodosTenis.leerFichero(fichero);
                        break;
                    case 2:
                        MetodosTenis.mostrarTenistas();
                        break;
                    case 3:
                        String name = JOptionPane.showInputDialog("¿Nombre del tenista?");
                        name.toLowerCase();
                        MetodosTenis.mostrarNivel(name);
                        break;
                    case 4:
                        MetodosTenis.ordenarPistaRapida();
                        break;

                    case 5:
                        MetodosTenis.ordenarPistaLenta();
                        break;
                        /*
                    case 6:
                        CIERRA PROGRAMA
                        break;
                         */


                }
            }while(opcion !=6);
            JOptionPane.showMessageDialog(null, "El programa ha terminado");

        }catch(Exception e ) {
            e.printStackTrace();

        }

    }
}
