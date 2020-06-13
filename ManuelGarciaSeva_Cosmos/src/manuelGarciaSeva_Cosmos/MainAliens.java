package manuelGarciaSeva_Cosmos;

import javax.swing.*;

public class MainAliens {

    public static void main (String args[]){

        try {
            int opcion;
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "Que quieres hacer"
                                + "\n1-  Crear marciano"
                                + "\n2-  Crear jupetiriano"
                                + "\n3-  Crear orionianos"
                                + "\n4-  Mostrar empleados Guardados"
                                + "\n5-  Atacar a marte por jupiter"
                                + "\n6-  Atacar a marte por orion"
                                + "\n7-  Atacar entr orion y jupiter"
                                + "\n8-  Salir del programa"
                ));

                switch(opcion) {

                    case 1:
                        MetodosAlien.crearMarciano();
                        break;
                    case 2:
                        MetodosAlien.crearJupiter();
                        break;
                    case 3:
                        MetodosAlien.crearOrion();
                        break;
                    case 4:
                        MetodosAlien.mostrarAliens();
                        break;

                    case 5:
                        String nameMarte = JOptionPane.showInputDialog("Que nombre tiene el marciano");
                        String nameOr = JOptionPane.showInputDialog("Que nombre tiene el orion");
                        MetodosAlien.ataqueOrioMarte(nameOr, nameMarte);
                        break;


                    case 6:
                        String nameMart = JOptionPane.showInputDialog("Que nombre tiene el marciano");
                        String nameJup = JOptionPane.showInputDialog("Que nombre tiene el jupite");
                        MetodosAlien.ataqueJupMarte(nameJup, nameMart);
                        break;


                    case 7:
                        String nameOri = JOptionPane.showInputDialog("Que nombre tiene el orion");
                        String nameJupi = JOptionPane.showInputDialog("Que nombre tiene el jupite");
                        MetodosAlien.ataqueJupMarte(nameJupi, nameOri);
                        break;
                        /*
                    case 8:
                        SALIR DEL PROGRAMA
                         */


                }
            }while(opcion !=8);
            JOptionPane.showMessageDialog(null, "El programa ha terminado");

        }catch(Exception e ) {
            e.printStackTrace();

        }



    }
}
