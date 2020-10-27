package Operaciones;

import java.util.Scanner;

public class MainOperaciones {

    public static void main(String [] arg){
        Scanner teclado = new Scanner(System.in);

        int operador1, operador2, suma, resta, multiplicacion, division;



        System.out.println("Escribe un operador");
        operador1 = teclado.nextInt();
        System.out.println("Escribe otro operador");
        operador2 = teclado.nextInt();
        suma = operador1+operador2;
        resta = operador1-operador2;
        multiplicacion = operador1*operador2;
        division = operador1/operador2;
        System.out.println( "Suma: " + suma +
                            "\nResta: " + resta +
                            "\nMultiplicacion: " + multiplicacion +
                            "\nDivision: " + division
        );

    }
}
