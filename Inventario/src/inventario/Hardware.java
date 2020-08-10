package inventario;

import javax.swing.*;
import java.util.ArrayList;

public class Hardware {

    ArrayList<Hardware> BaseDatosHardware = new ArrayList();

    public enum Parte {
        RAM, PLACA_BASE, PROCESADOR, ALMACENAMIENTO, TARJETA_GRAFICA, TARJETA_SONIDO, USB, MONITOR, TECLADO, RATON, CAMARA, OTRO
    }

    private int capacidad, id = BaseDatosHardware.size()+1;;
    private String marca, modelo;
    Parte parte;

    public Hardware(){

    }


    public Hardware (int id, int capacidad, String marca, String modelo, Parte parte){

        this.id = id;
        this.capacidad = capacidad;
        this.marca = marca;
        this.modelo = modelo;
        this.parte = parte;

    }

    public void añadirObjeto(Hardware hardware){

        BaseDatosHardware.add(hardware);

    }


    public void mostrarBaseDatos(){

        for (int i=0; i<BaseDatosHardware.size(); i++){
            System.out.println(BaseDatosHardware.get(i));
        }

    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public Parte getParte() {
        return parte;
    }

    public void setParte(Parte parte) {
        this.parte = parte;
    }


    public String toString() {
        return "Hardware" +
                "Id= " + id +
                "\n capacidad= "  + capacidad +
                "\n marca= " + marca +
                "\n modelo= " + modelo +
                "\n parte= " + parte;
    }
}
