package bebidas;

public abstract class Productos {
	
	protected int id;
	protected int precio;
	protected int litros;
	protected String marca;
	
	public Productos(int id, int precio, int litros, String marca) {
		this.id = id;
		this.precio = precio;
		this.litros = litros;
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
