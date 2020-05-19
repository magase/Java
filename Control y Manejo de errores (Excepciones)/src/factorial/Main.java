package factorial;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		int iNumero=1;
		int numero;
		
		
		try {
		System.out.println("Escribe un numero por pantalla y te dare el factorial");
		
		numero=teclado.nextInt();
		
			for (int x=2;x<=numero;x++) {
				iNumero = iNumero * x;
			
			}
			System.out.println(iNumero);
		}catch (InputMismatchException e) {
			System.out.println("No es un numero");
		}
		finally {
			System.out.println("El programa ha finalizado");
		}
		
		
		
		
	}
}
