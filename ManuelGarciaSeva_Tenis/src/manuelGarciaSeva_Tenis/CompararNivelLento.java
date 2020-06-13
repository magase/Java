package manuelGarciaSeva_Tenis;

import java.util.Comparator;

public class CompararNivelLento implements Comparator<Tenista> {
    @Override
    public int compare(Tenista t1, Tenista t2) {
        if (t1.getNivelL() < t2.getNivelL()){
            return 1;
        }else {
            return -1;
        }
    }
}
