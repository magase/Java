package vehiculos;

public class Todoterreno extends Automovil {
		

	public Todoterreno(String marca, double consumo) {
		super(marca, consumo + consumo*0.2);
	}

	public double getConsumo() {
		
		return consumo;
	}

	public String toString() {
		return "El coche es: " + marca + " Y tiene un consumo de: " + consumo + " L/KM";
	}

	

}
