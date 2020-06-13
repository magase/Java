package manuelGarciaSeva_Tenis;

import javax.swing.*;
import java.io.*;
import java.util.*;


public class MetodosTenis {

    static ArrayList<Tenista> listaTenistas = new ArrayList<Tenista>();


    /**
     * Carga los datos del fichero en el programa
     */
    public static void  leerFichero(String name){
        name.toLowerCase();
        if (name.equals("tenista")) {
            File file = new File("C:\\Users\\ram\\Desktop\\Tenis\\tenistas.txt");
            Scanner scanner;
            try {
                //se pasa el flujo al objeto scanner
                scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    // el objeto scanner lee linea a linea desde el archivo
                    String linea = scanner.nextLine();
                    Scanner delimitar = new Scanner(linea);
                    //se usa una expresión regular
                    //que valida que antes o despues de una coma (,) exista cualquier cosa
                    //parte la cadena recibida cada vez que encuentre una coma
                    delimitar.useDelimiter("\\s*,\\s*");
                    Tenista e = new Tenista();
                    e.setNombre(delimitar.next().toLowerCase());
                    e.setResistencia(delimitar.nextInt());
                    e.setSalud(delimitar.nextInt());
                    e.setForma(delimitar.nextInt());
                    e.setCalidad(delimitar.nextInt());
                    e.setPotencia(delimitar.nextInt());
                    e.setNivelR(e.getPotencia(), e.getResistencia(), e.getSalud(), e.getForma());
                    e.setNivelL(e.getCalidad(), e.getResistencia(), e.getSalud(), e.getForma());
                    listaTenistas.add(e);
                }
                //se cierra el ojeto scanner
                JOptionPane.showMessageDialog(null, "Datos cargados correcamente");
                scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo");
        }
    }

    /**
     *
     * Muestra toda el arraylist de tenista mediante iterator
     */
    public static void mostrarTenistas(){
        Iterator<Tenista> it = listaTenistas.iterator();
        while(it.hasNext())
            JOptionPane.showMessageDialog(null, it.next());
    }

    /**
     *
     * @param name busca el tenista en el arraylist
     *  muestra todos los datos que tiene buscando por un For Each
     */

    public static void mostrarNivel(String name){
        for (Tenista listaTenistas : listaTenistas) {
            String nombre = listaTenistas.getNombre();
            if (nombre.equals(name)) {
                JOptionPane.showMessageDialog(null, listaTenistas.toString());
            }

        }
    }

    /**
     * Va comprarndo los Niveles en pista rapida y comparandolo con una clase comparator y lo ordena con estos metodos
     */
    public static void ordenarPistaRapida(){
        Collections.sort(listaTenistas, new CompararNivelRapido());
        for (Tenista j:
                listaTenistas) {
            JOptionPane.showMessageDialog(null, j);
        }
    }
    public static void ordenarPistaLenta(){
        Collections.sort(listaTenistas, new CompararNivelRapido());
        for (Tenista j:
                listaTenistas) {
            JOptionPane.showMessageDialog(null, j);
        }
    }


}

