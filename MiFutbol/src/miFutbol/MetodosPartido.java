package miFutbol;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MetodosPartido {
    static ArrayList<Jugador> equipoLocal = new ArrayList<Jugador>();
    static ArrayList<Jugador> equipoVisitante = new ArrayList<Jugador>();
    //static ArrayList<Jugador> partido = new ArrayList<Jugador>();


    public static void crearJugador() {
        String nombre = JOptionPane.showInputDialog("Nombre del jugador");
        String apellido1 = JOptionPane.showInputDialog("Primer apellido del jugador");
        String apellido2 = JOptionPane.showInputDialog("Segundo apellido del jugador");
        String apodo = JOptionPane.showInputDialog("Apodo del jugador");

        try {


            //int equipo =Integer.parseInt(JOptionPane.showInputDialog("¿Su equipo es local o visitante?" + "\n1- Local" + "\n2- Visitante"));

            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Cual es su posicion?" + "\n1- Portero" + "\n2- Defensa" + "\n3- Delantero"));

            //PORTERO
            if (posicion == 1) {

                int goles = 0;
                int pases = 0;
                int paradas = 0;
                int tarjetas = 0;
                int valor = goles * pases * paradas;
                int equipo = Integer.parseInt(JOptionPane.showInputDialog("¿Su equipo es local o visitante?" + "\n1- Local" + "\n2- Visitante"));
                if (equipo == 1) {
                    //Busca un dorsal 1, sino lo encuentra se lo asigna a el, esto hace que solo exista un portero con dorsal 1
                    int dorsal = 1;
                    for (int i = 0; i < equipoLocal.size(); i++) {
                        if (dorsal == equipoLocal.get(i).getDorsal() || dorsal > 22) {
                            dorsal = Integer.parseInt(JOptionPane.showInputDialog("Numero de dorsal"));
                            for (int j = 0; j < equipoLocal.size(); j++) {
                                if (dorsal == equipoLocal.get(j).getDorsal() || dorsal > 22) {
                                    JOptionPane.showMessageDialog(null, "No se puede asignar ese dorsal");
                                    return;
                                }
                            }
                        }

                    }
                    Jugador jugadorP = new Portero(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, paradas, Equipo.LOCAL);
                    equipoLocal.add(jugadorP);
                    //partido.add(jugadorP);
                }
                if (equipo == 2) {
                    int dorsal = 1;
                    for (int i = 0; i < equipoVisitante.size(); i++) {
                        if (dorsal == equipoVisitante.get(i).getDorsal() || dorsal > 22) {
                            dorsal = Integer.parseInt(JOptionPane.showInputDialog("Numero de dorsal"));
                            for (int j = 0; j < equipoVisitante.size(); j++) {
                                if (dorsal == equipoVisitante.get(j).getDorsal() || dorsal > 22) {
                                    JOptionPane.showMessageDialog(null, "No se puede asignar ese dorsal");
                                    return;
                                }
                            }
                        }

                    }
                    Jugador jugadorP = new Portero(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, paradas, Equipo.VISITANTE);
                    equipoVisitante.add(jugadorP);
                    //partido.add(jugadorP);
                }

            }
            //DEFENSA
            if (posicion == 2) {
                int goles = 0;
                int pases = 0;
                int jugadasCortadas = 0;
                int tarjetas = 0;
                int valor = goles * pases * jugadasCortadas;
                int equipo = Integer.parseInt(JOptionPane.showInputDialog("¿Su equipo es local o visitante?" + "\n1- Local" + "\n2- Visitante"));
                if (equipo == 1) {
                    int dorsal = Integer.parseInt(JOptionPane.showInputDialog("Dorsal del jugador"));
                    for (int i = 0; i < equipoLocal.size(); i++) {
                        if (dorsal == 1 || dorsal > 22 || dorsal == equipoLocal.get(i).getDorsal()) {
                            JOptionPane.showMessageDialog(null, "No se puede asignar ese numero de dorsal ");
                            return;
                        }
                    }
                    Jugador jugadorP = new Defensa(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, jugadasCortadas, Equipo.LOCAL);
                    equipoLocal.add(jugadorP);
                    //partido.add(jugadorP);
                }
                if (equipo == 2) {
                    int dorsal = Integer.parseInt(JOptionPane.showInputDialog("Dorsal del jugador"));
                    for (int i = 0; i < equipoVisitante.size(); i++) {
                        if (dorsal == 1 || dorsal > 22 || dorsal == equipoVisitante.get(i).getDorsal()) {
                            JOptionPane.showMessageDialog(null, "No se puede asignar ese numero de dorsal ");
                            return;
                        }

                    }
                    Jugador jugadorP = new Defensa(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, jugadasCortadas, Equipo.VISITANTE);
                    equipoVisitante.add(jugadorP);
                    //partido.add(jugadorP);
                }

            }
            //DELANTERO
            if (posicion == 3) {
                int goles = 0;
                int pases = 0;
                int jugadasGol = 0;
                int tarjetas = 0;
                int valor = goles * pases * jugadasGol;
                int equipo = Integer.parseInt(JOptionPane.showInputDialog("¿Su equipo es local o visitante?" + "\n1- Local" + "\n2- Visitante"));
                if (equipo == 1) {
                    int dorsal = Integer.parseInt(JOptionPane.showInputDialog("Dorsal del jugador"));
                    for (int i = 0; i < equipoLocal.size(); i++) {
                        if (dorsal == 1 || dorsal > 22 || dorsal == equipoLocal.get(i).getDorsal()) {
                            JOptionPane.showMessageDialog(null, "No se puede asignar ese numero de dorsal ");
                            return;
                        }

                    }
                    Jugador jugadorP = new Delantero(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, jugadasGol, Equipo.LOCAL);
                    equipoLocal.add(jugadorP);
                    //partido.add(jugadorP);

                }
                if (equipo == 2) {
                    int dorsal = Integer.parseInt(JOptionPane.showInputDialog("Dorsal del jugador"));
                    for (int i = 0; i < equipoVisitante.size(); i++) {
                        if (dorsal == 1 || dorsal > 22 || dorsal == equipoVisitante.get(i).getDorsal()) {
                            JOptionPane.showMessageDialog(null, "No se puede asignar ese numero de dorsal ");
                            return;
                        }

                    }
                    Jugador jugadorP = new Delantero(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, jugadasGol, Equipo.VISITANTE);
                    equipoVisitante.add(jugadorP);
                    //partido.add(jugadorP);
                }


            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void mostrarJugadoresVisitantes() {
        for (int i = 0; i < equipoVisitante.size(); i++) {
            JOptionPane.showMessageDialog(null, equipoVisitante.get(i));
        }

    }

    public static void mostrarJugadoresLocales() {
        for (int i = 0; i < equipoLocal.size(); i++) {
            JOptionPane.showMessageDialog(null, equipoLocal.get(i));
        }

    }

    public static void guardarArchivo() {
        try {
            FileWriter archivo = new FileWriter("C:\\Users\\ram\\Desktop\\futbol\\futbol.txt");
            archivo.write("EQUIPO LOCAL" + "\n");
            for (int i = 0; i < equipoLocal.size(); i++) {
                System.out.println(equipoLocal.get(i).toString());
                archivo.write(equipoLocal.get(i) + "\n");
            }
            archivo.write("\n" + "------------------------------------------------------------------------------" + "\n");
            archivo.write("EQUIPO VISITANTE" + "\n");
            for (int i = 0; i < equipoVisitante.size(); i++) {
                System.out.println(equipoVisitante.get(i).toString());
                archivo.write(equipoVisitante.get(i) + "\n");
            }
            ObjectOutputStream oosV = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolV.dat"));
            ObjectOutputStream oosL = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolL.dat"));
            //ObjectOutputStream oosT = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolT.dat"));
            oosV.writeObject(equipoVisitante);
            oosL.writeObject(equipoLocal);
            //oosT.writeObject(partido);
            oosV.close();
            oosL.close();
            //oosT.close();
            archivo.close();
            JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se puede generar el archivo");
        }
    }

    public static void serializarDatos() {
        try {
            ObjectOutputStream oosV = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolV.dat"));
            ObjectOutputStream oosL = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolL.dat"));
            //ObjectOutputStream oosT = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolT.dat"));
            oosV.writeObject(equipoVisitante);
            oosL.writeObject(equipoLocal);
            //oosT.writeObject(partido);
            oosL.close();
            //oosT.close();
            oosV.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void desSerializarDatos() {
        try {
            ObjectInputStream oosV = new ObjectInputStream(new FileInputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolV.dat"));
            ObjectInputStream oosL = new ObjectInputStream(new FileInputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolL.dat"));
            //ObjectInputStream oosT = new ObjectInputStream(new FileInputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolT.dat"));
            equipoVisitante = (ArrayList) oosV.readObject();
            for (int i = 0; i < equipoVisitante.size(); i++) {
                JOptionPane.showMessageDialog(null, equipoVisitante.get(i).toString());
            }
            equipoLocal = (ArrayList) oosL.readObject();
            for (int i = 0; i < equipoLocal.size(); i++) {
                JOptionPane.showMessageDialog(null, equipoLocal.get(i).toString());
            }

            //partido = (ArrayList) oosT.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cargarDatos() {
        try {
            ObjectInputStream oosV = new ObjectInputStream(new FileInputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolV.dat"));
            ObjectInputStream oosL = new ObjectInputStream(new FileInputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolL.dat"));
            //ObjectInputStream oosT = new ObjectInputStream(new FileInputStream("C:\\Users\\ram\\Desktop\\futbol\\futbolT.dat"));
            equipoVisitante = (ArrayList) oosV.readObject();

            equipoLocal = (ArrayList) oosL.readObject();

            //partido = (ArrayList) oosT.readObject();
            JOptionPane.showMessageDialog(null, "Datos cargados correctamente");

            guardarArchivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void buscarJugador(int numDor) {
        int equipo = Integer.parseInt(JOptionPane.showInputDialog("¿Es 1- local o 2- visitante?"));
        if (equipo == 1) {
            for (int i = 0; i < equipoLocal.size(); i++) {
                if (numDor == equipoLocal.get(i).getDorsal()) {
                    System.out.println(equipoLocal.get(i).toString());
                    JOptionPane.showMessageDialog(null, equipoLocal.get(i));
                }
            }

        }
        if (equipo == 2) {
            for (int i = 0; i < equipoVisitante.size(); i++) {
                if (numDor == equipoVisitante.get(i).getDorsal()) {
                    System.out.println(equipoVisitante.get(i).toString());
                    JOptionPane.showMessageDialog(null, equipoVisitante.get(i));
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encuntra esos datos");
        }
    }

    public static void sumarGoles(int sumGoles, int numDor) {
        int equipo = Integer.parseInt(JOptionPane.showInputDialog("¿Es 1- local o 2- visitante?"));
        switch (equipo) {
            case 1:
                for (Jugador jugador : equipoLocal) {
                    if (numDor == jugador.getDorsal()) {
                        jugador.setGoles(jugador.getGoles() + sumGoles);
                        System.out.println(jugador.toString());
                        JOptionPane.showMessageDialog(null, jugador);
                    }
                }
                break;

            case 2: {
                int i = 0;
                for (Jugador jugador : equipoVisitante) {
                    if (numDor == equipoVisitante.get(i).getDorsal()) {
                        jugador.setGoles(jugador.getGoles() + sumGoles);
                        System.out.println(equipoVisitante.get(i).toString());
                        JOptionPane.showMessageDialog(null, equipoVisitante.get(i));
                    }
                    i++;
                }
                break;

            }

        }
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres actualizar el archivo con los datos cambiados 1- Si o 2- No?"));

            if(opcion==1){
                guardarArchivo();
                JOptionPane.showMessageDialog(null, "Archivo actualizado");
            }if (opcion==2){
                JOptionPane.showMessageDialog(null, "Archivo sin actualizar");
        }

    }

    public static void sumarPases(int sumPases, int numDor) {
        int equipo = Integer.parseInt(JOptionPane.showInputDialog("¿Es 1- local o 2- visitante?"));
        switch (equipo) {
            case 1:
                for (Jugador jugador : equipoLocal) {
                    if (numDor == jugador.getDorsal()) {
                        jugador.setGoles(jugador.getGoles() + sumPases);
                        System.out.println(jugador.toString());
                        JOptionPane.showMessageDialog(null, jugador);
                    }
                }
                break;

            case 2: {
                int i = 0;
                for (Jugador jugador : equipoVisitante) {
                    if (numDor == equipoVisitante.get(i).getDorsal()) {
                        jugador.setGoles(jugador.getGoles() + sumPases);
                        System.out.println(equipoVisitante.get(i).toString());
                        JOptionPane.showMessageDialog(null, equipoVisitante.get(i));
                    }
                    i++;
                }
                break;

            }

        }
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres actualizar el archivo con los datos cambiados 1- Si o 2- No?"));

        if(opcion==1){
            guardarArchivo();
            JOptionPane.showMessageDialog(null, "Archivo actualizado");
        }if (opcion==2){
            JOptionPane.showMessageDialog(null, "Archivo sin actualizar");
        }

    }

    public static void ordenarDorsalLocal(){
        Collections.sort(equipoLocal, new ComprobarDorsal());
        for (Jugador e:
                equipoLocal) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public static void ordenarDorsalVisitante(){
        Collections.sort(equipoVisitante, new ComprobarDorsal());
        for (Jugador e:
                equipoVisitante) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public static void ordenarGoleslLocal(){
        Collections.sort(equipoLocal, new ComprobarGoles());
        for (Jugador e:
                equipoLocal) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public static void ordenarGolesVisitante(){
        Collections.sort(equipoVisitante, new ComprobarGoles());
        for (Jugador e:
                equipoVisitante) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
