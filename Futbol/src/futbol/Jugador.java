package futbol;

public abstract class Jugador implements Comparable <Jugador> {
	
	
	int dorsal, goles;
	String nombre;
	TipoEquipo equipo;
	
	public Jugador() {
		
	}
	
	public Jugador(int dorsal, int goles, String nombre, TipoEquipo equipo) {
		this.dorsal = dorsal;
		this.goles = goles;
		this.nombre = nombre;
		this.equipo = equipo;
	}

	public int getDorsal() {
		return dorsal;
	}


	public int getGoles() {
		return goles;
	}


	public String getNombre() {
		return nombre;
	}

	public TipoEquipo getEquipo() {
		return equipo;
	}

	
	
	public void contabilizarGoles(int goles) {
		this.goles = goles;
	}
	
	public abstract int obtenerValoracion();

	@Override
	public String toString() {
		return "Jugador dorsal=" + dorsal + ", goles=" + goles + ", nombre=" + nombre + ", equipo=" + equipo;
	}
	
	

	
	
}
