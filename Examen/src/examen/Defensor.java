package examen;

public class Defensor extends Jugador{
	
	int recuperaciones;
	String nombre;
	int numDor;
	String equipo;
	int goles;
	int numPase;
	
	public Defensor(String nombre, int numDor, String equipo, int numPase, int goles, int recuperaciones) {
		super(nombre, numDor, equipo, goles, numPase);
		this.recuperaciones= recuperaciones;
	}
	
	public Defensor() {
		
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
	

	
	public String getDefensor(int numPase, int goles, int recuperaciones) {
		int valorDefensor;
		valorDefensor = goles*30 + numPase * 1 + recuperaciones *3;
		
		return "El valor del jugador " + nombre + " es: " + valorDefensor;
		
	}
	
	
	@Override
	public String toString() {
		return "\nNombre= " + nombre + " , Dorsal= " + numDor + ", Equipo= " + equipo + " (Defensor)"
				+"\nRecuperaciones= " + recuperaciones + "\nPases= " + numPase + "\nGoles= " + goles + "\n" + "\r";
	}

	//@Override
	public static String getGoles (int numDor) {
		String goles;
		goles = Atacante.getGoles(numDor);
			
		return "Los goles son " + goles;
	}

}
