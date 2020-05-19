package temperatura;
import java.util.Scanner;

public class TemperaturaMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int opcion;
		
		System.out.println("Que temperatura tienes? ");
		System.out.println(" 1-Celsius  ");
		System.out.println(" 2-FAHRENHEIT  ");
		
		opcion=teclado.nextInt();
		
		if (opcion == 1) {
				System.out.println("Que temperatura hace?");
				int celsius, fahrenheit;
				celsius = teclado.nextInt();
				
				fahrenheit = (int) ((celsius * 1.8)+32);
				
				System.out.println("La temperatura en fahrenheit es " + fahrenheit + " ºF");				
				
			}
		if (opcion ==2) {
			System.out.println("Que temperatura hace?");
			int celsius, fahrenheit;
			fahrenheit = teclado.nextInt();
			
			celsius = (int) ((fahrenheit-32)/1.8);
			
			System.out.println("La temperatura en celsius es " + celsius + " ºC");				
			
			
		}
		teclado.close();
		

	}

}
