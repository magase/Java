package futbol;

public class Defensor extends JugadorCampo {

	/*
	+	int	obtenerValoracion() GOLES *20 + PASES *1 + RECUPERACIONES *4
	+	String	toString()
	 */
	public Defensor() {
		
	}
	
	public Defensor(int dorsal, int goles, String nombre, TipoEquipo equipo, int pases, int recuperaciones) {
		super(dorsal, goles, nombre, equipo, pases, recuperaciones);
	}
	
	public int obtenerValoracion() {
		
		int valor = goles *20 + pases *1 + recuperaciones *4;
		
		
		return valor;
		
	}

	@Override
	public String toString() {
		return "\n Defensor pases=" + pases + "\n recuperaciones=" + recuperaciones + "\n dorsal=" + dorsal + "\n goles="
				+ goles + "\n nombre = " + nombre + "\n equipo = " + equipo + "\n Valoracion= " + obtenerValoracion();
	}

	@Override
	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
	
	
}
