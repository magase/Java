package manuelGarciaSeva_Tenis;

import java.util.Comparator;

public class CompararNivelRapido implements Comparator<Tenista> {
    @Override
    public int compare(Tenista t1, Tenista t2) {
        if (t1.getNivelR() < t2.getNivelR()){
            return 1;
        }else {
            return -1;
        }
    }
}
