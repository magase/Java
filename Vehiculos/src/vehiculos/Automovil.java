package vehiculos;

public class Automovil extends Vehiculos{

	protected double consumo;
	
	
	public Automovil(String marca, double d){
		super(marca);
		this.consumo=d;
	}
	
	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double con) {
		con = consumo;
	}
	
	public String toString() {
		return "El coche es: " + marca + " Y tiene un consumo de: " + consumo + " L/KM";
	}


	
	

}
