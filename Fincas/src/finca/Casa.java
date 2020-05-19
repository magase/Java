package finca;

public class Casa {

	int tamañoC;
	int pisos;
	int habitaciones;

	
	//CREA UNA CASA
	public Casa(int tamañoC, int pisos, int habitaciones) {
		this.tamañoC = tamañoC;
		this.pisos = pisos;
		this.habitaciones = habitaciones;
	}
	
	
	//GETTERS Y SETTERS PARA DAR VALORES
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

	public String toString() {
		return "\nLa casa tiene: " + tamañoC + " metros cuadrados " + pisos + " plantas y " + habitaciones
				+ " habitaciones";
	}

}
