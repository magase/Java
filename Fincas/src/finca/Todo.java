package finca;

public class Todo {

	String nombre;
	int tama�oF;
	
	int tama�oC;
	int pisos;
	int habitaciones;
	
	String agricola, ganadera;
	int tama�oP;
	public Todo(String nombre, int tama�oF, int tama�oC, int pisos, int habitaciones, String agricola, String ganadera,
			int tama�oP) {
		this.nombre = nombre;
		this.tama�oF = tama�oF;
		this.tama�oC = tama�oC;
		this.pisos = pisos;
		this.habitaciones = habitaciones;
		this.agricola = agricola;
		this.ganadera = ganadera;
		this.tama�oP = tama�oP;
	}
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
	public int getTama�oC() {
		return tama�oC;
	}
	public void setTama�oC(int tama�oC) {
		this.tama�oC = tama�oC;
	}
	public int getPisos() {
		return pisos;
	}
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	public String getAgricola() {
		return agricola;
	}
	public void setAgricola(String agricola) {
		this.agricola = agricola;
	}
	public String getGanadera() {
		return ganadera;
	}
	public void setGanadera(String ganadera) {
		this.ganadera = ganadera;
	}
	public int getTama�oP() {
		return tama�oP;
	}
	public void setTama�oP(int tama�oP) {
		this.tama�oP = tama�oP;
	}
	public String toString() {
		return "La finca se llama: " + nombre + "\nSu tama�o es: " + tama�oF + 
			   "\nLa casa tiene: " + tama�oC + " metros cuadrados " + pisos + " plantas y " + habitaciones+ " habitaciones"+
			   "\nLa parcela tiene: " + tama�oP + " metros cuadrados " + "\nGanadera: " + ganadera + "\nAgricola: " + agricola; 
	}
	
}
