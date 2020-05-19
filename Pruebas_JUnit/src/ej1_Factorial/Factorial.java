package ej1_Factorial;

public class Factorial {
	//	La	ponemos	estática	para	no	tener	que	instanciar	la	clase
	public static double calcularFactorial(int num) {
		int i;
		double fact = 1;
		for (i = 2; i <= num; i++)
			fact = fact * i;
		return fact;
	}
}