package centrosEducativos;

public abstract class CentrosEducativos {
	
	protected String nombre;
	protected String direccion;
	
	public CentrosEducativos(String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
