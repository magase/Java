package finca;

public class Finca {

	String nombre;
	int tamañoF;
	Casa casa;
	Parcela parcela;
//CREA LA CLASE FINCA Y LLAMA A CASA Y PARCELA
	public Finca(String nombre, int tamañoF, Casa casa, Parcela parcela) {
		this.nombre = nombre;
		this.tamañoF = tamañoF;
		this.casa = casa;
		this.parcela = parcela;
	}
	
	//GETTERS Y SETTERS PARA PONER EL TAMAÑO Y EL NOMBRE
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamañoF() {
		return tamañoF;
	}

	public void setTamañoF(int tamañoF) {
		this.tamañoF = tamañoF;
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
		return "La finca se llama: " + nombre + "\nSu tamaño es: " + tamañoF + " metros cuadrados " + casa + parcela;
	}

}
