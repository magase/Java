package ej1;

import java.util.*;

public class MainEj1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int cantNumeros;
		
		MetodosEj1 metodos = new MetodosEj1();
		
		System.out.println("Cuantos numeros quieres que salgan");
		
		cantNumeros = teclado.nextInt();
		
		for (int i=0; i <= cantNumeros; i++) {
			
			int random = (int)(Math.random() * 100);
			System.out.println(random);
		}
		
		
		
		metodos.numerosAleatorios(cantNumeros);
		
		
		
		
		teclado.close();
	}

}
