package ciudad;

public class NombreCiudades {
	
	String nombre;
	int poblacion, vivendas, renta;
	double extension;
	

	
	public NombreCiudades(String nombre, int poblacion, int vivendas, int renta, double extension) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.vivendas = vivendas;
		this.renta = renta;
		this.extension = extension;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}


	public int getVivendas() {
		return vivendas;
	}


	public void setVivendas(int vivendas) {
		this.vivendas = vivendas;
	}


	public int getRenta() {
		return renta;
	}


	public void setRenta(int renta) {
		this.renta = renta;
	}


	public double getExtension() {
		return extension;
	}


	public void setExtension(int extension) {
		this.extension = extension;
	}
	
	public double getDensidad() {
		
		double densidad = poblacion/extension;
		
		return densidad;
	}
	
	
	public double getRiqueza() {
		
		double densidad = renta*poblacion;
		
		return densidad;
	}


	@Override
	public String toString() {
		return "NombreCiudades " + nombre + ", poblacion=" + poblacion + ", vivendas=" + vivendas + ", renta="
				+ renta + ", extension=" + extension;
	}
	
	
	
	
	
	
	

}
