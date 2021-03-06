package examen;

public class Portero extends Jugador {

	int paradas;

	public Portero(String nombre, int numDor, String equipo, int numPase, int goles, int paradas) {
		super(nombre, numDor, equipo, goles, numPase);
		this.paradas = paradas;
	}

	public Portero() {
		
	}
	
	public void setNumPase(int numPase) {
		this.numPase = numPase;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public void setParadas(int paradas) {
		this.paradas = paradas;
	}

	public String getValorPortero(int goles, int paradas) {
		int valorPortero;
		valorPortero = goles * 10 + paradas * 5;

		return "El valor del jugador " + nombre + " es: " + valorPortero;

	}

	@Override
	public String toString() {
		return "\nNombre= " + nombre + " , Dorsal= " + numDor + ", Equipo= " + equipo + " (Portero)" + "\nParadas= "
				+ paradas + "\nPases= " + numPase + "\nGoles= " + goles + "\n" + "\r";
	}

	//@Override
	public static String getGoles (int numDor) {
			String goles;
			goles = Atacante.getGoles(numDor);
				
			return "Los goles son " + goles;
		}

}
