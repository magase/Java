package notas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainNotas {

	public static void main(String[] args) {

		int lengua, mates, historia, fisica, quimica, dibujo;
		ArrayList<Integer> asignaturas = new ArrayList<Integer>(6);
		Scanner teclado = new Scanner(System.in);

		try {
		System.out.println("Calificacion de lengua= ");
		lengua = teclado.nextInt();
		if (lengua < 0) {
			System.out.println("Las notas no pueden tener un valor negativo \nEl programa ha finalizado");
			System.exit(0);
		} else {
			asignaturas.add(lengua);
		}

		System.out.println("Calificacion de mates= ");
		mates = teclado.nextInt();
		if (mates < 0) {
			System.out.println("Las notas no pueden tener un valor negativo \nEl programa ha finalizado");
			System.exit(0);
		} else {
			asignaturas.add(mates);
		}

		System.out.println("Calificacion de historia= ");
		historia = teclado.nextInt();
		if (historia < 0) {
			System.out.println("Las notas no pueden tener un valor negativo \nEl programa ha finalizado");
			System.exit(0);
		} else {
			asignaturas.add(historia);
		}

		System.out.println("Calificacion de fisica= ");
		fisica = teclado.nextInt();
		if (fisica < 0) {
			System.out.println("Las notas no pueden tener un valor negativo \nEl programa ha finalizado");
			System.exit(0);
		} else {
			asignaturas.add(fisica);
		}

		System.out.println("Calificacion de quimica= ");
		quimica = teclado.nextInt();
		if (quimica < 0) {
			System.out.println("Las notas no pueden tener un valor negativo \nEl programa ha finalizado");
			System.exit(0);
		} else {
			asignaturas.add(quimica);
		}

		System.out.println("Calificacion de dibujo= ");
		dibujo = teclado.nextInt();
		if (dibujo < 0) {
			System.out.println("Las notas no pueden tener un valor negativo \nEl programa ha finalizado");
			System.exit(0);
		} else {
			asignaturas.add(dibujo);
		}
		
		
		 for(int i = 0;i<asignaturas.size();i++){
			 
			 	if (i<5) {
	            System.out.println(asignaturas.get(i) + " Suspenso");
			 	}
			 	else {
			 		 System.out.println(asignaturas.get(i) + " Aprobado");
			 	}
		 }

		teclado.close();
		}catch(InputMismatchException e) {
			System.out.println("No es un numero");
		}
		finally {
			System.out.println("El programa ha finalizado");
		}
	}

}
