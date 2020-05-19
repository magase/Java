package finca;

public class Todo {

	String nombre;
	int tamañoF;
	
	int tamañoC;
	int pisos;
	int habitaciones;
	
	String agricola, ganadera;
	int tamañoP;
	public Todo(String nombre, int tamañoF, int tamañoC, int pisos, int habitaciones, String agricola, String ganadera,
			int tamañoP) {
		this.nombre = nombre;
		this.tamañoF = tamañoF;
		this.tamañoC = tamañoC;
		this.pisos = pisos;
		this.habitaciones = habitaciones;
		this.agricola = agricola;
		this.ganadera = ganadera;
		this.tamañoP = tamañoP;
	}
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
	public int getTamañoC() {
		return tamañoC;
	}
	public void setTamañoC(int tamañoC) {
		this.tamañoC = tamañoC;
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
	public int getTamañoP() {
		return tamañoP;
	}
	public void setTamañoP(int tamañoP) {
		this.tamañoP = tamañoP;
	}
	public String toString() {
		return "La finca se llama: " + nombre + "\nSu tamaño es: " + tamañoF + 
			   "\nLa casa tiene: " + tamañoC + " metros cuadrados " + pisos + " plantas y " + habitaciones+ " habitaciones"+
			   "\nLa parcela tiene: " + tamañoP + " metros cuadrados " + "\nGanadera: " + ganadera + "\nAgricola: " + agricola; 
	}
	
}
