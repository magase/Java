package videoClub;

public class Juego extends Item {
	
	String compa�ia;
	static int horasJ;

	public Juego(String compa�ia, String nombre, int horasJ, boolean entregado, String genero) {
		super(nombre, entregado, genero);
		this.compa�ia = compa�ia;
		this.nombre = nombre;
		this.horasJ = horasJ;
		this.entregado=entregado;
		this.genero=genero;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	@Override
	public String toString() {
		return "Compa�ia " + compa�ia + ", nombre= " + nombre + ", horas= " + horasJ + ", entregado= " + entregado
				+ ", genero= " + genero;
	}

	public void compareTo(Juego juegoA) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	

}
