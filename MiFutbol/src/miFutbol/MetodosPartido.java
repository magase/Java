package miFutbol;

import javax.swing.*;
import java.util.ArrayList;

public class MetodosPartido {
    static ArrayList<Jugador> equipoLocal = new ArrayList<Jugador>();
    static ArrayList<Jugador> equipoVisitante = new ArrayList<Jugador>();


    public void crearJugador(){
        String nombre = JOptionPane.showInputDialog("Nombre del jugador");
        String apellido1 = JOptionPane.showInputDialog("Primer apellido del jugador");
        String apellido2 = JOptionPane.showInputDialog("Segundo apellido del jugador");
        String apodo = JOptionPane.showInputDialog("Apodo del jugador");

        //int equipo =Integer.parseInt(JOptionPane.showInputDialog("¿Su equipo es local o visitante?" + "\n1- Local" + "\n2- Visitante"));

        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Cual es su posicion?" + "\n1- Portero" + "\n2- Defensa"+ "\n3- Delantero"));

        //PORTERO
        if (posicion==1){
            int dorsal = 1;
            int goles = 0;
            int pases =0;
            int paradas = 0;
            int tarjetas = 0;
            int valor = goles*pases*paradas;
            int equipo =Integer.parseInt(JOptionPane.showInputDialog("¿Su equipo es local o visitante?" + "\n1- Local" + "\n2- Visitante"));
            if (equipo==1) {
                Jugador jugadorP = new Portero(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, paradas, Equipo.LOCAL);
                equipoLocal.add(jugadorP);
            }
            if (equipo==2) {
                Jugador jugadorP = new Portero(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, paradas, Equipo.VISITANTE);
                equipoVisitante.add(jugadorP);
            }

        }
        //DEFENSA
        if (posicion==2){
            int dorsal = Integer.parseInt(JOptionPane.showInputDialog("Dorsal del jugador"));
            int goles = 0;
            int pases =0;
            int jugadasCortadas = 0;
            int tarjetas = 0;
            int valor = goles*pases*jugadasCortadas;
            int equipo =Integer.parseInt(JOptionPane.showInputDialog("¿Su equipo es local o visitante?" + "\n1- Local" + "\n2- Visitante"));
            if (equipo==1) {
                Jugador jugadorP = new Portero(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, jugadasCortadas, Equipo.LOCAL);
                equipoLocal.add(jugadorP);
            }
            if (equipo==2) {
                Jugador jugadorP = new Portero(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, jugadasCortadas, Equipo.VISITANTE);
                equipoVisitante.add(jugadorP);
            }

        }
        //DELANTERO
        if (posicion==3){
            int dorsal = Integer.parseInt(JOptionPane.showInputDialog("Dorsal del jugador"));
            int goles = 0;
            int pases =0;
            int jugadasGol = 0;
            int tarjetas = 0;
            int valor = goles*pases*jugadasGol;
            int equipo =Integer.parseInt(JOptionPane.showInputDialog("¿Su equipo es local o visitante?" + "\n1- Local" + "\n2- Visitante"));
            if (equipo==1) {
                Jugador jugadorP = new Portero(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, jugadasGol, Equipo.LOCAL);
                equipoLocal.add(jugadorP);
            }
            if (equipo==2) {
                Jugador jugadorP = new Portero(nombre, apellido1, apellido2, apodo, dorsal, goles, pases, tarjetas, valor, jugadasGol, Equipo.VISITANTE);
                equipoVisitante.add(jugadorP);
            }


        }
    }



}
