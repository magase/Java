import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
   	 // TODO Auto-generated method stub
   	 int suerte, vida = 100, enter = 0, opcion = 0, contador = 0, opcion2 = 0, res, res1, res2, res3, diamante = 0, total=0, diam;
   	 boolean bicho = true;
   	 Scanner sc = new Scanner(System.in);
   	 Player c1 = new Player(0, 0, diamante);
   	 System.err.println("Comandos para mover al jugador:\n" +
   						 " 1- mover derecha\n" +
   						 " 2- mover izquierda\n" +
   						 " 3- mover hacia delante\n" +
   						 " 4- mover hacia atrás\n" +
   						 " 5- subir una planta\n" +
   						 " 6- bajar una planta\n" +
   						 " 7- buscar diamantes\n" +
   						 " 8- huir\n" +
   						 " 9- pelear\n" +
   						 " 10-mostrar planta y coordenadas actuales del jugador\n" +
   						 " 11- mostrar una lista con todos los comandos\n" +
   						 " 12- mostrar número de turnos consumidos");
   	 System.out.println();
   	 System.out.println("¿Cuanta suerte quieres poner?(valor del 0-100)");
   	 suerte = sc.nextInt();
   	 while (suerte < 0 && suerte > 100) {
   		 System.out.println("¿Cuanta suerte quieres poner?(valor del 0-100)");
   		 suerte = sc.nextInt();
   	 }
   	 System.out.println("Para iniciar el juego pulsa el 1");
   	 enter = sc.nextInt();
   	 if (enter == 1) {
   		 System.out.println("Empieza el juego");

   		 while ((contador != 10) || (vida<=0)) {
   			 System.out.println("Elija la opcion que mas prefiera");
   			 System.out.println("1.Mover a la derecha");
   			 System.out.println("2.Mover a la izquierda");
   			 System.out.println("3.Mover hacia delante");
   			 System.out.println("4.Mover hacia atrás");
   			 System.out.println("5.Subir una planta");
   			 System.out.println("6.Bajar una planta");
   			 System.out.println("7.Buscar diamantes");
   			 System.out.println("10.Mostrar planta y coordenadas actuales del jugador");
   			 System.out.println("11.Mostrar una lista con todos los comandos");
   			 System.out.println("12.Mostrar numero de turnos consumidos");

   			 int option = sc.nextInt();

   			 switch (option) {

   			 case 1:// mDerecha
   				 System.out.println();
   				 c1.mDerch();
   				 contador++;
   				 break;
   			 case 2:// mIzquierda
   				 System.out.println();
   				 c1.mIzq();
   				 contador++;
   				 break;
   			 case 3:// mDelante
   				 System.out.println();
   				 c1.mArriba();
   				 contador++;
   				 break;
   			 case 4:// mAtras
   				 System.out.println();
   				 c1.mAbajo();
   				 contador++;
   				 break;
   			 case 5:// Subir
   				 System.out.println();
   				 c1.mSubir();
   				 contador++;
   				 break;
   			 case 6:// Bajar
   				 System.out.println();
   				 c1.mBajar();
   				 contador++;
   				 break;
   			 case 7:// Diamantes
   				 System.out.println();
   				 res=c1.getSuerte();
   				 System.out.println(diamante);
   				 System.out.println();
   				 System.out.println("8.Huir");
   				 System.out.println("9.Pelear");
   				 	int opcion21 = sc.nextInt();
   				 	
   				 	
   				 	switch (opcion21) {
   				 		case 8:// Huir
   				 			System.out.println();
   				 			if (bicho=true) {
   				 				res=c1.huir();
   				 				res1=c1.getAntx();
   				 				res2=c1.getAnty();
   				 				res3=c1.getAntz();
   				 				System.out.println("Coordenada("+res1+","+res2+")");
   				 				System.out.println("Estás en la planta: "+res3);
   				 			}
   				 			else {
   				 				if (bicho = false) {
   				 					
   				 				}
   				 			}
   					 
   				 			break;
   				 		case 9:// Pelear
   				 			System.out.println();
   				 			int random = (int) (Math.random() * 100 + 1);
   				 			if (random > 30) {
   				 				diam = 3;
   				 				total=diamante+diam;
   				 				System.out.println(total);
   				 			} else {
   				 				System.out.println("Fatality");
   				 				vida = vida - 10;
   				 				System.out.println(vida);
   				 			}
   					 
   				 			break;
   				 			default:
   				 	}
   				 	
   					 break;
   				 	
   			 case 10:// Planta y coordenadas
   				 System.out.println();
   				 res=c1.mostrarPosicionXInt();
   				 res1=c1.mostrarPosicionYInt();
   				 res2=c1.mostrarPosicionZInt();
   				 System.out.println("Coordenada("+res+","+res1+")");
   				 System.out.println("Estás en la planta: "+res2);
   				 System.out.println();
   				 break;
   			 case 11:// Comandos
   				 System.err.println("Comandos para mover al jugador:\n" +
   								 " 1- mover derecha\n" +
   								 " 2- mover izquierda\n" +
   								 " 3- mover hacia delante\n" +
   								 " 4- mover hacia atrás\n" +
   								 " 5- subir una planta\n" +
   								 " 6- bajar una planta\n" +
   								 " 7- buscar diamantes\n" +
   								 " 8- huir\n" +
   								 " 9- pelear\n" +
   								 " 10-mostrar planta y coordenadas actuales del jugador\n" +
   								 " 11- mostrar una lista con todos los comandos\n" +
   								 " 12- mostrar número de turnos consumidos");
   				 System.out.println();
   				 break;
   			 case 12:// Turnos
   				 System.out.println("Los turnos que llevas consumidos son: " + contador);
   				 System.out.println();
   				 break;
   			 default:
   				 System.err.println("Se acabó tus oportunidades");
   			 }
   		 }
   		 System.out.println("Tus datos son: "+"turnos: "+contador+"\n"+"diamantes"+total+"\n"+"vida"+vida);
   	 }
    }

}
