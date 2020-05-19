package ficheros_Directorios;

import java.io.*;

public class Escribiendo {
	
	public void escribir(String ruta_archivo) {
		
		String frase ="Esto es un ejemplo";
		
		try {
			
			FileWriter escritura = new FileWriter(ruta_archivo);
			
			for (int i=0;i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		}catch(Exception e) {
			
		}
	}

}
