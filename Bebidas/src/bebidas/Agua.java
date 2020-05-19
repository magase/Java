package bebidas;

public class Agua extends Productos{

	String origen;
	boolean carbonatada;
	
	public Agua(int id, int precio, int litros, String marca, String origen, boolean carbonatada) {
		super(id, precio, litros, marca);
		this.origen = origen;
		this.carbonatada = carbonatada;
		
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isCarbonatada() {
		return carbonatada;
	}

	public void setCarbonatada(boolean carbonatada) {
		this.carbonatada = carbonatada;
	}

	@Override
	public String toString() {
		return "Agua [origen=" + origen + ", carbonatada=" + carbonatada + ", id=" + id + ", precio=" + precio
				+ ", litros=" + litros + ", marca=" + marca + "]";
	}
	
	
	
	
	
}
