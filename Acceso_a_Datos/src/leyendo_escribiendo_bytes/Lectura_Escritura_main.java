package leyendo_escribiendo_bytes;

//import java.io.*;


public class Lectura_Escritura_main  {

	public static void main(String[] args) {
		
		Lectura_Escritura verBytes = new Lectura_Escritura();
		
		int datos_entrada[] = new int[537];
		verBytes.datos_bytes();
		
		verBytes.copia_fichero(datos_entrada);
		
	}

}
