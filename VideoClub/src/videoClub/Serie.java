package videoClub;

public class Serie extends Item{
	
	String creador;
	static int horasS;
	
	public Serie(String nombre, int horasS, boolean entregado, String genero, String creador) {
		super(nombre, entregado, genero);
		this.creador = creador;
		this.nombre = nombre;
		this.horasS = horasS;
		this.entregado=entregado;
		this.genero=genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Creador= " + creador + ", nombre= " + nombre + ", horas= " + horasS + ", entregado= " + entregado
				+ ", genero= " + genero;
	}
	
	
	
	
	

}
