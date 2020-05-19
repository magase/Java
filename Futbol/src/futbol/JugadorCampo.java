package futbol;

public abstract class JugadorCampo extends Jugador implements Comparable <Jugador> {


	int pases, recuperaciones;
	
	public JugadorCampo() {
		
	}
		
	public JugadorCampo(int dorsal, int goles, String nombre, TipoEquipo equipo, int pases, int recuperaciones) {
		super(dorsal, goles, nombre, equipo);
		this.pases = pases;
		this.recuperaciones = recuperaciones;
	}
	
	

	public int getPases() {
		return pases;
	}

	public int getRecuperaciones() {
		return recuperaciones;
	}

	public void setRecuperaciones(int recuperaciones) {
		this.recuperaciones = recuperaciones;
	}

	public void contabilizarPases(int pases) {
		this.pases = pases;
	}
	
	public void contabilizarRecuperaciones(int recuperaciones) {
		this.recuperaciones = recuperaciones;
	}
	
	public abstract int obtenerValoracion();

	@Override
	public String toString() {
		return "JugadorCampo pases=" + pases + ", recuperaciones=" + recuperaciones ;
	}
	
	
	
	public int compareToPases(JugadorCampo o) {
		if(o.getPases()<pases) {
			return -1;
		}else if (o.getPases()<goles) {
			return 0;
		}else
		return 1;
	}
	
	
}
