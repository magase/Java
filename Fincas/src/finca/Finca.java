package finca;

public class Finca {

	String nombre;
	int tama�oF;
	Casa casa;
	Parcela parcela;
//CREA LA CLASE FINCA Y LLAMA A CASA Y PARCELA
	public Finca(String nombre, int tama�oF, Casa casa, Parcela parcela) {
		this.nombre = nombre;
		this.tama�oF = tama�oF;
		this.casa = casa;
		this.parcela = parcela;
	}
	
	//GETTERS Y SETTERS PARA PONER EL TAMA�O Y EL NOMBRE
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTama�oF() {
		return tama�oF;
	}

	public void setTama�oF(int tama�oF) {
		this.tama�oF = tama�oF;
	}
	/*
	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

	public Parcela getParcela() {
		return parcela;
	}

	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}
	 */
	public String toString() {
		return "La finca se llama: " + nombre + "\nSu tama�o es: " + tama�oF + " metros cuadrados " + casa + parcela;
	}

}
