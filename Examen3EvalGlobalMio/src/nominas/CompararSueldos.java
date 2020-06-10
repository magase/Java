package nominas;

import java.util.Comparator;

public class CompararSueldos implements Comparator<Empleados> {

    @Override
    public int compare(Empleados o1, Empleados o2) {
       if (o1.getSueldo() < o2.getSueldo()){
           return 1;
       }else {
           return -1;
       }
    }
}
