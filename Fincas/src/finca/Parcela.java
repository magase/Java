package finca;

public class Parcela {

	String agricola, ganadera;
	int tama�oP;

	/*
	 * public Parcela() {
	 * 
	 * }
	 */
	public Parcela(int tama�oP, String agricola, String ganadera) {
		this.agricola = agricola;
		this.ganadera = ganadera;
		this.tama�oP = tama�oP;
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

		return "\nLa parcela tiene: " + tama�oP + " metros cuadrados " + "\nGanadera: " + ganadera + "\nAgricola: "
				+ agricola;
	}

}
