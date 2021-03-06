package ficheros_Directorios;

import java.io.*;

public class Pruebas_rutas {
	
	public void verDirectorio() {
		
		File archivo = new File("bin");//RUTA POR DEFECTO eL WORKSPACE DE TRABAJO Q SE USE
		
		System.out.println(archivo.getAbsolutePath());//IMPRIME LA RUTA ABSOLUTA AUNQ NO EXISTA 
		
		
		System.out.println(archivo.exists());//SINO ESTA CREADO SALE false
			
		
	}
	
	
	public void listarCarpetas() {
		
		//File ruta = new File("C:/Users/ram/Desktop/leyendo_creando"); File.separator--> MULTIPLATAFORMA
		File ruta = new File("C:" + File.separator + "Users" + File.separator + "ram" + File.separator + "Desktop" + File.separator+"leyendo_creando");
		
		
		System.out.println(ruta.getAbsolutePath());
		
		String[] nombre_archivos = ruta.list();
		
		for (int i=0; i<nombre_archivos.length;i++) {
			
			System.out.println(nombre_archivos[i]);
			
			File f = new File (ruta.getAbsoluteFile(), nombre_archivos[i]);//SE ALMACENA LA RUTA ABSOLUTA DE LOS ARCHIVOS QUE HAY DENTRO DE LA CARPTEA
			
			if(f.isDirectory()) {
				String[] archivos_subcarpeta = f.list();
				for (int j=0; j<archivos_subcarpeta.length;j++) {
					
					System.out.println(archivos_subcarpeta[j]);
				}
			}
		}
		
		
	}
	
	
	public void crearDirectorio() {
		
		File ruta = new File("C:" + File.separator + "Users" + File.separator + "ram" + File.separator + "Desktop" + File.separator + "leyendo_creando" + File.separator + "Carpeta_Creada_En_Eclise");
		
		ruta.mkdir();
		
		
	}
	
	public void crearArchivo() {
		
		File ruta = new File("C:" + File.separator + "Users" + File.separator + "ram" + File.separator + "Desktop" + File.separator + "leyendo_creando" + File.separator + "Archivo_Creado_En_Eclise.txt");
		
		try {
			
			ruta.createNewFile();
		
		} catch (IOException e) {
		
			System.out.println("No se ha podido crear el archivo");
			System.out.println("Ha tenido un erro de tipo: " + e.getClass().getName());
		
		}
		
		
		
	}
	
	public void rellenarArchivo() {
		
		File ruta = new File("C:" + File.separator + "Users" + File.separator + "ram" + File.separator + "Desktop" + File.separator + "leyendo_creando" + File.separator + "Rellenar_Archivo_Creado_En_Eclise.txt");
				
		String archivo_destino = ruta.getAbsolutePath();
		
		Escribiendo accede_es = new Escribiendo();
		
		accede_es.escribir(archivo_destino);
	}
	
	public void borrarArchivo() {
		
		File ruta = new File("C:" + File.separator + "Users" + File.separator + "ram" + File.separator + "Desktop" + File.separator + "leyendo_creando" + File.separator + "Rellenar_Archivo_Creado_En_Eclise.txt");
		
		ruta.delete();
		
		
		
	}
	
	
	

}
