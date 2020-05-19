package streams_youtbe;


import java.io.*;

public class Buffer_Archivo {
		
	public void leeBuffer() {
		/*
		 * 
			PRIMERO SE CAMBIA A LETRA DESPUES DEL UNICODE Y SE IMPRIME POR PANTALLA ANTES DEL PRIMER .read() 
			PARA QUE SE IMPRIMA EL 1� CARACTER
			
			SINO SE PUEDE IGUALAR c = 0 Y SE HACE AL REVES

		*
		*/
		try {
			FileReader entrada = new FileReader("C:/Users/ram/Desktop/ejemploJava.txt");
			
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			//int c  = entrada.read();	
			
			String linea = " ";

			while (linea != null) {
				
				linea=miBuffer.readLine();
				
				if (linea != null) {
				System.out.println(linea);
				}
				
				miBuffer.close();
			}
			
			//entrada.close();//DENTRO DEL try FUERA DEL BUCLE while
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("\nNo se encuentra el archivo ");
			System.out.println("Se ha producido un error de tipo: " + e.getClass().getName());
		}
		
	}
	
}
