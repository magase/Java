package pokemonDDR;

import javax.crypto.Cipher;
import java.util.Scanner;

public class MainPokemonDDR {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        int opcion = 0, tipo1, tipo2, tipo3,  numTipos;
        do{

            System.out.println("Programa de tabla de tipos de DDR");
            System.out.println("1. Mostrar debilidades ");
            System.out.println("2. Mostrar eficacias ");
            System.out.println("3. Mostrar informacion del tipo ");
            System.out.println("4. Eficacia de un tipo a otro ");
            System.out.println("5. Salir ");
            System.out.println("Elige una opcion ");

            opcion = teclado.nextInt();

            switch (opcion){

                case 1://DEBILIDADES
                    do {
                        System.out.println("Elige el numero de tipo, 1 o 2");;
                        numTipos = teclado.nextInt();

                        if (!(numTipos == 1 || numTipos ==2)){
                            System.out.println("Tienes que introducir 1 o 2");

                        }
                    }while (!(numTipos == 1 || numTipos ==2));

                    tipo1 = elegirTipo(teclado);

                    if (numTipos == 2){

                        do{
                            tipo2 = elegirTipo(teclado);
                            if (tipo2 == tipo1){

                                System.out.println("Los tipos no pueden ser iguales");
                            }

                        }while (tipo2 == tipo1);


                        mostrarDebilidades(tipo1, tipo2);



                    }else {
                        mostrarDebilidades(tipo1);
                    }

                    break;

                case 2://EFICACES

                    tipo1 = elegirTipo(teclado);
                    mostrarEficaces(tipo1);

                    break;

                case 3://INFORMACIÓN
                    tipo1 = elegirTipo(teclado);
                    mostrarInfo(tipo1);
                    break;

                case 4://EFICACIA
                    do {
                        System.out.println("Elige el numero de tipos del oponente, 1 o 2");;
                        numTipos = teclado.nextInt();

                        if (!(numTipos == 1 || numTipos ==2)){
                            System.out.println("Tienes que introducir 1 o 2");

                        }
                    }while (!(numTipos == 1 || numTipos ==2));

                    System.out.println("Pokemon atacante");

                    tipo1 = elegirTipo(teclado);

                    System.out.println("Pokemon ponente tipo1 ");
                    tipo2 = elegirTipo(teclado);

                    if (numTipos == 2){
                        do{
                            tipo3 = elegirTipo(teclado);
                            if (tipo3 == tipo2){

                                System.out.println("Los tipos no pueden ser iguales");
                            }

                        }while (tipo2 == tipo3);

                        mostrarEficaciaTipo(tipo1, tipo2, tipo3);

                    }else{
                        mostrarDebilidades(tipo1, tipo2);

                    }
                    break;


                case 5://Terminar programa

                    salir = true;

                    break;

                default:
            }

        }
        while (!salir);
    }


    private static void listarTipos(){
        for (int i=0; i<Constantes.tiposPokemon.length; i++){
            System.out.println(i + ". " + Constantes.tiposPokemon[i] );
        }
    }


    public static int elegirTipo(Scanner sn){
        int eleccion;
        listarTipos();
        do {
            eleccion = sn.nextInt();
            if ( !(eleccion >=0 && eleccion <Constantes.tiposPokemon.length)){

                System.out.println("Tiene que estar entre 0 y 17");

            }



        }while ( !(eleccion >=0 && eleccion <Constantes.tiposPokemon.length));
        return eleccion;

    }


    /*
     * DEBILIDADES
     */

    public static void mostrarDebilidades(int tipo){

        for ( int i=0;i<Constantes.efectividadesPokemon.length;i++){

            if(Constantes.efectividadesPokemon [i][tipo] == Constantes.EFICACIA_EME ){
                System.out.println("- " + Constantes.tiposPokemon[i]);

            }
        }

    }

    public static void mostrarDebilidades(int tipo1, int tipo2){

        double efectividadFinal =0;

        for ( int i=0;i<Constantes.efectividadesPokemon.length;i++){

            efectividadFinal = Constantes.efectividadesPokemon [i][tipo1] * Constantes.efectividadesPokemon [i][tipo2];

            if(efectividadFinal <= Constantes.EFICACIA_EME ){
                System.out.println("- " + Constantes.tiposPokemon[i] + ": x" + (int)efectividadFinal);

            }
        }

    }

    /*
     * EFICACES
     */

    public static void mostrarEficaces(int tipo){

        for ( int i=0; i < Constantes.efectividadesPokemon.length; i++){

            if(Constantes.efectividadesPokemon [tipo][i] == Constantes.EFICACIA_EME ){
                System.out.println("- " + Constantes.tiposPokemon[i]);

            }
        }

    }
    /*
     * INFORMACIÓN
     */

    public static void mostrarInfo(int tipo){
        for ( int i=0; i < Constantes.efectividadesPokemon.length; i++) {
            System.out.println("- " + Constantes.tiposPokemon[i] + " " + mostrarEficacia(Constantes.efectividadesPokemon[tipo][i]));
        }
    }

    public static String mostrarEficacia (double eficacia){

        String mensaje;

        if (eficacia == Constantes.EFICACIA_DE){
            mensaje = Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_DE];
        }else  if (eficacia == Constantes.EFICACIA_EME){
            mensaje = Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_EME];
        }else  if (eficacia == Constantes.EFICACIA_NEUTRO){
            mensaje = Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_NEUTRO];
        }else  if (eficacia == Constantes.EFICACIA_NME){
            mensaje = Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_NME];
        }else  if (eficacia == Constantes.EFICACIA_DNE){
            mensaje = Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_DNE];
        }else  {
            mensaje = Constantes.MENSAJES_EFICACIAS[Constantes.INDICE_NA];
        }

        return mensaje;
    }

    public static void mostrarEficaciaTipo(int tipoAtacante, int tipoOponente){

        System.out.println(mostrarEficacia(Constantes.efectividadesPokemon[tipoAtacante][tipoOponente]));

    }

    public static void mostrarEficaciaTipo(int tipoAtacante, int tipo1Oponente, int tipo2Oponente){

        double efectividad = Constantes.efectividadesPokemon[tipoAtacante][tipo1Oponente] * Constantes.efectividadesPokemon[tipoAtacante][tipo2Oponente];
        System.out.println(mostrarEficacia(efectividad));

    }
}
