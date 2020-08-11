package inventario;

import javax.swing.*;

public class MainInventario {


    public static void main (String [] arg){
        boolean salir = false;

        int opcion;
        Hardware hardware = new Hardware();

        Ventana myVentana = new Ventana();
        myVentana.setVisible(true);
        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Esta es la base de datos de hardware de Manuel " +
                            "\n1- Ver todos los productos que tengo" +
                            "\n2- Agregar producto" +
                            "\n3- Actualizar producto" +
                            "\n4- Borrar producto"+
                            "\n5- Salir" +
                            "\n6- Ventana"
            ));


            switch (opcion){

                case 1:

                    hardware.mostrarBaseDatos();


                    break;


                case 2:

                    Hardware hardware1 = new Hardware();
                    int objeto = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Cual es el obejo que hay que guardar " +
                                    "\n1- RAM" +
                                    "\n2- Placa base" +
                                    "\n3- Almacenamiento" +
                                    "\n4- Tarjeta grafica"+
                                    "\n5- tarjeta de sonico" +
                                    "\n6- Procesador" +
                                    "\n7- USB" +
                                    "\n8- Monitor" +
                                    "\n9- Teclado" +
                                    "\n10- Raton" +
                                    "\n11- Camara" +
                                    "\n12- Otro"
                    ));


                    switch (objeto){

                        case 1:
                            hardware1.setParte(Hardware.Parte.RAM);
                            break;
                        case 2:
                            hardware1.setParte(Hardware.Parte.PLACA_BASE);
                            break;

                        case 3:
                            hardware1.setParte(Hardware.Parte.ALMACENAMIENTO);
                            break;

                        case 4:
                            hardware1.setParte(Hardware.Parte.TARJETA_GRAFICA);
                            break;

                        case 5:
                            hardware1.setParte(Hardware.Parte.TARJETA_SONIDO);
                            break;

                        case 6:
                            hardware1.setParte(Hardware.Parte.PROCESADOR);
                            break;

                        case 7:
                            hardware1.setParte(Hardware.Parte.USB);
                            break;

                        case 8:
                            hardware1.setParte(Hardware.Parte.MONITOR);
                            break;

                        case 9:
                            hardware1.setParte(Hardware.Parte.TECLADO);
                            break;

                        case 10:
                            hardware1.setParte(Hardware.Parte.RATON);
                            break;

                        case 11:
                            hardware1.setParte(Hardware.Parte.CAMARA);
                            break;

                        case 12:
                            hardware1.setParte(Hardware.Parte.OTRO);
                            break;
                    }

                    String marca = JOptionPane.showInputDialog(null, "De que marca es ");
                    hardware1.setMarca(marca);
                    String modelo = JOptionPane.showInputDialog(null, "Que modelo es ");
                    hardware1.setModelo(modelo);
                    int capacidad =  Integer.parseInt(JOptionPane.showInputDialog(null, "De cuanto es la capacidad "));
                    hardware1.setCapacidad(capacidad);
                    hardware1.añadirObjeto(hardware1);
                    JOptionPane.showMessageDialog(null,  hardware1.toString());
                    break;




                case 3:

                    JOptionPane.showMessageDialog(null, "Parametro en pruebas");
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Parametro en pruebas");
                    break;



                case 5:
                    //Salir
                    JOptionPane.showMessageDialog(null, "Adiós!! :)");
                    salir = true;
                break;

                case 6:

                    System.out.println("Opcion en pruebas");
                    break;

            }
        }while (!salir);



    }


}
