package iesCR.prog.figuras;

public class Figura {

	private String color;
	private boolean relleno;
	
	//CONSTRUCTOR DE SERIE
	public Figura() {
		//color=rojo;
		relleno=true;
	}
	
	//CONSTRUCTOR PERSONALIZADO
	public Figura(String col, boolean si) {
		color=col;
		relleno = si;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isRelleno() {
		return relleno;
	}

	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}
	
	public String toString() {
		
		return "Soy una figura de color" + color + "y" + relleno + "estoy rellena";
		
	}


}
