package finca;

public class Parcela {

	String agricola, ganadera;
	int tamañoP;

	/*
	 * public Parcela() {
	 * 
	 * }
	 */
	public Parcela(int tamañoP, String agricola, String ganadera) {
		this.agricola = agricola;
		this.ganadera = ganadera;
		this.tamañoP = tamañoP;
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

		return "\nLa parcela tiene: " + tamañoP + " metros cuadrados " + "\nGanadera: " + ganadera + "\nAgricola: "
				+ agricola;
	}

}
