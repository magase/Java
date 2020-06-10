package nominas;

import java.util.Comparator;

public class CompararFechaIncor implements Comparator<Empleados> {

    @Override
    public int compare(Empleados o1, Empleados o2) {
       if (o1.getFechaIncor() < o2.getFechaIncor()){
           return 1;
       }else {
           return -1;
       }
    }
}
