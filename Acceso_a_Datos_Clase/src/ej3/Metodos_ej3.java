package ej3;

import java.io.*;
import java.util.*;

public class Metodos_ej3 {

	
	public void invertirArchivo() {
		ArrayList<Character> lista = new ArrayList<Character>();
	
		try {
			FileReader entrada = new FileReader("C:\\Users\\ram\\Desktop\\leyendo_creando\\texto.txt");
			
			int c = entrada.read();
			
			while(c != -1) {
				char letra = (char)c;
				
				System.out.print(letra);
				
				c=entrada.read();
				lista.add(letra);
				
			}
			
			char frase;
			FileWriter invertido = new FileWriter("C:\\Users\\ram\\Desktop\\leyendo_creando\\invertido.txt");
			
			for(int i = lista.size()-1; i >= 0;i--) {
				
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
