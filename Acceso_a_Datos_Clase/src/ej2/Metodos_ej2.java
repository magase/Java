package ej2;

import java.io.*;
import java.util.Scanner;

public class Metodos_ej2 {
	
	public void buscarCarpeta() {
		
		
		File ruta = new File("C:\\Users\\ram\\Desktop");
		
		String[] nombre_directorios = ruta.list();
		Scanner teclado = new Scanner(System.in);
		File archivoExistente;
		boolean existe = false;
		
		String buscarArchivo=teclado.nextLine();
			for (int i=0; i<nombre_directorios.length;i++) {
				
				if (buscarArchivo.equals(nombre_directorios[i])){
				
					existe = true;
					//leyendo_creando//ejemploJava.txt
					archivoExistente = new File (ruta.getAbsoluteFile(), nombre_directorios[i]);
					
					System.out.println("El archivo existe");
					
					System.out.println(archivoExistente.canExecute());
					
					System.out.println(archivoExistente.canWrite());
				}
			}
			if(existe== false) {
				
				System.out.println("El archivo no existe");
			}
		
			
		
		
		
	
	
	
		//System.out.println(ruta2.exists());
		
		teclado.close();
	
	}
	
}
