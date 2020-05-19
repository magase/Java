package ej1;
import java.io.*;

public class Metodos_Ej1 {

	public void buscarDirectorio() {
		

		//File ruta = new File("C:" + File.separator + "Users" + File.separator + "ram" + File.separator + "Desktop");
		
		//File[] nombre_directorios = ruta.listFiles();
		
		File nombreBusca =  new File("C:" + File.separator + "Users" + File.separator + "ram" + File.separator + "Desktop" + File.separator +"leyendo_creando8");
		//boolean carpetaBusca=false;
		
	
		if(nombreBusca.exists()) {
			System.out.println("La carpeta existe");
		}else {
			
			System.out.println("La carpeta no existe");
		}
		
		
	}	
}
