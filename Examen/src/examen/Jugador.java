package examen;

public abstract class Jugador  {

	String nombre;
	int numDor;
	String equipo;
	static int goles;
	int numPase;

	public Jugador() {
		
	}
	public Jugador(String nombre, int numDor, String equipo, int goles, int numPase) {
		this.nombre = nombre;
		this.numDor = numDor;
		this.equipo = equipo;
		Jugador.goles = goles;
		this.numPase = numPase;
	}

	public void setNumDor(int numDor) {
		this.numDor = numDor;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getNumPase() {
		return numPase;
	}

	public void setNumPase(int numPase) {
		this.numPase = numPase;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static String getGoles(int dorsal) {
		// TODO Auto-generated method stub
		int gol;
		gol = goles;
		return "Ha metido: " + gol;
	}
	

}
