package ciudad;

import java.util.*;

public class MainCiudad {

	public static void main(String[] args) {
		
		
		
		
		Scanner teclado = new Scanner(System.in);
		Ciudad ficheroCiudad = new Ciudad();
			
		ficheroCiudad.leerCiudades();
		
		System.out.println("Que ciudades quieres comparar? (Elegir posicion)");
		System.out.println("1- Las Rozas, 2 Colmenar, 3- Tres Cantos, 4-Aranjuez, 5 Fuenlabrada");
		
		int uno = teclado.nextInt();
		int dos = teclado.nextInt();
		
		ficheroCiudad.CompararCiudades(uno, dos);
		
		
		teclado.close();
	}

}
