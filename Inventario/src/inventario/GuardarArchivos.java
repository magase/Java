package inventario;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public interface GuardarArchivos {

    static ArrayList<Hardware> BaseDatosHardware = new ArrayList<Hardware>();

    //bucle for para el id de los datos
    static int idHardware(){
        int id;

        for (id =0; id <=BaseDatosHardware.size(); id++)
        id=BaseDatosHardware.size();

        return id;
    }

    //Se crean los items del array
    static void crearHardware() {

        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Que Capacidad tiene?"));//teclado.nextInt();

        String marca =JOptionPane.showInputDialog("Que Marca es?");// teclado.nextLine();

        String modelo = JOptionPane.showInputDialog("Que modelo es?");//teclado.nextLine();

        String producto = JOptionPane.showInputDialog("Que producto es?");//teclado.nextLine();
        Hardware hardware = new Hardware(idHardware(), capacidad, marca, modelo, producto);

        JOptionPane.showMessageDialog(null, hardware.toString());
        BaseDatosHardware.add(hardware);

    }

    //Mostrar Base de datos
     static void mostrarArray(){
        for (int i=0; i<BaseDatosHardware.size();i++){
            JOptionPane.showMessageDialog(null, BaseDatosHardware.get(i).toString());
        }

     }

    }


