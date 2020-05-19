package finca;

public class Casa {

	int tama�oC;
	int pisos;
	int habitaciones;

	
	//CREA UNA CASA
	public Casa(int tama�oC, int pisos, int habitaciones) {
		this.tama�oC = tama�oC;
		this.pisos = pisos;
		this.habitaciones = habitaciones;
	}
	
	
	//GETTERS Y SETTERS PARA DAR VALORES
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

	public String toString() {
		return "\nLa casa tiene: " + tama�oC + " metros cuadrados " + pisos + " plantas y " + habitaciones
				+ " habitaciones";
	}

}
