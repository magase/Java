package bebidas;

public class Refresco extends Productos{

	double azucar;
	boolean promo;
	
	public Refresco(int id, int precio, int litros, String marca, double azucar, boolean promo) {
		super(id, precio, litros, marca);
		this.azucar = azucar;
		this.promo = promo;
	}

	public double getAzucar() {
		return azucar;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}

	public boolean isPromo() {
		return promo;
	}

	public void setPromo(boolean promo) {
		this.promo = promo;
	}

	@Override
	public String toString() {
		return "Refresco [azucar=" + azucar + ", promo=" + promo + ", id=" + id + ", precio=" + precio + ", litros="
				+ litros + ", marca=" + marca + "]";
	}

	

}

