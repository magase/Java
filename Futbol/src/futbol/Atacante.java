package futbol;

public class Atacante extends JugadorCampo {
	/*
	 * +	int	obtenerValoracion() GOLES *30 + PASES *1 + RECUPERACIONES *3
+	String	toString()
	 */
	
	public Atacante() {
		
	}
	
	public Atacante(int dorsal, int goles, String nombre, TipoEquipo equipo, int pases, int recuperaciones) {
		super(dorsal, goles, nombre, equipo, pases, recuperaciones);
	}

	public int obtenerValoracion() {
		
		int valor = goles *30 + pases *1 + recuperaciones *3;
		
		
		return valor;
		
	}

	
	public String toString() {
		return "\nAtacante pases=" + pases + "\n recuperaciones=" + recuperaciones + "\n dorsal=" + dorsal + "\n goles="
				+ goles + "\n nombre = " + nombre + "\n equipo = " + equipo + "\n Valoracion= " + obtenerValoracion();
	}

	@Override
	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
