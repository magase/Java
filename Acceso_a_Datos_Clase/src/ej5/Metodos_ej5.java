package ej5;

import java.io.*;
import java.util.*;

public class Metodos_ej5 {

	public void estadistica () {
		ArrayList<Character > lista = new ArrayList<Character>();
		
		try {
			FileReader entrada = new FileReader("C:\\Users\\ram\\Desktop\\leyendo_creando\\numeros.txt");
			
			int c = entrada.read();
			
			while(c != -1) {
				int numero = (char)c;
				
				
				
				c=entrada.read();
				if (numero  != ' ') {
					lista.add((char) numero);
					//System.out.print(numero);
				}
				
			}
			
			int contador = 0;
			int moda = 0;
			
			 for (int i = 0; i < lista.size(); i++) {
				 
			     for (int j = 0 ; j < lista.size(); j++) {
			         if(lista.get(i) == lista.get(j)) {
			        	 
			        	 
			        	 contador++;
			        	 if(moda <= contador) {
			        		 moda=contador;
			        	 }
			         }
			             
			     }
			     			     
				 System.out.println(lista.get(i)+ " Se repite " + contador );
				
				 contador = 0;
			
			}
			 
			 System.out.println("El numero q mas se repite es : " + moda);
			
			
			entrada.close();
		}catch(Exception e) {
			
			e.getClass();
		}
		
		
		
		 
		 
		 
		 
		 
		 
		 
	}
	
	
}
