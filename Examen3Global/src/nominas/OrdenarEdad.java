package nominas;

import java.util.Comparator;

public class OrdenarEdad implements Comparator<Empleados> {
	
	public int compare(Empleados e1, Empleados e2) {
		
		return (e1.getEdad() - e2.getEdad());
	}

}
