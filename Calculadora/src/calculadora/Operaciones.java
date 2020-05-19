package calculadora;

public class Operaciones {
    
  //SUMA
	static double suma;
       
    public static double getSuma(double n1, double n2) {
             
        return suma = n1 + n2;
    }
  //-----------------------------------------------------------------------------------------
    
  //RESTA
    static double resta;
    
    public static double getResta (double n1, double n2) {
             
        return resta = n1 - n2;
    }
   //-----------------------------------------------------------------------------------------
    
   //MULTIPLICACION
    static double multi;
    
    public static double getMultiplicacion(double n1, double n2) {
             
        return multi = n1 * n2;
	}
  //-----------------------------------------------------------------------------------------
    
  //DIVISION
	static double div = 0;
    
    public static double getDivision(double n1, double n2) {
             
        if(n2==0) System.out.println("No se puede dividir entre cero");
        else div = n1 / n2;		
        return div;
	}
  //-----------------------------------------------------------------------------------------
    
}
