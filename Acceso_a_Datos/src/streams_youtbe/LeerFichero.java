package streams_youtbe;


import java.io.*;

public class LeerFichero {
		
	public void lee() {
		/*
		 * 
			PRIMERO SE CAMBIA A LETRA DESPUES DEL UNICODE Y SE IMPRIME POR PANTALLA ANTES DEL PRIMER .read() 
			PARA QUE SE IMPRIMA EL 1º CARACTER
			
			SINO SE PUEDE IGUALAR c = 0 Y SE HACE AL REVES

		*
		*/
		try {
			FileReader entrada = new FileReader("C:/Users/ram/Desktop/ejemploJava.txt");
			
			int c  = entrada.read();	

			while (c!=-1) {
				char letra = (char)c;
				
				System.out.print(letra);
				
				c=entrada.read();
				
			}
			
			entrada.close();//DENTRO DEL try FUERA DEL BUCLE while
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("\nNo se encuentra el archivo ");
			System.out.println("Se ha producido un error de tipo: " + e.getClass().getName());
		}
		
	}
	
}
