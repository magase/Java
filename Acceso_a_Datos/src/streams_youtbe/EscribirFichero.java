package streams_youtbe;

import java.io.*;


public class EscribirFichero {

	public void escribir() {
		String frase ="\nEsto es una prueba de escritura con relleno de true en el [File Writer con true]";
		
		try {
			FileWriter escritura = new FileWriter("C:/Users/ram/Desktop/ejemploJavaEscritura.txt", true);
			//Sin true y el archivo es existente los datos se sobreescriben borrando lo anterior
			
			for (int i =0; i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			System.out.println("No se puede gerenrar el archivo");
			System.out.println("Se ha producido un error de tipo: " + e.getClass().getName());
		}
		
	}
	
}
