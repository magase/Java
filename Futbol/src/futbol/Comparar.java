package futbol;

import java.util.Comparator;

abstract class Comparar implements Comparator <Jugador>  {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		if(o1.getGoles()<o2.getGoles()) {
			return -1;
		}else if (o1.getGoles()<o2.getGoles()) {
			return 0;
		}else
		return 1;
	}
	
	public int comparePases(JugadorCampo o1, Jugador o2) {
		if(((JugadorCampo)o1).getPases()<((JugadorCampo) o2).getPases()) {
			return -1;
		}else if (((JugadorCampo)o1).getPases()<((JugadorCampo)o2).getPases()) {
			return 0;
		}else
		return 1;
	}



}
