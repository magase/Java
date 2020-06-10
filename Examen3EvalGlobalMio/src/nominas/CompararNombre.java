package nominas;

import java.util.Comparator;

public class CompararNombre implements Comparator<Empleados> {

    @Override
    public int compare(Empleados o1, Empleados o2) {
       return (o1.getNombre().compareTo(o2.getNombre()));
    }
}
