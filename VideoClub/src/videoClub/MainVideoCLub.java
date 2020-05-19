package videoClub;
//import java.util.ArrayList;


public class MainVideoCLub  extends ListaItems {
	public static void main(String [] args) {

	Serie serie = new Serie ("The Walking Dead", 55, false, "Supervivencia", "Fox");
	
	Juego juego = new Juego ("EA", "Fifa", 100, false, "Deportes");
	Juego juegoA = new Juego ("EA", "pes", 100, false, "Deportes");
	
	listaJuegos.add(juego);
	listaJuegos.add(juegoA);
	System.out.println(listaJuegos.get(0));
	
	
	listaSeries.add(serie);
	System.out.println(listaSeries.get(0));
	
	

	juego.compareTo(juegoA);
	
	}
	

}
