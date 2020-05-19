package prueba;

public class Pokemon {
	
	String nombre;
	int ps;
	int attack;
	
	public Pokemon(String nombre, int ps, int attack) {
		this.nombre=nombre;
		this.ps = ps;
		this.attack = attack;
	}
		
	public int getPs() {
		return ps;
	}

	//METODO PARA ASIGAR PS DESPUES DEL ATAQUE
	public void setPs(int ps) {
		this.ps = ps;
	}

	@Override
	public String toString(){
		return nombre + " " + " tiene: " + ps + " PS y " + attack + " pts de ataque"; 
		
	}
}
