package centrosEducativos;

public class Privada extends CentrosEducativos {

	public int cuotaMensual;

	public Privada(String nombre, String direccion, int cuotaMensual) {
		super(nombre, direccion);
		this.cuotaMensual = cuotaMensual;
		this.nombre=nombre;
		this.direccion=direccion;
	}

	public int getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(int cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	@Override
	public String toString() {
		return "\nEl colegio es: " + nombre + "\nTipo: Privado " + "\nDireccion: " + direccion
				+ "\nCuota mensual: " + cuotaMensual + "€";
	}
	
}
