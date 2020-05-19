package calculadora;
import java.util.Scanner;


public class MainOperacion extends Operaciones  {       

    public static void main(String[] args){
    	
    	int opcion;
    	double sum;
    	double n1, n2, resta, multiplicacion, division;
    	Scanner teclado = new Scanner(System.in);
    	do {
    		System.out.println("¿Que operacion quieres hacer?");
    		System.out.println("1-Suma \n2-Resta \n3-Resta \n4.Multiplicacion \n5-Division ");
    		opcion = teclado.nextInt();
    		switch (opcion) {

    		//EESTE ES LA SUMA
    			case 1:
    				System.out.println("Marca la cifra que quieras sumar");
    				n1 = teclado.nextDouble();
    				System.out.println(n1);
    				System.out.println("Ahora la segunda cifra ");
    				n2 = teclado.nextDouble();
    				System.out.println(n2);
    				sum = getSuma(n1, n2);
    				System.out.print ( "La suma es: " + sum );
    				System.out.println("\f");
    			
    			break;    
    			
    		//ESTA ES LA RESTA
    			case 2:
    				System.out.println("Marca la cifra que quieras restar");
    				n1 = teclado.nextDouble();
    				System.out.println(n1);
    				System.out.println("Ahora la segunda cifra ");
    				n2 = teclado.nextDouble();
    				System.out.println(n2);
    				resta = getResta(n1, n2);
    				System.out.print ( "La resta es: " + resta);
    			
    			break;
    			
    		//ESTA ES LA MULTIPLICACION
    			case 3:
    				System.out.println("Marca la cifra que quieras multiplicar");
    				n1 = teclado.nextDouble();
    				System.out.println(n1);
    				System.out.println("Ahora la segunda cifra ");
    				n2 = teclado.nextDouble();
    				System.out.println(n2);
    				multiplicacion = getMultiplicacion(n1, n2);
    				System.out.print ( "La multiplicacion es: " + multiplicacion);
    			
    			break;
    		
    		//ESTA ES LA DIVISION
    			case 4:
    				System.out.println("Marca la cifra que quieras dividir");
    				n1 = teclado.nextDouble();
    				System.out.println(n1);
    				System.out.println("Ahora la segunda cifra ");
    				n2 = teclado.nextDouble();
    				System.out.println(n2);
    				division = getDivision(n1, n2);
    				System.out.print ( "La division es: " + division);
    			
    			break;
    			
    			default://SALIR
    		}
    		
    	}
    	while(opcion !=4);
    	
    	teclado.close();
    }
    
    
    

}
