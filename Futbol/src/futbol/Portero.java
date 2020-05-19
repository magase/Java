package futbol;

public class Portero extends Jugador {
	/*
	paradas	:	int
+	void	contabilizarParada()
+	int	obtenerValoracion() GOLES * 10 + PARADAS * 5 
+	String	toString()
	 */
	int paradas;

	public Portero() {
		
	}

	public Portero(int dorsal, int goles, String nombre, TipoEquipo equipo, int paradas) {
		super(dorsal, goles, nombre, equipo);
		this.paradas = paradas;
	}

	
	public int obtenerValoracion() {
		
		int valor = goles *20 + paradas * 5;
		
		
		return valor;
	}
	public int getParadas() {
		return paradas;
	}

	@Override
	public String toString() {
		return "\nPortero paradas= " + paradas + "\n dorsal= " + dorsal + "\n goles= " + goles + "\n nombre=" + nombre
				+ "\n equipo=" + equipo + "\n Valoracion= " + obtenerValoracion();
	}

	@Override
	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	
	
	

}
