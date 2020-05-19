package videoClub;

public abstract class Item {
	
	protected String nombre;
	
	protected boolean entregado;
	protected String genero;
	
	
	
	public Item(String nombre, boolean entregado, String genero) {
		//super();
		this.nombre = nombre;
		this.entregado = entregado;
		this.genero = genero;
	}
	//NOMBRE DEL ITEM
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//ESTADO SI ESTA ENTREGADO O NO
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	
	//GENERO DEL ITEM
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
