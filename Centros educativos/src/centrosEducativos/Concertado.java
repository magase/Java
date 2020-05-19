package centrosEducativos;

public class Concertado extends CentrosEducativos {

	public int dineroMensual;
	public int cuotaMensual;
	private int dineroTotal= cuotaMensual + dineroMensual;
	
	public Concertado(String nombre, String direccion, int dineroMensual, int cuotaMensual) {
		super(nombre, direccion);
		this.dineroMensual = dineroMensual;
		this.cuotaMensual = cuotaMensual;
		this.nombre=nombre;
		this.direccion=direccion;
		this.dineroTotal= cuotaMensual + dineroMensual;
	}
	
	public int getDineroMensual() {
		return dineroMensual;
	}

	public void setDineroMensual(int dineroMensual) {
		this.dineroMensual = dineroMensual;
	}

	public int getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(int cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}
	/*
	public int getDineroTotal(int dineroMensual, int cuotaMensual) {
		int dineroTotal= cuotaMensual + dineroMensual;
		
		return dineroTotal;
	}
	*/


	@Override
	public String toString() {
		return "\nEl colegio es: " + nombre + "\nTipo: Concertado " + "\nDireccion: " + direccion
				+ "\nDinero mensual: " + dineroMensual + "€"
				+ "\nCuota mensual: " + cuotaMensual + "€"
				+ "\nDinero total: " + dineroTotal + "€";
	}
	

}
