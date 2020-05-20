package ciudad;

import java.io.*;
import java.util.*;

public class Ciudad {
	
	ArrayList<NombreCiudades> listaCiudades = new ArrayList<NombreCiudades>();
	
	
	public void leerCiudades() {
		
		try {
			
			FileReader archivo_lectura = new FileReader("C:\\Users\\ram\\Desktop\\leyendo_creando\\ciudades.txt");
			
			BufferedReader miBuffer = new BufferedReader(archivo_lectura);
					
			String[] atributos;
			
			while(miBuffer.read() != -1) {
				
				
				/*
				 * SEPARAMOS LOS ";" Y SE AÑADEN AL ARRAYLIST LOS DATOS SEPARADOS
				 */
				String linea = miBuffer.readLine();
				atributos = linea.split(";");
				
				listaCiudades.add(new NombreCiudades(atributos[0], Integer.parseInt(atributos[1]), Integer.parseInt(atributos[2]),Integer.parseInt(atributos[3]), Double.parseDouble(atributos[4])));
				
				
		}
			
		
			
		/*
		 * 
		 * SE CREA AUTOMATICAMENTE EL ARCHIVO AL TERMINAR DE RECORRER TODAS LAS CIUDADES
		 * 
		 */
		
		FileWriter ficheroCiudades = new FileWriter("C:\\Users\\ram\\Desktop\\leyendo_creando\\ListadoCiudades.txt");
	    
		for(int i=0;i<listaCiudades.size();i++){
			
			String ciudades = listaCiudades.get(i).toString();
			
			ficheroCiudades.write(ciudades);
			
		}
		
		/*
		 * SE CIERRAN LA ABERTURA DE ARCHIVOS
		 * 
		 */
		ficheroCiudades.close();
		miBuffer.close();
		archivo_lectura.close();
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}
	
	/*
	 * 
	 * Se comparan 2 ciudades las que el usario queda
	 * 
	 */
	public void CompararCiudades(int uno, int dos) {
		
		ComparadorCiudades comparar = new ComparadorCiudades();
		
		comparar.compare(listaCiudades.get(uno), listaCiudades.get(dos));

	}
	
	
}
