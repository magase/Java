package ficheros_Directorios;

public class Pruebas_rutas_Main {
	
	public static void main (String[] args) {
		
		Pruebas_rutas directorio = new Pruebas_rutas();
		
		//directorio.crearDirectorio();
		
			
		//directorio.crearDirectorio();
		directorio.rellenarArchivo();
		directorio.listarCarpetas();
		directorio.borrarArchivo();
	}

}
