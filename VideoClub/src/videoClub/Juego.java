package videoClub;

public class Juego extends Item {
	
	String compañia;
	static int horasJ;

	public Juego(String compañia, String nombre, int horasJ, boolean entregado, String genero) {
		super(nombre, entregado, genero);
		this.compañia = compañia;
		this.nombre = nombre;
		this.horasJ = horasJ;
		this.entregado=entregado;
		this.genero=genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Compañia " + compañia + ", nombre= " + nombre + ", horas= " + horasJ + ", entregado= " + entregado
				+ ", genero= " + genero;
	}

	public void compareTo(Juego juegoA) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	

}
