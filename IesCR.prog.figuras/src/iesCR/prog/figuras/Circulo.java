package iesCR.prog.figuras;

public class Circulo extends Figura{
	
	private double radio;

	
	public Circulo(String col, boolean si, double radio ) {
		super(col, si);
		radio=1;
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return 2*Math.PI*radio;
	}	
	
	public double getPerimetro() {
		return 2*Math.PI*radio;
	}



	

	
	

}
