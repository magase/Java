package miFutbol;

import java.util.Comparator;

public class ComprobarDorsal implements Comparator<Jugador> {

    @Override
    public int compare(Jugador o1, Jugador o2) {
        if (o1.getDorsal() < o2.getDorsal()){
            return 1;
        }else {
            return -1;
        }
    }
}

