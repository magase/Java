package miFutbol;

import java.util.Comparator;

public class ComprobarGoles implements Comparator<Jugador> {

    @Override
    public int compare(Jugador o1, Jugador o2) {
        if (o1.getGoles() < o2.getGoles()){
            return 1;
        }else {
            return -1;
        }
    }
}

