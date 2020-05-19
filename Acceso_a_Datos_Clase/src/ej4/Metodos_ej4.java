package ej4;

import java.io.*;
import java.util.ArrayList;

public class Metodos_ej4 {
	
	public void asteriscos() {
		ArrayList<String> lista = new ArrayList<String>();
	
		try {
			FileReader entrada = new FileReader("C:\\Users\\ram\\Desktop\\leyendo_creando\\texto.txt");
			
			int c = entrada.read();
			
			while(c != -1) {
				char letra = (char)c;
				
				System.out.print(letra);
				
				c=entrada.read();
				lista.add(letra + "*");
				
				
				
			}
			
			String frase;
			FileWriter invertido = new FileWriter("C:\\Users\\ram\\Desktop\\leyendo_creando\\asterisco.txt");
			
			for(int i =0; i < lista.size();i++) {
				
				frase = lista.get(i);
				
				
				System.out.print(frase);
				
				invertido.write(frase);
				
			}
			invertido.close();
			
			
			
			entrada.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
