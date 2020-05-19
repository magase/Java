package ej1;

import java.io.*;
import java.util.*;

public class MainEj1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int cantNumeros;
		
		
		ArrayList <Character> numerosGuardados = new ArrayList <Character>();
		
		MetodosEj1 metodos = new MetodosEj1();
		
		System.out.println("Cuantos numeros quieres que salgan");
		
		cantNumeros = teclado.nextInt();
		
		try {
			FileWriter ficheroAleatorio = new FileWriter("C:\\Users\\ram\\Desktop\\leyendo_creando\\aleatorios.txt");
			//FileInputStream ficheroAleatorio = new FileInputStream("C:\\Users\\ram\\Desktop\\leyendo_creando\\aleatorios.dat");
			
			for (int i=0; i <= cantNumeros; i++) {
			
				
			
				int random = (int)(Math.random() * 100);
				System.out.println(random);
				numerosGuardados.add((char) random);
				
				ficheroAleatorio.write((char)random);
				
			}
			/*
			for (Integer e: numerosGuardados) {
				
				System.out.println(e);
				
			}
			*/
		
		
		ficheroAleatorio.close();
		
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		metodos.numerosAleatorios(cantNumeros);
		
		
		
		
		teclado.close();
	}

}
