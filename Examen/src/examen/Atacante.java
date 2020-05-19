package examen;

public class Atacante extends Jugador {

	int recuperaciones;

	public Atacante(String nombre, int numDor, String equipo, int numPase, int goles, int recuperaciones) {
		super(nombre, numDor, equipo, goles, numPase);
		this.recuperaciones = recuperaciones;
	}

	public Atacante() {
		
	}
/*
	public int getGolesA(int dorsal) {
		return goles;
	}
*/
	public int getnumDor() {
		return numDor;
	}

	public int getnumPase() {
		return numPase;
	}
	public String getNombre() {
		return nombre;
	}


	public void setNumPase(int numPase) {
		this.numPase = numPase;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public void setRecuperaciones(int recuperaciones) {
		this.recuperaciones = recuperaciones;
	}

	public String getValorAtacante(int numPase, int goles, int recuperaciones) {
		int valorAtacante;
		valorAtacante = (goles * 30) + (numPase * 1) + (recuperaciones * 3);

		return "El valor del jugador " + nombre + " es: " + valorAtacante;

	}
	/*
	//@Override
	public static  String getGoles (int numDor) {
		//String gol;
		//gol = goles;
			
		return "Los goles son ";
	}
*/
	@Override
	public String toString() {
		return "\nNombre= " + nombre + ", Dorsal= " + numDor + ", Equipo= " + equipo + " (Atacante)"
				+ "\nRecuperaciones= " + recuperaciones + "\nPases= " + numPase + "\nGoles= " + goles + "\n" + "\r";
	}

}
