package centrosEducativos;

public class Publica extends CentrosEducativos {
	
	public int dineroAnual;
	
	
	public Publica(String nombre, String direccion, int dineroAnual) {
		super(nombre, direccion);
		this.dineroAnual = dineroAnual;
		this.nombre=nombre;
		this.direccion= direccion;
	}

	public int getDineroAnual() {
		return dineroAnual;
	}

	public void setDineroAnual(int dineroAnual) {
		this.dineroAnual = dineroAnual;
	}

	@Override
	public String toString() {
		return "\nEl colegio es: " + nombre + "\nTipo: Publica " + "\nDireccion: " + direccion
				+ "\nDinero anual: " + dineroAnual +"€";
	}


	
	

		

}
