package nominas;

import java.util.Comparator;

public class OrdenarAntiguedad implements Comparator<Empleados> {
	
	public int compare(Empleados e1, Empleados e2) {
		
		return (e1.getFechaIncor()- e2.getFechaIncor());
	}


}
