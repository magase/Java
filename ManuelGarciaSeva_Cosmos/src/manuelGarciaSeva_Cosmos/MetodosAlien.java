package manuelGarciaSeva_Cosmos;

import javax.swing.*;
import java.util.ArrayList;

public class MetodosAlien implements Ataques{

   //static Alienigena[] listaAliens = new Alienigena[1];
    static ArrayList<Alienigena> listaAliens = new ArrayList<Alienigena>();
    static ArrayList<Marciano> listaMarte = new ArrayList<Marciano>();
    static ArrayList<Jupiter> listaJupiter = new ArrayList<Jupiter>();
    static ArrayList<Orion> listaOrion = new ArrayList<Orion>();


    public static void crearMarciano(){
        //String name, int vida, boolean vivo
        String name = JOptionPane.showInputDialog("Cual es su nombre?");
        Marciano marciano = new Marciano(name, 5, true, true);
        listaAliens.add(marciano);
        listaMarte.add(marciano);


    }

    public static void crearJupiter(){
        String name = JOptionPane.showInputDialog("Cual es su nombre?");
        Jupiter jupiter = new Jupiter(name, 5, true, 3);
        listaAliens.add(jupiter);
        listaJupiter.add(jupiter);



    }

    public static void crearOrion(){
        String name = JOptionPane.showInputDialog("Cual es su nombre?");
        Orion orion = new Orion(name, 5, true, 2);
        listaAliens.add(orion);
        listaOrion.add(orion);


    }


    public static void mostrarAliens(){
        for (int i=0; i<listaAliens.size();i++) {
            JOptionPane.showMessageDialog(null, listaAliens.get(i));

        }
    }

    public static void ataqueJupMarte(String nameJup, String nameMarte){
        //Ataques.ataqueJuMar(vida);
        for (int i=0; i<listaAliens.size();i++){
            if(nameMarte.equals(listaAliens.get(i).getName())){
                for (int j=0; j<listaAliens.size();j++) {
                    if(nameJup.equals(listaAliens.get(i).getName())) {
                        Ataques.ataqueAMar((Marciano) listaAliens.get(i), listaAliens.get(i).getPotencia());
                        JOptionPane.showMessageDialog(null, listaMarte.get(i));
                        comprobarvida();
                    }
                }
            }
        }

    }
    public static void ataqueOrioMarte(String nameOrio, String nameMarte){
        //Ataques.ataqueJuMar(vida);
        for (int i=0; i<listaAliens.size();i++){
            if(nameMarte.equals(listaAliens.get(i).getName())){
                for (int j=0; j<listaAliens.size();j++) {
                    if(nameOrio.equals(listaOrion.get(i).getName())) {
                        Ataques.ataqueAMar((Marciano) listaAliens.get(i), listaAliens.get(i).getPotencia());
                        JOptionPane.showMessageDialog(null, listaAliens.get(i));
                        comprobarvida();
                    }
                }
            }
        }

    }

    public static void ataque(String nameOrio, String nameJup){
        for (int i=0; i<listaAliens.size();i++){
            if(nameOrio.equals(listaAliens.get(i).getName())) {
                for (int j=0; j<listaAliens.size();j++) {
                    if (nameJup.equals(listaAliens.get(i).getName())) {
                        Ataques.ataqueGenerico((Jupiter) listaAliens.get(j), (Orion) listaAliens.get(i));
                        JOptionPane.showMessageDialog(null, listaAliens.get(i));
                        comprobarvida();


                    }
                }
            }
        }
    }
public static void comprobarvida(){
        for (int i=0; i<listaAliens.size();i++){
            if (!listaAliens.get(i).isVivo()){
                listaAliens.remove(i);
                JOptionPane.showMessageDialog(null, "Alienigena muerto");
            }
        }
}
}
