/*
package centrosEducativos;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListColes {
	private ArrayList<CentrosEducativos> listaColes;

	public  ArrayListColes() {
		
	}
	
	//AÑADE PUBLICOS AL ARRAY
	public void añadirPublico() {
		Publica colegioP = new Publica(null, null, 0);
		ListaColes.add(colegioP);
	}
	
	//AÑADE CONCERTADOS AL ARRAY
	public void añadirConcertado() {
		Concertado colegioC = new Concertado(null, null, 0, 0);
		ListaColes.add(colegioC);
	}
	
	//AÑADE PRIVADOS AL ARRAY
	public void añadirPrivado() {
		Privada colegioPr = new Privada(null, null, 0);
		ListaColes.add(colegioPr);
	}
	
	public static void imprimir(ArrayList<CentrosEducativos> listaColes) {
        for (CentrosEducativos elemento : listaColes)
            System.out.print(elemento + "-");
        System.out.println();
    }

	public ArrayList<CentrosEducativos> getListaColes(ArrayList<CentrosEducativos> listaColes) {
        for (CentrosEducativos elemento : listaColes)
            System.out.print(elemento + "-");
        System.out.println();
		return listaColes;
	}

	public void setListaColes(ArrayList<CentrosEducativos> listaColes) {
		this.listaColes = listaColes;
	}
	
	

}
Scanner teclado = new Scanner(System.in);
int opcion;


do {
	System.out.println("Que quieres hacer");
	System.out.println("1- Agregar Colegios");
	System.out.println("2- Ver Lista de Colegios");
	System.out.println("3- Modificar Colegios");
	System.out.println("4- Eliminar Colegios");
	System.out.println("5- Salir");
	
	opcion = teclado.nextInt();
	switch(opcion) {
	case 1:
		int tipo;
		System.out.println("¿Que clase es?");
		System.out.println("\n1- Publica 2- Concertado 3- Privado");
			tipo= teclado.nextInt();
			if (tipo==1) {
				
				teclado.nextLine();
				System.out.println("Que nombre tiene? ");
				String nombre=teclado.nextLine();
				
				System.out.println("Direccion: ");
				String direccion=teclado.nextLine();
				System.out.println("Que presupuesto anual tiene? ");
				int dinero=teclado.nextInt();
				Publica colegioP = new Publica(nombre, direccion, dinero);
				
				ListaColes.add(colegioP);
				System.out.println(colegioP+"\n");
				
				
			}
			
			if (tipo==2) {
				
				teclado.nextLine();
				System.out.println("Que nombre tiene? ");
				String nombre=teclado.nextLine();
				System.out.println("Direccion: ");
				String direccion=teclado.nextLine();
				System.out.println("Que presupuesto publico mensual tiene? ");
				int dineroM=teclado.nextInt();
				System.out.println("Cuanto se paga al mes? ");
				int pago=teclado.nextInt();
				Concertado colegioC = new Concertado(nombre, direccion, dineroM, pago);
				ListaColes.add(colegioC);
				System.out.println(colegioC+"\n");
							
			}
			if (tipo==3) {
				
				teclado.nextLine();
				System.out.println("Que nombre tiene? ");
				String nombre=teclado.nextLine();
				System.out.println("Direccion: ");
				String direccion=teclado.nextLine();
				System.out.println("Cuanto se paga al mes? ");
				int pagoP=teclado.nextInt();
				Privada colegioC = new Privada(nombre, direccion, pagoP);
				ListaColes.add(colegioC);
				System.out.println(colegioC+"\n");
			}
			break;			
	
	case 2:
		System.out.println("hoa");
		//System.out.println(((Object) ListaColes).getListaColes());
		break;
	}
	
}

while(opcion!=5); 
	//opcion=5



teclado.close();
}
*/