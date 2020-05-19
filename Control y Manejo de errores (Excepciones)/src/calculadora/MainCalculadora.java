package calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainCalculadora {

	public static void main(String [] args) {
		
		int opcion, numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		
		try{
		do {
			System.out.println("1- Suma");
			System.out.println("2- Resta");
			System.out.println("3- Multiplicacion");
			System.out.println("4- Division");
			
			opcion=teclado.nextInt();
			
			switch(opcion) {
			
			case 1://suma
				System.out.println("Pon los numeros que quieras sumar ");
				numero1=teclado.nextInt();
				numero2=teclado.nextInt();
				System.out.println(numero1+numero2);
				break;
				
			case 2://resta
				System.out.println("Pon los numeros que quieras restar ");
				numero1=teclado.nextInt();
				numero2=teclado.nextInt();
				System.out.println(numero1-numero2);
				break;
				
			case 3://multiplicacion
				System.out.println("Pon los numeros que quieras multiplicar ");
				numero1=teclado.nextInt();
				numero2=teclado.nextInt();
				System.out.println(numero1*numero2);
				break;
				
			case 4://division
				System.out.println("Pon los numeros que quieras dividir ");
				numero1=teclado.nextInt();
				numero2=teclado.nextInt();
				System.out.println(numero1/numero2);
				break;
			}
			
			
		}
		while(opcion !=4);
		}catch(InputMismatchException e) {
			System.out.println("No es un numero");
		}
		finally {
			System.out.println("El programa ha finalizado");
		}
	}
	
}
